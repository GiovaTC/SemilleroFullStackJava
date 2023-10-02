package Sesion7;

import java.util.Scanner;

public class Menu {
    public static int mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMenú Principal:");
        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareas");
        System.out.println("3. Ver tareas de lista");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Eliminar lista de tareas");
        System.out.println("6. Salir");

        System.out.print("Ingrese la opción: ");
        return scanner.nextInt();
    }

    public static int mostrarMenuTareas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMenú de Gestión de Tareas:");
        System.out.println("1. Agregar nueva tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Marcar tarea como realizada");
        System.out.println("4. Regresar");

        System.out.print("Ingrese la opción: ");
        return scanner.nextInt();
    }
}