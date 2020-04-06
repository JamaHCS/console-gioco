package com.gioco.view;

import com.gioco.controller.CCreateProduct;
import com.gioco.controller.Tools;


/**
 * Clase encargada de la visualización del menú para crear nuevo producto.
 */
public class CreateProduct implements IVisualizable {
    private int option = 0;

    @Override
    public void show() {
        do {
            Tools.padding();
            Tools.printTitle("Gioco - Selecciona un tipo de producto.");
            System.out.println("\n1.- Consola.");
            System.out.println("2.- Videojuego.");
            System.out.println("3.- Accesorio.");
            System.out.println("4.- Souvenir.");
            System.out.println("0.- Regresar.");

            option = Tools.getOption();
            Tools.validateOption(0, 4, option);

            CCreateProduct cCreateProduct = new CCreateProduct(option);
            cCreateProduct.controller();
        } while (option != 0);
    }
}
