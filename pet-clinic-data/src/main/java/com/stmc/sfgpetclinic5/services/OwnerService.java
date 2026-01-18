package com.stmc.sfgpetclinic5.services;

import com.stmc.sfgpetclinic5.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
