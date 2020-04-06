package com.gioco.model.object;

import com.gioco.controller.Tools;
/**
 * Clase propia del producto a vender tipo accesorio.
 */
public class Accesories extends Product {
    private String typeOf;
    private String details;

    public Accesories() {
    }

    public Accesories(String parameter) {
        super(parameter);
    }

    public Accesories(String productName, float productCost, float productPrice, int productStock, String brand, String platform, String typeOf, String details) {
        super(productName, productCost, productPrice, productStock, brand, platform);
        this.typeOf = typeOf;
        this.details = details;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setType(String type) {
        this.typeOf = type;
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
        Tools.printTitle("Gioco - Agregando producto: Accesorio");

        String productName = Tools.getString("nombre del producto");
        float productCost = Tools.getFloat("costo del producto");
        float productPrice = Tools.getFloat("precio del producto");
        int productStock = Tools.getInt("stock");
        String brand = Tools.getString("marca");
        String platform = Tools.getString("plataforma");

        String type = Tools.getString("tipo");
        String details = Tools.getString("detalles");

        return new Accesories(productName, productCost, productPrice, productStock, brand, platform, type, details);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: " + this.typeOf +
                "-\nDetalles: " + this.details + ".";
    }
}
