package com.gioco.controller;


import com.gioco.model.object.Accesories;
import com.gioco.model.object.Consoles;
import com.gioco.model.object.Souvenirs;
import com.gioco.model.object.Videogames;

import static com.gioco.controller.CManageStock.productDAO;

public class CCreateProduct implements IController {
    private int optionSelected;

    public CCreateProduct(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    @Override
    public void controller() {
        switch (optionSelected) {
            case 1:
                productDAO.addProduct(new Consoles().generateProduct());
                break;
            case 2:
                productDAO.addProduct(new Videogames().generateProduct());
                break;
            case 3:
                productDAO.addProduct(new Accesories().generateProduct());
                break;
            case 4:
                productDAO.addProduct(new Souvenirs().generateProduct());
                break;
        }
    }
}
