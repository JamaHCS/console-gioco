package com.gioco.controller;

import com.gioco.model.repository.ProductRepository;
import com.gioco.view.ManageStock;

public class CMainMenu implements IController {
    private int optionSelected;
    public static ProductRepository productRepository = new ProductRepository();

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
                break;
            case 3:
                break;
        }
    }
}
