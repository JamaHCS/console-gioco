package com.gioco.model.object;

public abstract class Product {
    private static int it = 1;
    private int productId;
    private String productName;
    private float productCost;
    private float productPrice;
    private int productStock;
    private String brand;
    private String platform;

    public Product() {
        this.productId = it;
        it++;
    }

    public Product(String productName, float productCost, float productPrice, int productStock, String brand, String platform) {
        this.productName = productName;
        this.productCost = productCost;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.brand = brand;
        this.platform = platform;
        this.productId = it;
        it++;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public float getProductCost() {
        return productCost;
    }

    public void setProductCost(float productCost) {
        this.productCost = productCost;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Product generateProduct() {
        return new Product() {
            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };
    }

    @Override
    public String toString() {
        return "Id: " + this.productId +
                ".\nNombre: " + this.productName +
                ".\nCosto: " + this.productCost +
                ".\nPrecio: " + this.productPrice +
                ".\nStock: " + this.productStock +
                ".\nMarca: " + this.brand + '\'' +
                ".\nPlataforma: " + this.platform + ".";
    }
}
