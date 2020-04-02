package com.gioco.view;

import com.gioco.controller.CLogin;
import com.gioco.controller.Tools;

public class Login implements IVisualizable {
    private CLogin login = new CLogin();
    private boolean logged = false;

    public Login() {
    }

    @Override
    public void show() {
        do {
            Tools.cleanScreen();
            Tools.printTitle("Gioco - Login");
            System.out.println("\nIngesa tus datos de usuario para entrar.");

            System.out.print("\nUsuario: ");
            login.setUser();

            System.out.print("Contraseña: ");
            login.setPassword();

            login.setUserLoged(login.validateUser(login.getUser(), login.getPassword()));
            if (login.getUserLoged() != 0) {
                logged = true;
            }
        } while (!logged);

        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
    }
}
