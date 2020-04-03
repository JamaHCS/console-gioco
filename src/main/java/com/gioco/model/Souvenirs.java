package com.gioco.model;

public class Souvenirs extends Product {
    private String type;
    private String collectionOf;
    private String details;

    public Souvenirs() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCollectionOf() {
        return collectionOf;
    }

    public void setCollectionOf(String collectionOf) {
        this.collectionOf = collectionOf;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
