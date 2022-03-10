package com.springframework.ippetclinic.repositories;

import com.springframework.ippetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
