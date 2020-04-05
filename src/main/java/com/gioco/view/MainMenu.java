package com.gioco.view;

import com.gioco.controller.CMainMenu;
import com.gioco.controller.Tools;

import java.util.Date;

public class MainMenu implements IVisualizable {
    private int option = 0;

    @Override
    public void show() {
        do {
            Tools.padding();
            Tools.printTitle("Gioco - Tienda de videojuegos");
            System.out.println("Selecciona la opción deseada.\n");
            System.out.println("1.- Administrar Artículos");
            System.out.println("2.- Administrar Clientes");
            System.out.println("3.- Administrar ventas");
            System.out.println("0.- Salir");

            option = Tools.getOption();
            Tools.validateOption(0, 3, option);

            CMainMenu cMainMenu = new CMainMenu(option);
            cMainMenu.controller();
        } while (option != 0);

    }
}
