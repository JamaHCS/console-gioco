package com.gioco.view;

import com.gioco.controller.CManageStock;
import com.gioco.controller.Tools;

public class ManageStock implements IVisualizable {
    private int option = 0;

    @Override
    public void show() {
        do {
            Tools.padding();
            Tools.printTitle("Gioco - Administrar artículos");
            System.out.println("Selecciona la opción deseada.\n");
            System.out.println("1.- Crear artículos");
            System.out.println("2.- Ver artículos");
            System.out.println("3.- Buscar artículos");
            System.out.println("4.- Editar artículos");
            System.out.println("5.- Borrar artículos");
            System.out.println("0.- Regresar");

            option = Tools.getOption();
            Tools.validateOption(0, 5, option);

            CManageStock cManageStock = new CManageStock(option);
            cManageStock.controller();
        } while (option != 0);
    }
}
