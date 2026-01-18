package com.stmc.sfgpetclinic5.services;

import com.stmc.sfgpetclinic5.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
