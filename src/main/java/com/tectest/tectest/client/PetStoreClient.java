package com.tectest.tectest.client;

import com.tectest.tectest.model.PetRequest;
import com.tectest.tectest.model.PetResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class PetStoreClient {

    private final RestTemplate restTemplate;
    private static final String BASE_URL = "https://petstore.swagger.io/v2";

    public PetStoreClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PetResponse getPetById(Long petId) {
        String url = BASE_URL + "/pet/" + petId;
        return restTemplate.getForObject(url, PetResponse.class);
    }

    public PetResponse createPet(PetRequest request) {
        String url = BASE_URL + "/pet";
        return restTemplate.postForObject(url, request, PetResponse.class);
    }
}