package com.gioco.model.object;

import com.gioco.controller.Tools;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static com.gioco.controller.Tools.ANSI_PURPLE;
import static com.gioco.controller.Tools.ANSI_RESET;

public class Sale {
    private static int it = 1;
    private int id;
    private Date dateOfSale;
    private String branchOffice;
    private String status = "Vendido";
    private double subTotal;
    private double taxes;
    private double total;
    public ArrayList<SaleProduct> products = new ArrayList<>();

    public Sale() {
        id = it;
        it++;
    }

    public Sale(String s) {
    }

    public Sale(Date dateOfSale, String branchOffice) {
        this.dateOfSale = dateOfSale;
        this.branchOffice = branchOffice;
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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getTotal() {
        return total;
    }

    public double generateTotal() {
        double total = 0;
        for (SaleProduct s : this.products) {
            total += s.getPrice();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<SaleProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<SaleProduct> products) {
        this.products = products;
    }

    public boolean collect() {
        Tools.padding();
        System.out.println("Favor de cobrar la cantidad de: $" + this.getTotal());
        Scanner theScanner = new Scanner(System.in);
        System.out.println("1.- Cobrar");
        System.out.println("0.- Cancelar venta");
        int option = Tools.getOption();

        if (option == 1) {
            System.out.println(Tools.ANSI_GREEN + "Cobrado. Venta generada." + ANSI_RESET);
            return true;
        } else {
            it--;
            System.out.println(ANSI_PURPLE + "Venta cancelada." + ANSI_RESET);
            return false;
        }
    }
}