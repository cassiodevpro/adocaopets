package com.adocaopets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adocaopets.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
