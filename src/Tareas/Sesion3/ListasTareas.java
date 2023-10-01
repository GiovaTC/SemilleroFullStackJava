package Sesion3;

import java.util.Scanner;

public class ListasTareas {
    public static void crearNuevaListaDeTareas(Proyecto proyecto, Scanner scanner) {
        System.out.print("Ingrese el nombre de la nueva lista: ");
        String nombreLista = Lector.leerCadena(scanner);
        proyecto.crearNuevaListaDeTareas(nombreLista);
        System.out.println("Nueva lista de tareas '" + nombreLista + "' creada.");
    }

    public static void verListasDeTareas(Proyecto proyecto) {
        proyecto.verListasDeTareas();
    }

    public static void verTareasDeLista(Proyecto proyecto, Scanner scanner) {
        System.out.print("Ingrese el nombre de la lista: ");
        String nombreLista = Lector.leerCadena(scanner);
        proyecto.verTareasDeLista(nombreLista);
    }

    public static void actualizarListaDeTareas(Proyecto proyecto, Scanner scanner) {
        System.out.print("Ingrese el nombre de la lista: ");
        String nombreLista = Lector.leerCadena(scanner);
        System.out.print("Ingrese la descripción de la nueva tarea: ");
        String nuevaTarea = Lector.leerCadena(scanner);
        proyecto.actualizarListaDeTareas(nombreLista, nuevaTarea);
    }

    public static void eliminarListaDeTareas(Proyecto proyecto, Scanner scanner) {
        System.out.print("Ingrese el nombre de la lista a eliminar: ");
        String nombreLista = Lector.leerCadena(scanner);
        proyecto.eliminarListaDeTareas(nombreLista);
    }
}
