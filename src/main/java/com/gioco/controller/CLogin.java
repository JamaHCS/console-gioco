package com.gioco.controller;

import com.gioco.model.Employee;
import com.gioco.model.repository.EmployeeRepo;

import java.util.Scanner;

import static com.gioco.controller.Tools.ANSI_RESET;
import static com.gioco.controller.Tools.ANSI_YELLOW;
import static com.gioco.model.repository.EmployeeRepo.employees;

public class CLogin {
    private EmployeeRepo employeeRepo = new EmployeeRepo();
    private int userLoged = 0;
    private String user = "";
    private String password = "";

    public CLogin() {
    }

    public int getUserLoged() {
        return userLoged;
    }

    public void setUserLoged(int userLoged) {
        this.userLoged = userLoged;
    }

    public String getUser() {
        return user;
    }

    public void setUser() {
        Scanner theScanner = new Scanner(System.in);
        this.user = theScanner.nextLine();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        Scanner theScanner = new Scanner(System.in);
        this.password = theScanner.nextLine();
    }


    public int validateUser(String user, String password) {
        int employeeId = 0;

        for (Employee e : employees) {
            if (user.equals(e.getNickname()) && password.equals(e.getPassword())) {
                employeeId = e.getId();
                System.out.println("\n" + ANSI_YELLOW + "Empleado obtenido" + ANSI_RESET);
                System.out.println(e.toString() + "\n");
            }
        }
        return employeeId;
    }

}
