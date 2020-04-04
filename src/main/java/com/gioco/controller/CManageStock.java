package com.gioco.controller;

import com.gioco.controller.DAO.ProductDAO;
import com.gioco.view.CreateProduct;

public class CManageStock implements IController {
    private int optionSelected;
    public static ProductDAO productDAO = new ProductDAO();

    public CManageStock(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    @Override
    public void controller() {
        switch (optionSelected) {
            case 1:
                CreateProduct createProduct = new CreateProduct();
                createProduct.show();
                break;
            case 2:
                System.out.println(productDAO.toString());
                break;
            case 3:
                System.out.println(productDAO.searchProduct(Tools.getId()));
                break;
            case 4:
                productDAO.removeProduct(Tools.getId());
                break;
        }
    }
}
