package com.tectest.tectest.model;

/** DTO for the POST /api/pet response, enriched with transactionId and dateCreated. */
public class PetCreateResponse {
    private String transactionId;
    private String dateCreated;
    private String status;
    private String name;

    public PetCreateResponse() {

    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
