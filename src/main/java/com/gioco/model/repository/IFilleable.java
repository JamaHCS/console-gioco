package com.gioco.model.repository;

/**
 * Intefaz hecha para las clases de repositorio para poder llenar los datos que insertaremos de stock. Para no iniciar una iteración del programa sin datos por default.
 */
public interface IFilleable {

    /**
     * Metodo que se encarga del llanado de los datos uno por uno en un objeto previamente creado. Se ejecuta en el constructor.
     */
    void fillData();
}
