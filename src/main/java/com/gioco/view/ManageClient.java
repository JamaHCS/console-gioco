package com.gioco.view;

import com.gioco.controller.CManageClient;
import com.gioco.controller.Tools;

public class ManageClient implements IVisualizable {
    private int option = 0;

    @Override
    public void show() {
        do {
            Tools.padding();
            Tools.printTitle("Gioco - Administrar clientes.");
            System.out.println("1.- Cliente nuevo");
            System.out.println("2.- Ver clientes");
            System.out.println("3.- Buscar cliente");
            System.out.println("4.- Eliminar cliente");
            System.out.println("0.- Regresar");

            option = Tools.getOption();
            Tools.validateOption(0, 4, option);

            CManageClient cManageClient = new CManageClient(option);
            cManageClient.controller();
        } while (option != 0);
    }
}
