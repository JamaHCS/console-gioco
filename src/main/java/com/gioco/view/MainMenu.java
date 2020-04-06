package com.gioco.view;

import com.gioco.controller.CMainMenu;
import com.gioco.controller.Tools;

/**
 * Clase que se encarga de visualizar el menú pricipal.
 */

public class MainMenu implements IVisualizable {
    private int option = 0;
    private int optionArray[] = new int[4];


    @Override
    public void show() {
        for (int i = 0; i < 4; i++) {
            optionArray[i] = i;
        }


        do {
            Tools.padding();
            Tools.printTitle("Gioco - Tienda de videojuegos");
            System.out.println("Selecciona la opción deseada.\n");
            System.out.println(optionArray[1] + ".- Administrar Artículos");
            System.out.println(optionArray[2] + ".- Administrar Clientes");
            System.out.println(optionArray[3] + ".- Administrar ventas");
            System.out.println(optionArray[0] + ".- Salir");

            option = Tools.getOption();
            Tools.validateOption(0, 3, option);

            CMainMenu cMainMenu = new CMainMenu(option);
            cMainMenu.controller();
        } while (option != 0);

    }
}
