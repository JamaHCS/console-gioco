package com.gioco.controller;

import com.gioco.model.repository.ClientRepo;
import com.gioco.model.repository.ProductRepo;
import com.gioco.view.ManageClient;
import com.gioco.view.ManageStock;

public class CMainMenu implements IController {
    private int optionSelected;
    public static ProductRepo productRepo = new ProductRepo();
    public static ClientRepo clientRepo = new ClientRepo();

    public CMainMenu(int option) {
        this.optionSelected = option;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
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
                break;
        }
    }
}
