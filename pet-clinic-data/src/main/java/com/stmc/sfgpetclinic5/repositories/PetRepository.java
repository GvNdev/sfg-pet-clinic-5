package com.stmc.sfgpetclinic5.repositories;

import com.stmc.sfgpetclinic5.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
