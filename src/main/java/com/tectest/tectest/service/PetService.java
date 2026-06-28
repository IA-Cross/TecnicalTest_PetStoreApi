package com.tectest.tectest.service;

import com.tectest.tectest.client.PetStoreClient;
import com.tectest.tectest.model.PetCreateResponse;
import com.tectest.tectest.model.PetRequest;
import com.tectest.tectest.model.PetResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

/** Service layer handling business logic, console logging, and response enrichment. */
@Service
public class PetService {

    private final PetStoreClient petStoreClient;

    public PetService(PetStoreClient petStoreClient) {
        this.petStoreClient = petStoreClient;
    }
    /** Retrieves a pet by ID and logs the result to the console. */
    public PetResponse getPet(Long petId) {
        PetResponse pet = petStoreClient.getPetById(petId);
        System.out.println("Pet found: id=" + pet.getId()
                + ", name=" + pet.getName()
                + ", status=" + pet.getStatus());
        return pet;
    }
    /** Creates a pet and returns an enriched response with transactionId and dateCreated. */
    public PetCreateResponse createPet(PetRequest request) {
        PetResponse pet = petStoreClient.createPet(request);
        System.out.println("Pet created: id=" + pet.getId()
                + ", name=" + pet.getName()
                + ", status=" + pet.getStatus());

        PetCreateResponse response = new PetCreateResponse();
        response.setTransactionId(UUID.randomUUID().toString());
        response.setDateCreated(LocalDateTime.now().toString());
        response.setStatus(pet.getStatus());
        response.setName(pet.getName());
        return response;
    }
}
