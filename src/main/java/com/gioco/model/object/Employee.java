package com.gioco.model.object;

import com.gioco.controller.Tools;


/**
 * Clase propia del objeto de un trabajador de la sucursal.
 */
public class Employee extends User {
    private int idSupervisor;
    private String branch;

    public Employee() {
    }

    public Employee(String nickname, String password, String firstName,
                    String secondName, String middleName, String lastName,
                    String fullName, String bornDate, String email, String phoneNumber,
                    int userType, String since, int status, int idSupervisor,
                    String branch) {
        super(nickname, password, firstName, secondName, middleName, lastName, fullName, bornDate, email, phoneNumber, userType, since, status);
        this.idSupervisor = idSupervisor;
        this.branch = branch;
    }


    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    @Override
    public User addUser() {
        Tools.printTitle("Gioco - Agregando nuevo empleado.");

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
        int userType = 1;
        String since = "Caracteristica inhabil";
        int status = 1;
        int idSupervisor = 0; //Caracteristica inhabil
        String branch = Tools.getString("sucursal");

        return new Employee(nickname, password, firstName, secondName, middleName, lastName, fullName, bornDate, email, phoneNumber, userType, since, status, idSupervisor, branch);
    }
}
