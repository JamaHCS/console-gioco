package com.gioco.view;

import com.gioco.controller.CManageSale;
import com.gioco.controller.Tools;

/**
 * Clase encargada de mostrar el menú de las venta.
 */
public class ManageSale implements IVisualizable {
    private int option = 0;

    @Override
    public void show() {
        do {
            Tools.padding();
            Tools.printTitle("Gioco - Administrar ventas.");
            System.out.println("1.- Nueva venta");
            System.out.println("2.- Mostrar ventas");
            System.out.println("3.- Eliminar venta");
            System.out.println("0.- Regresar");

            option = Tools.getOption();
            Tools.validateOption(0, 3, option);

            CManageSale cManageSale = new CManageSale(option);
            cManageSale.controller();
        } while (option != 0);
    }
}
