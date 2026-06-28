package com.tectest.tectest.client;

import com.tectest.tectest.model.PetRequest;
import com.tectest.tectest.model.PetResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/** Client that consumes the external Swagger Petstore API. */
@Component
public class PetStoreClient {

    private final RestTemplate restTemplate;
    private static final String BASE_URL = "https://petstore.swagger.io/v2";

    public PetStoreClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    /** Fetches a pet by ID from the Petstore API. */
    public PetResponse getPetById(Long petId) {
        String url = BASE_URL + "/pet/" + petId;
        return restTemplate.getForObject(url, PetResponse.class);
    }
    /** Creates a new pet in the Petstore API. */
    public PetResponse createPet(PetRequest request) {
        String url = BASE_URL + "/pet";
        return restTemplate.postForObject(url, request, PetResponse.class);
    }
}