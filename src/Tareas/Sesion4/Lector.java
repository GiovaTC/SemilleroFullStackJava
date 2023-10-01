package Sesion4;

import java.util.Scanner;

public class Lector {
    public static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String leerCadena(Scanner scanner) {
        return scanner.next();
    }
}
