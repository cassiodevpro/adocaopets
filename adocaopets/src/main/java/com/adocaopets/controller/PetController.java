package com.adocaopets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adocaopets.model.Pet;
import com.adocaopets.service.PetService;



 @RestController
 @RequestMapping("api/pets")
 @CrossOrigin(origins = "*")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/listar-todos")
    public ResponseEntity<List<Pet>> listarTodos() {
         List<Pet> pets = petService.listarTodos();         
        return ResponseEntity.ok(pets);
    }
    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable Integer id) {
        return ((Optional<Pet>) petService.buscarPorId(id))
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Pet pet) {
        Pet novoPet = petService.criar(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        petService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
