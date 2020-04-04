package com.gioco.controller;

import java.util.Scanner;

public class Tools {

    /**
     * Colores
     */
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * Limpia la consola.
     * Funciona en equipos que soportan ANSI Escape Codes (Todas menos CMD)
     */
    public static void cleanScreen() {
        System.out.print("\u001B[0;0H");
        System.out.print("\u001B[2J");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }

    public static void padding() {
        System.out.println("\n");
    }

    /**
     * Imprime un texto subrayado en negrita que representa el título de pantalla.
     *
     * @param string El título de la pantalla
     */
    public static void printTitle(String string) {
        final int offset = 6;
        StringBuilder underline = new StringBuilder();
        for (int i = 0; i < string.length() + offset; i++) {
            underline.append("\u02ED");
        }
        System.out.print("\u001B[1m");
        System.out.print("\u001B[32m");
        System.out.println(string);
        System.out.println(underline.toString());
        System.out.print("\u001B[0m");
        System.out.print("\u001B[39m");
    }

    public static void cleanLine() {
        System.out.print("\r\u001B[0K");
    }

    public static int getOption() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("\nIngresa la opción deseada: ");
        return theScanner.nextInt();
    }

    public static String getString(String value) {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("\nIngresa " + value + ": ");
        return theScanner.nextLine();
    }

    public static int getInt(String value) {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("\nIngresa " + value + ": ");
        return theScanner.nextInt();
    }

    public static int getId() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("\nIngresa el id: ");
        return theScanner.nextInt();
    }

    public static float getFloat(String value) {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("\nIngresa " + value + ": ");
        return theScanner.nextFloat();
    }

    public static void validateOption(int min, int max, int value) {
        if (!(value >= min && value <= max)) {
            System.out.println(ANSI_RED + "Opción invalida, escoge otra." + ANSI_RESET);
        }
    }
}
