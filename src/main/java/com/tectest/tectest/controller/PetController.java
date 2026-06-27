package com.tectest.tectest.controller;

import com.tectest.tectest.model.PetCreateResponse;
import com.tectest.tectest.model.PetRequest;
import com.tectest.tectest.model.PetResponse;
import com.tectest.tectest.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/{petId}")
    public ResponseEntity<PetResponse> getPet(@PathVariable Long petId) {
        PetResponse response = petService.getPet(petId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<PetCreateResponse> createPet(@RequestBody PetRequest request) {
        PetCreateResponse response = petService.createPet(request);
        return ResponseEntity.ok(response);
    }
}
