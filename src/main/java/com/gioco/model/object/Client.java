package com.gioco.model.object;

public class Client extends User {
    private String rfc;
    private String curp;
    private double points;
    private String street;
    private int exteriorN;
    private int interiorN;
    private int postalCode;
    private String colony;

    public Client() {
    }


    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getExteriorN() {
        return exteriorN;
    }

    public void setExteriorN(int exteriorN) {
        this.exteriorN = exteriorN;
    }

    public int getInteriorN() {
        return interiorN;
    }

    public void setInteriorN(int interiorN) {
        this.interiorN = interiorN;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }
}
