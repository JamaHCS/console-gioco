package com.gioco.controller.DAO;

import com.gioco.controller.Tools;
import com.gioco.model.object.Client;
import com.gioco.model.object.Product;
import com.gioco.model.object.Sale;
import com.gioco.model.object.SaleProduct;

import java.util.Date;
import java.util.Scanner;

import static com.gioco.controller.CLogin.userLoged;
import static com.gioco.controller.CManageClient.clientDAO;
import static com.gioco.controller.CManageStock.productDAO;
import static com.gioco.controller.DAO.ProductDAO.searchProduct;
import static com.gioco.controller.Tools.*;
import static com.gioco.model.repository.SaleRepo.sales;

/**
 * Sale Data Access Object
 * <p>
 * Esta forma de manejar la lógica del manejo de objetos, la venía intuyendo desde las primeras practicas,
 * cuando investigué sobre como hacer conexión con base de datos me percaté que con una clase externa es como
 * se hace manejo en la creación, solicitud y consultas del objeto en cuestión, y no de forma embebida como lo
 * veníamos haciendo en clase. Así que se me hizo una forma mas organizada de hacer manejo de estos metodos.
 * </p>
 * Practicamente esta clase de encarga de hacer manejo de la lógica de las operaciones CRUD del objeto.
 *
 * @see com.gioco.model.object.Sale
 * @see com.gioco.model.object.SaleProduct
 * @see com.gioco.model.repository.SaleRepo
 */
public class SaleDAO {

    /**
     * Clase que se encarga de generar nueva venta.
     *
     * @return una nueva venta generada por el metodo.
     */
    public Sale newSale() {
        Tools.padding();
        Tools.printTitle("Gioco - Nueva venta.");

        Sale sale = new Sale();
        Client client = null;
        String option = "";

        System.out.println(clientDAO.toString("s") + "\n");
        System.out.println("Seleccione el cliente deseado.");

        do {
            client = clientDAO.searchClient(Tools.getId());
        } while (client == null);

        sale.setClient(client);
        sale.setEmployee(userLoged);
        sale.setBranchOffice(userLoged.getBranch());

        do {
            System.out.println(productDAO.toString());
            Tools.padding();
            System.out.println("Seleccione el producto a vender.");
            int idProduct = Tools.getId();
            int quantity = Tools.getInt("cantidad");

            try {
                Product product = searchProduct(idProduct);
                if (product.getProductStock() >= quantity) {
                    SaleProduct saleProduct = new SaleProduct(sale.getId(), idProduct, quantity, product);
                    sale.products.add(saleProduct);
                    product.setProductStock(product.getProductStock() - quantity);
                } else {
                    System.out.println(ANSI_RED + "Stock insuficiente." + ANSI_RESET);
                }
            } catch (Exception ignored) {
            }


            System.out.println("Desea ingresar otro articulo a la venta? y/n");
            Scanner theScanner = new Scanner(System.in);
            option = theScanner.nextLine();
        } while (option.equals("y"));

        Date date = new Date();
        sale.setDateOfSale(date);
        sale.setBranchOffice(userLoged.getBranch());
        sale.setTotal(sale.generateTotal());
        sale.setSubTotal((sale.getTotal() - (sale.getTotal() * 0.16)));
        sale.setTaxes(sale.getTotal() * 0.16);


        if (!sale.collect()) {
            sale = null;
        }
        return sale;
    }

    /**
     * <p>
     * Clase que recibe un producto generado en la clase del objeto y lo agrega al arrayList de
     * estos objetos (Nuestro repositorio que hace la función de base de datos embebida en el programa
     * con persistencia existente solo durante el tiempo de vida de ejecucipon del programa.
     * </p>
     *
     * @param sale Recibe una venta
     */
    public static void addSale(Sale sale) {
        if (sale != null) {
            sales.add(sale);
        }
    }

    /**
     * Metodo hecho para poder eliminar un objeto del repositorio. En un curso de base de datos
     * nos mencionaban que se recomendaba nunca borrar un dato imprtante, porque a terminos de data
     * del negocio, no es bueno eliminar información. Bajo estos terminos, lo que se hizo fue en lugar de eliminar el objeto,
     * el estado del mismo fue cambiado a "eliminada".
     *
     * @param id Id del objeto a eliminar
     */
    public static void removeSale(int id) {
        if (sales.removeIf(s -> s.getId() == id)) {
            System.out.println(ANSI_YELLOW + "Eliminado." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Venta no encontrada." + ANSI_RESET);
        }
    }

    /**
     * Metodo encargado de imprimir todas las ventas no "Eliminadas"
     */
    public static void printSales() {
        Tools.padding();
        Tools.printTitle("Gioco - Ventas");
        for (Sale s : sales) {
            if (!s.getStatus().equals("eliminada")) {
                System.out.println("\n" + s.toString());
            }
        }
    }
}
