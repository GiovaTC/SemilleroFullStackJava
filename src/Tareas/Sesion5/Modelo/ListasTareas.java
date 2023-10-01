package Sesion5.Modelo;

import Sesion5.Lector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListasTareas {
    private Map<String, ListaTareas> listaTareas;

    public ListasTareas() {
        this.listaTareas = new HashMap<>();
    }

    public void crearNuevaListaDeTareas(Scanner scanner) {
        System.out.print("Ingrese el nombre de la nueva ListaTareas: ");
        String nombreLista = Lector.leerCadena(scanner);
        ListaTareas nuevaLista = new ListaTareas(nombreLista);
        listaTareas.put(nombreLista, nuevaLista);
        System.out.println("Lista de Tareas '" + nombreLista + "' creada.");
    }

    public void verListasDeTareas() {
        System.out.println("Listas de Tareas:");
        for (String nombreLista : listaTareas.keySet()) {
            System.out.println("- " + nombreLista);
        }
    }

    public void verTareasDeLista(Scanner scanner) {
        System.out.print("Seleccione la lista de tareas: ");
        String nombreLista = Lector.leerCadena(scanner);

        ListaTareas lista = listaTareas.get(nombreLista);
        if (lista != null) {
            System.out.println("Tareas de la lista '" + nombreLista + "':");
            List<String> tareas = lista.getTareas();
            for (String tarea : tareas) System.out.println("- " + tarea.strip());
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public void actualizarListaDeTareas(Scanner scanner) {
        System.out.print("Seleccione la lista de tareas: ");
        String nombreLista = Lector.leerCadena(scanner);

        ListaTareas lista = listaTareas.get(nombreLista);
        if (lista != null) {
            System.out.print("Ingrese la descripción de la nueva tarea: ");
            String nuevaTarea = Lector.leerCadena(scanner);
            lista.agregarTarea(nuevaTarea);
            System.out.println("Tarea agregada a la lista '" + nombreLista + "'.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public void eliminarListaDeTareas(Scanner scanner) {
        System.out.print("Seleccione la lista de tareas a eliminar: ");
        String nombreLista = Lector.leerCadena(scanner);

        ListaTareas listaEliminada = listaTareas.remove(nombreLista);
        if (listaEliminada != null) {
            System.out.println("Lista de Tareas '" + nombreLista + "' eliminada.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }
}
