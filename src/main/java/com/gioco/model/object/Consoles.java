package com.gioco.model.object;

import com.gioco.controller.Tools;

/**
 * Clase propia del producto a vender tipo consola.
 */
public class Consoles extends Product {
    private String model;
    private float capacity;
    private String details;

    public Consoles() {
    }

    public Consoles(String parameter) {
        super(parameter);
    }

    public Consoles(String productName, float productCost, float productPrice, int productStock, String brand, String platform, String model, float capacity, String details) {
        super(productName, productCost, productPrice, productStock, brand, platform);
        this.model = model;
        this.capacity = capacity;
        this.details = details;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public Product generateProduct() {
        Tools.padding();
        Tools.printTitle("Gioco - Agregando producto: Consola");

        String productName = Tools.getString("nombre del producto");
        float productCost = Tools.getFloat("costo del producto");
        float productPrice = Tools.getFloat("precio del producto");
        int productStock = Tools.getInt("stock");
        String brand = Tools.getString("marca");
        String platform = Tools.getString("plataforma");

        String model = Tools.getString("modelo");
        float capacity = Tools.getFloat("capacidad");
        String details = Tools.getString("detalles");

        return new Consoles(productName, productCost, productPrice, productStock, brand, platform, model, capacity, details);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nModelo: " + this.model +
                ".\nCapacidad: " + this.capacity +
                ".\nDetalles: " + this.details + ".";
    }
}
