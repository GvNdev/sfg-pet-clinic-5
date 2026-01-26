package com.stmc.sfgpetclinic5.services.impl;

import com.stmc.sfgpetclinic5.model.Specialty;
import com.stmc.sfgpetclinic5.model.Vet;
import com.stmc.sfgpetclinic5.services.SpecialtyService;
import com.stmc.sfgpetclinic5.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceImpl extends AbstractServiceImpl<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceImpl(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
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
