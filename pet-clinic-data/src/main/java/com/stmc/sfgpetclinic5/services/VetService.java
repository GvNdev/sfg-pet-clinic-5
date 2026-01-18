package com.stmc.sfgpetclinic5.services;

import com.stmc.sfgpetclinic5.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
