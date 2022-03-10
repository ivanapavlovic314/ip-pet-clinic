package com.springframework.ippetclinic.repositories;

import com.springframework.ippetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
