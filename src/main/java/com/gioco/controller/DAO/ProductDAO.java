package com.gioco.controller.DAO;

import com.gioco.model.object.Product;

import static com.gioco.controller.Tools.*;
import static com.gioco.model.repository.ProductRepo.products;

public class ProductDAO {
    public void addProduct(Product product) {
        products.add(product);
    }

    public Product searchProduct(int id) {
        Product product = null;

        for (Product p : products) {
            if (p.getProductId() == id) {
                product = p;
            }
        }

        if (product == null) {
            System.out.println(ANSI_RED + "Producto no encontrado." + ANSI_RESET);
        }
        return product;
    }

    public void removeProduct(int id) {
        if (products.removeIf(p -> p.getProductId() == id)) {
            System.out.println(ANSI_YELLOW + "Eliminado." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Producto no encontrado." + ANSI_RESET);
        }
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (Product p : products) {
            toReturn += "\n\n" + p.toString();
        }
        return toReturn;
    }
}
