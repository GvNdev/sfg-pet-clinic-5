package com.stmc.sfgpetclinic5.services.impl;

import com.stmc.sfgpetclinic5.model.Vet;
import com.stmc.sfgpetclinic5.services.CrudService;

import java.util.Set;

public class VetServiceImpl extends AbstractServiceImpl<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        this.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }
}
