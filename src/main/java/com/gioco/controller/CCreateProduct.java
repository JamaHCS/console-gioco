package com.gioco.controller;


import com.gioco.controller.DAO.ProductDAO;
import com.gioco.model.object.Accesories;
import com.gioco.model.object.Consoles;
import com.gioco.model.object.Souvenirs;
import com.gioco.model.object.Videogames;

import static com.gioco.controller.CManageStock.productDAO;

public class CCreateProduct implements IController {
    private int optionSelected;
    private Consoles console = new Consoles();
    private Souvenirs souvenir = new Souvenirs();
    private Videogames videogame = new Videogames();
    private Accesories accesorie = new Accesories();

    public CCreateProduct(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    @Override
    public void controller() {
        switch (optionSelected) {
            case 1:
                productDAO.addProduct(console.generateProduct());
                break;
            case 2:
                productDAO.addProduct(videogame.generateProduct());
                break;
            case 3:
                productDAO.addProduct(accesorie.generateProduct());
                break;
            case 4:
                productDAO.addProduct(souvenir.generateProduct());
                break;
        }
    }
}
