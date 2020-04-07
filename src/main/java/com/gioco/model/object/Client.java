package com.gioco.model.object;

import com.gioco.controller.Tools;

/**
 * Clase propia del objeto cliente.
 */
public class Client extends User {
    private String rfc;
    private String curp;
    private double points = 0;
    private String street;
    private int exteriorN;
    private int interiorN;
    private int postalCode;
    private String colony;

    public Client() {
    }

    public Client(String s) {
        super(s);
    }

    public Client(String nickname, String password, String firstName, String secondName, String middleName, String lastName, String fullName, String bornDate, String email, String phoneNumber, int userType, String since, int status, String rfc, String curp, String street, int exteriorN, int interiorN, int postalCode, String colony) {
        super(nickname, password, firstName, secondName, middleName, lastName, fullName, bornDate, email, phoneNumber, userType, since, status);
        this.rfc = rfc;
        this.curp = curp;
        this.street = street;
        this.exteriorN = exteriorN;
        this.interiorN = interiorN;
        this.postalCode = postalCode;
        this.colony = colony;
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


    @Override
    public User addUser() {
        Tools.printTitle("Gioco - Agregando nuevo cliente.");

        String nickname = Tools.getString("nickname");
        String password = Tools.getString("password");
        String firstName = Tools.getString("primer nombre");
        String secondName = Tools.getString("segundo nombre");
        String middleName = Tools.getString("apellido paterno");
        String lastName = Tools.getString("apellido materno");
        String fullName = firstName + " " + secondName + " " + middleName + " " + lastName;
        String bornDate = Tools.getString("fecha de nacimiento (DD/MM/YYYY)");
        String email = Tools.getString("email");
        String phoneNumber = Tools.getString("número de teléfono");
        int userType = 2;
        String since = "Caracteristica inhabil";
        int status = 1;

        String rfc = Tools.getString("RFC");
        String curp = Tools.getString("CURP");
        String street = Tools.getString("calle");
        int exteriorN = Tools.getInt("número exterior");
        int interiorN = Tools.getInt("número interior");
        int postalCode = Tools.getInt("codigo postal");
        String colony = Tools.getString("colonia");


        return new Client(nickname, password, firstName, secondName, middleName, lastName, fullName, bornDate, email, phoneNumber, userType, since, status, rfc, curp, street, exteriorN, interiorN, postalCode, colony);
    }


    /**
     * En esta clase usamos un toString normal, que te regresa la información completa del usuario.
     *
     * @return Información completa del usuario
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nRFC: " + this.rfc +
                "\nCURP: " + this.curp +
                "\n" + Tools.ANSI_BLUE + "Dirección:" + Tools.ANSI_RESET +
                "\nCalle: " + this.street +
                "\nNúmero exterior e interior: " + this.exteriorN + " | " + this.interiorN +
                "\nCódigo postal: " + this.postalCode +
                "\nColonia: " + this.colony;
    }

    /**
     * Tambien implementamos un toString que nos regrese la información mas importante de un cliente para identificarlo,
     * para poderlo mostrar en la lista de clientes sin saturar la pantalla de información por cliente.
     *
     * @param shortToString Un string cualquiera que indica que se hará uso de la versión corta del toString
     * @return Información resumida del cliente.
     */
    public String toString(String shortToString) {
        return "Id: " + this.getId() +
                "\nNombre: " + this.getFullName() +
                "\nEmail: " + this.getEmail();
    }
}

