package com.stmc.sfgpetclinic5.services;

import com.stmc.sfgpetclinic5.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
