package com.adocaopets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adocaopets.model.Pet;
import com.adocaopets.repository.PetRepository;



@Service
public class PetService {

  @Autowired
  private PetRepository petRepository;

    public List<Pet> listarTodos() {
        return petRepository.findAll();
    }

    public Object buscarPorId(Integer id) {
        return petRepository.findById(id);        
       
    }

    public Pet criar(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletar(Integer id) {
        petRepository.deleteById(id);
    }
  
  
}
