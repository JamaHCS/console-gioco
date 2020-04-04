package com.gioco.model.object;

import com.gioco.controller.Tools;

public class Videogames extends Product {
    private String esrb;
    private String gameType;
    private int numberOfPlayers;
    private String studio;

    public Videogames() {
    }

    public Videogames(String productName, float productCost, float productPrice, int productStock, String brand, String platform, String esrb, String gameType, int numberOfPlayers, String studio) {
        super(productName, productCost, productPrice, productStock, brand, platform);
        this.esrb = esrb;
        this.gameType = gameType;
        this.numberOfPlayers = numberOfPlayers;
        this.studio = studio;
    }

    public String getEsrb() {
        return esrb;
    }

    public void setEsrb(String esrb) {
        this.esrb = esrb;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public Product generateProduct() {
        Tools.printTitle("Gioco - Agregando producto: Videojuego");

        String productName = Tools.getString("nombre del producto");
        float productCost = Tools.getFloat("costo del producto");
        float productPrice = Tools.getFloat("precio del producto");
        int productStock = Tools.getInt("stock");
        String brand = Tools.getString("marca");
        String platform = Tools.getString("plataforma");

        String esrb = Tools.getString("clasificación esrb");
        String gameType = Tools.getString("tipo de juego");
        int numberOfPlayers = Tools.getInt("número en stock");
        String studio = Tools.getString("estudio desarrollador");

        return new Videogames(productName, productCost, productPrice, productStock, brand, platform, esrb, gameType, numberOfPlayers, studio);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nESRB: " + this.esrb +
                ".\nTipo de juego: " + this.gameType +
                ".\nNumero de jugadores: " + this.numberOfPlayers +
                ".\nEstudio: " + this.studio + ".";
    }
}
