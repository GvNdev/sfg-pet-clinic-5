package com.stmc.sfgpetclinic5.services.impl;

import com.stmc.sfgpetclinic5.model.Visit;
import com.stmc.sfgpetclinic5.services.VisitService;

import java.util.Set;

public class VisitServiceImpl extends AbstractServiceImpl<Visit, Long> implements VisitService {
    private final VisitService visitService;

    public VisitServiceImpl(VisitService visitService) {
        this.visitService = visitService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        if (object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null || object.getPet().getOwner() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
