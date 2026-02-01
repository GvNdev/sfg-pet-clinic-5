package com.stmc.sfgpetclinic5.services.impl;

import com.stmc.sfgpetclinic5.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PetServiceImplTest {
    private PetServiceImpl petService;

    private final Long petId = 1L;

    @BeforeEach
    void setUp() {
        petService = new PetServiceImpl();
        petService.save(Pet.builder().id(petId).build());
    }

    @Test
    void findAll() {
        Set<Pet> pets = petService.findAll();
        assertEquals(1, pets.size());
    }

    @Test
    void findByExistingId() {
        Pet pet = petService.findById(petId);
        assertEquals(petId, pet.getId());
    }

    @Test
    void findByNotExistingId() {
        Pet pet = petService.findById(2L);
        assertNull(pet);
    }

    @Test
    void findByNullId() {
        Pet pet = petService.findById(null);
        assertNull(pet);
    }

    @Test
    void saveNewId() {
        Long newId = 2L;
        Pet pet = Pet.builder().id(newId).build();
        Pet savedPet = petService.save(pet);
        assertEquals(newId, savedPet.getId());
    }

    @Test
    void saveDuplicatedId() {
        Long duplicatedId = 1L;
        Pet pet = Pet.builder().id(duplicatedId).build();
        Pet savedPet = petService.save(pet);
        assertEquals(duplicatedId, savedPet.getId());
        assertEquals(1, petService.findAll().size());
    }

    @Test
    void saveNoId() {
        Pet savedPet = petService.save(Pet.builder().build());

        assertNotNull(savedPet);
        assertNotNull(savedPet.getId());
        assertEquals(2, petService.findAll().size());
    }

    @Test
    void delete() {
        petService.delete(petService.findById(petId));
        assertEquals(0, petService.findAll().size());
    }

    @Test
    void deleteWrongId() {
        Pet savedPet = petService.save(Pet.builder().id(2L).build());
        petService.delete(savedPet);
        assertEquals(1, petService.findAll().size());
    }

    @Test
    void deleteNullId() {
        Pet pet = Pet.builder().build();
        petService.delete(pet);
        assertEquals(1, petService.findAll().size());
    }

    @Test
    void deleteNull() {
        petService.delete(null);
        assertEquals(1, petService.findAll().size());
    }
}