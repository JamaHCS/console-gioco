package com.gioco.controller;

import com.gioco.controller.DAO.ProductDAO;
import com.gioco.view.CreateProduct;

import static com.gioco.controller.DAO.ProductDAO.removeProduct;
import static com.gioco.controller.DAO.ProductDAO.searchProduct;


/**
 * Clase encargada de manejar la lógica de la pantalla del menú de manejo de productos.
 */
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
                System.out.println(searchProduct(Tools.getId()));
                break;
            case 4:
                removeProduct(Tools.getId());
                break;
        }
    }
}
