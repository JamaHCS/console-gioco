package com.gioco.controller.DAO;

import com.gioco.model.object.Product;

import static com.gioco.controller.Tools.*;
import static com.gioco.model.repository.ProductRepo.products;

/**
 * Product Data Access Object
 * <p>
 * Esta forma de manejar la lógica del manejo de objetos, la venía intuyendo desde las primeras practicas,
 * cuando investigué sobre como hacer conexión con base de datos me percaté que con una clase externa es como
 * se hace manejo en la creación, solicitud y consultas del objeto en cuestión, y no de forma embebida como lo
 * veníamos haciendo en clase. Así que se me hizo una forma mas organizada de hacer manejo de estos metodos.
 * </p>
 * Practicamente esta clase de encarga de hacer manejo de la lógica de las operaciones CRUD del objeto.
 *
 * @see com.gioco.model.object.Product
 * @see com.gioco.model.repository.ProductRepo
 */
public class ProductDAO {

    /**
     * <p>
     * Clase que recibe un producto generado en la clase del objeto y lo agrega al arrayList de
     * estos objetos (Nuestro repositorio que hace la función de base de datos embebida en el programa
     * con persistencia existente solo durante el tiempo de vida de ejecucipon del programa.
     * </p>
     *
     * @param product Recibe un producto
     */
    public void addProduct(Product product) {
        products.add(product);
    }


    /**
     * Clase encargada de buscar un producto dentro del repositorio de productos.
     *
     * @param id Id del producto a buscar.
     * @return retorna el objeto encontrado en el repositorio.
     */
    public static Product searchProduct(int id) {
        Product product = null;

        for (Product p : products) {
            if (p.getProductId() == id) {
                product = p;
            }
        }

        if (product == null) {
            System.out.println(ANSI_RED + "Producto no encontrado." + ANSI_RESET);
        }
        return product;
    }

    /**
     * Metodo hecho para poder eliminar un objeto del repositorio.
     *
     * @param id Id del objeto a eliminar
     */
    public static void removeProduct(int id) {
        if (products.removeIf(p -> p.getProductId() == id)) {
            System.out.println(ANSI_YELLOW + "Eliminado." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Producto no encontrado." + ANSI_RESET);
        }
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (Product p : products) {
            toReturn += "\n\n" + p.toString("s");
        }
        return toReturn;
    }
}
