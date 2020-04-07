package com.gioco.model.object;

/**
 * Clase encargada de generar la "venta" individual por producto de nuestra venta.
 */
public class SaleProduct {

    private int saleId;
    private int productId;
    private int quantity;
    public Product product;
    private float price;

    public SaleProduct() {
    }

    public SaleProduct(int saleId, int productId, int quantity, Product product) {
        this.saleId = saleId;
        this.productId = productId;
        this.quantity = quantity;
        this.product = product;
        this.price = product.getProductPrice();
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "\nCant: " + this.getQuantity() +
                "\n    " + this.product.getProductName() + "   ||   P. unitario: $" + this.product.getProductPrice();
    }
}

