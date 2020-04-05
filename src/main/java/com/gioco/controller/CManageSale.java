package com.gioco.controller;

import com.gioco.controller.DAO.SaleDAO;

public class CManageSale implements IController {
    private int optionSelected;
    public static SaleDAO saleDAO = new SaleDAO();

    public CManageSale(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    @Override
    public void controller() {
        switch (optionSelected) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
