package com.gioco.controller;

import com.gioco.controller.DAO.ClientDAO;
import com.gioco.model.object.Client;

public class CManageClient implements IController {
    private int optionSelected;
    public static ClientDAO clientDAO = new ClientDAO();

    public CManageClient(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    @Override
    public void controller() {
        switch (optionSelected) {
            case 1:
                clientDAO.addClient((Client) new Client().addUser());
                break;
            case 2:
                System.out.println(clientDAO.toString("s"));
                break;
            case 3:
                System.out.println(clientDAO.searchClient(Tools.getId()));
                break;
            case 4:
                clientDAO.removeClient(Tools.getId());
                break;
        }
    }
}
