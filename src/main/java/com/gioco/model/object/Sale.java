package com.gioco.model.object;

import java.util.ArrayList;
import java.util.Date;

public class Sale {
    private int id;
    private Date dateOfSale;
    private String branchOffice;
    private String status;
    private float subTotal;
    private float taxes;
    private float total;
    private ArrayList<SaleProduct> products = new ArrayList<>();

    public Sale() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String getBranchOffice() {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<SaleProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<SaleProduct> products) {
        this.products = products;
    }
}