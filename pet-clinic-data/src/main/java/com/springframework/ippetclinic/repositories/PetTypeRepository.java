package com.springframework.ippetclinic.repositories;

import com.springframework.ippetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}