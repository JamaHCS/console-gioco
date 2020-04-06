package com.gioco.controller.DAO;

import com.gioco.model.object.Client;

import static com.gioco.controller.Tools.*;
import static com.gioco.model.repository.ClientRepo.clients;

/**
 * Client Data Access Object
 * <p>
 * Esta forma de manejar la lógica del manejo de objetos, la venía intuyendo desde las primeras practicas,
 * cuando investigué sobre como hacer conexión con base de datos me percaté que con una clase externa es como
 * se hace manejo en la creación, solicitud y consultas del objeto en cuestión, y no de forma embebida como lo
 * veníamos haciendo en clase. Así que se me hizo una forma mas organizada de hacer manejo de estos metodos.
 * </p>
 * Practicamente esta clase de encarga de hacer manejo de la lógica de las operaciones CRUD del objeto.
 *
 * @see com.gioco.model.object.User
 * @see com.gioco.model.object.Client
 * @see com.gioco.model.repository.ClientRepo
 */
public class ClientDAO {

    /**
     * <p>
     * Clase que recibe un cliente generado en la clase del objeto y lo agrega al arrayList de
     * estos objetos (Nuestro repositorio que hace la función de base de datos embebida en el programa
     * con persistencia existente solo durante el tiempo de vida de ejecucipon del programa.
     * </p>
     *
     * @param client Recibe un cliente
     */
    public void addClient(Client client) {
        clients.add(client);
    }


    /**
     * Clase encargada de buscar un cliente dentro del repositorio de clientes.
     *
     * @param id Id del cliente a buscar.
     * @return retorna el objeto encontrado en el repositorio.
     */
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

    /**
     * Metodo hecho para poder eliminar un objeto del repositorio.
     *
     * @param id Id del objeto a eliminar
     */
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
