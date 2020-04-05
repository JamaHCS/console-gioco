package com.gioco.controller.DAO;

import com.gioco.controller.CLogin;
import com.gioco.controller.Tools;
import com.gioco.model.object.Sale;
import com.gioco.model.object.SaleProduct;

import java.util.Date;
import java.util.Scanner;

import static com.gioco.controller.CManageStock.productDAO;
import static com.gioco.model.repository.SaleRepo.sales;

public class SaleDAO {
    public Sale newSale() {
        Tools.padding();
        Tools.printTitle("Gioco - Nueva venta.");

        Sale sale = new Sale();
        String option = "";

        do {
            System.out.println(productDAO.toString());
            Tools.padding();
            System.out.println("Seleccione el producto a vender.");
            int idProduct = Tools.getId();
            int quantity = Tools.getInt("cantidad");
            sale.products.add(new SaleProduct(sale.getId(), idProduct, quantity, productDAO.searchProduct(idProduct)));

            System.out.println("Desea ingresar otro articulo a la venta? y/n");
            Scanner theScanner = new Scanner(System.in);
            option = theScanner.nextLine();
        } while (!option.equals("y"));

        Date date = new Date();
        sale.setDateOfSale(date);
        sale.setBranchOffice(CLogin.userLoged.getBranch());
        sale.setTotal(sale.generateTotal());
        sale.setSubTotal((sale.getTotal() - (sale.getTotal() * 0.16)));
        sale.setTaxes(sale.getTotal() * 0.16);

        return sale;
    }
}
