package com.gioco.controller.DAO;

import com.gioco.model.object.Client;

import static com.gioco.controller.Tools.*;
import static com.gioco.model.repository.ClientRepo.clients;

public class ClientDAO {
    public void addClient(Client client) {
        clients.add(client);
    }

    public Client searchClient(int id) {
        Client client = null;

        for (Client c : clients) {
            if (c.getId() == id) {
                client = c;
            }
        }

        if (client == null) {
            System.out.println(ANSI_RED + "Cliente no encontrado." + ANSI_RESET);
        }
        return client;
    }

    public void removeClient(int id) {
        if (clients.removeIf(c -> c.getId() == id)) {
            System.out.println(ANSI_YELLOW + "Eliminado." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Cliente no encontrado." + ANSI_RESET);
        }
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (Client c : clients) {
            toReturn += "\n\n" + c.toString();
        }
        return toReturn;
    }

    public String toString(String shorToString) {
        String toReturn = "";
        for (Client c : clients) {
            toReturn += "\n\n" + c.toString("s");
        }
        return toReturn;
    }
}
