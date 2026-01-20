package com.stmc.sfgpetclinic5.services.impl;

import com.stmc.sfgpetclinic5.model.Pet;
import com.stmc.sfgpetclinic5.services.CrudService;

import java.util.Set;

public class PetServiceImpl extends AbstractServiceImpl<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
