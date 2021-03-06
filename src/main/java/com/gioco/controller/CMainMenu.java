package com.gioco.controller;

import com.gioco.model.repository.ClientRepo;
import com.gioco.model.repository.ProductRepo;
import com.gioco.view.ManageClient;
import com.gioco.view.ManageSale;
import com.gioco.view.ManageStock;


/**
 * Clase encargada del control de la lógica del menú principal
 */
public class CMainMenu implements IController {
    private int optionSelected;
    public static ProductRepo productRepo = new ProductRepo();
    public static ClientRepo clientRepo = new ClientRepo();

    public CMainMenu(int option) {
        this.optionSelected = option;
    }

    public void controller() {
        switch (optionSelected) {
            case 1:
                ManageStock manageStock = new ManageStock();
                manageStock.show();
                break;
            case 2:
                ManageClient manageClient = new ManageClient();
                manageClient.show();
                break;
            case 3:
                ManageSale manageSale = new ManageSale();
                manageSale.show();
                break;
        }
    }
}
