package com.springframework.ippetclinic.services;

import com.springframework.ippetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
