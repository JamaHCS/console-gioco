package com.gioco.controller;

import com.gioco.model.object.Employee;
import com.gioco.model.repository.EmployeeRepo;

import java.util.Scanner;

import static com.gioco.controller.Tools.*;
import static com.gioco.model.repository.EmployeeRepo.employees;

/**
 * Clase que se encarga del manejo de la lógica en el inicio de sesión de los trabajadores.
 */
public class CLogin {
    private EmployeeRepo employeeRepo = new EmployeeRepo();
    public static Employee userLoged = null;
    private String user = "";
    private String password = "";

    public CLogin() {
    }

    public Employee getUserLoged() {
        return userLoged;
    }

    public void setUserLoged(Employee employee) {
        userLoged = employee;
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


    /**
     * Metodo que se encarga de validar las credenciales introducidas por el usuario
     * en la ventana de login
     *
     * @param user     nickname del usuario
     * @param password contraseña del usuario
     * @return el usuario
     */
    public Employee validateUser(String user, String password) {
        Employee employee = null;

        for (Employee e : employees) {
            if (user.equals(e.getNickname()) && password.equals(e.getPassword())) {
                employee = e;
                System.out.println("\n" + ANSI_YELLOW + "Sesión iniciada." + ANSI_RESET + "\n");
                System.out.println(e.toString() + "\n");
            } else {
                System.out.println(ANSI_RED + "Credenciales incorrectas." + ANSI_RESET);
            }
        }
        return employee;
    }

}
