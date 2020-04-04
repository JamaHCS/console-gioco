package com.gioco.model.repository;

import com.gioco.model.object.Client;
import com.gioco.model.object.User;

import java.util.ArrayList;

public class ClientRepo implements IFilleable {
    public static ArrayList<Client> clients = new ArrayList<>();

    private Client mariana = new Client();

    public ClientRepo() {
        this.fillData();
        clients.add(mariana);
    }


    @Override
    public void fillData() {
        mariana.setNickname("marianaUser");
        mariana.setPassword("acceso");
        mariana.setFirstName("Mariana");
        mariana.setSecondName("");
        mariana.setMiddleName("Olvera");
        mariana.setLastName("Hernandez");
        mariana.setFullName(mariana.getFirstName() + " " + mariana.getMiddleName() + " " + mariana.getLastName());
        mariana.setBornDate("30/03/2000");
        mariana.setEmail("hernandezolvera30@gmail.com");
        mariana.setPhoneNumber("4424717667");
        mariana.setUserType(2);
        mariana.setStatus(1);
    }
}
