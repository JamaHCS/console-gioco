package com.gioco.model.object;

import com.gioco.controller.Tools;

public class Souvenirs extends Product {
    private String type;
    private String collectionOf;
    private String details;

    public Souvenirs() {
    }

    public Souvenirs(String productName, float productCost, float productPrice, int productStock, String brand, String platform, String type, String collectionOf, String details) {
        super(productName, productCost, productPrice, productStock, brand, platform);
        this.type = type;
        this.collectionOf = collectionOf;
        this.details = details;
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


    @Override
    public Product generateProduct() {
        Tools.printTitle("Gioco - Agregando producto: Souvenir");

        String productName = Tools.getString("nombre del producto");
        float productCost = Tools.getFloat("costo del producto");
        float productPrice = Tools.getFloat("precio del producto");
        int productStock = Tools.getInt("stock");
        String brand = Tools.getString("marca");
        String platform = Tools.getString("plataforma");

        String type = Tools.getString("tipo");
        String collection = Tools.getString("colección");
        String details = Tools.getString("detalles");

        return new Souvenirs(productName, productCost, productPrice, productStock, brand, platform, type, collection, details);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: " + this.type +
                ".\nColección: " + this.collectionOf +
                ".\nDetalles: " + this.details + ".";
    }
}
