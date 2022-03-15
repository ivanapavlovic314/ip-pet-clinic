package com.springframework.ippetclinic.repositories;

import com.springframework.ippetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository <Vet, Long> {
}