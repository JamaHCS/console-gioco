package com.gioco.model.repository;

import com.gioco.model.object.Consoles;
import com.gioco.model.object.Product;
import com.gioco.model.object.Videogames;

import java.util.ArrayList;

public class ProductRepo implements IFilleable {
    public static ArrayList<Product> products = new ArrayList<>();

    private Consoles xboxOne = new Consoles();
    private Videogames halo5 = new Videogames();

    public ProductRepo() {
        this.fillData();
        products.add(xboxOne);
        products.add(halo5);
    }

    public void fillData() {
        xboxOne.setProductName("Xbox One");
        xboxOne.setProductCost(4000);
        xboxOne.setProductPrice(6000);
        xboxOne.setProductStock(5);
        xboxOne.setBrand("Microsoft");
        xboxOne.setPlatform("Xbox");
        xboxOne.setCapacity(1024);
        xboxOne.setModel("Slim");

        halo5.setProductName("Halo 5: Guardians");
        halo5.setProductCost(800);
        halo5.setProductPrice(1400);
        halo5.setProductStock(5);
        halo5.setBrand("Microsoft Game Studios");
        halo5.setPlatform("Xbox");
        halo5.setEsrb("Mature");
        halo5.setGameType("Acciónn");
        halo5.setNumberOfPlayers(1);
        halo5.setStudio("343 Industries");
    }

}
