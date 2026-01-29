package com.stmc.sfgpetclinic5.services;

import com.stmc.sfgpetclinic5.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
