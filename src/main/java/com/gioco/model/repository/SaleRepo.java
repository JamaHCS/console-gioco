package com.gioco.model.repository;

import com.gioco.model.object.Sale;

import java.util.ArrayList;

/**
 * Clase repositorio de ventas, aquí es donde se guardan las ventas que se vayan generando.
 * (Se podría omitir esta clase y solo agregar el array list en otro lado, pero me gusta como queda mas organizado así).
 */
public class SaleRepo {
    public static ArrayList<Sale> sales = new ArrayList<>();
}
