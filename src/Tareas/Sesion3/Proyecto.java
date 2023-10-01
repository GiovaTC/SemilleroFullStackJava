package Sesion3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Proyecto {
    private Map<String, ListaDeTareas> listasDeTareas;

    public Proyecto() {
        this.listasDeTareas = new HashMap<>();
    }

    public void crearNuevaListaDeTareas(String nombre) {
        ListaDeTareas nuevaLista = new ListaDeTareas(nombre);
        listasDeTareas.put(nombre, nuevaLista);
    }

    public void verListasDeTareas() {
        System.out.println("Listas de Tareas:");
        for (String nombreLista : listasDeTareas.keySet()) {
            System.out.println("- " + nombreLista);
        }
    }

    public void verTareasDeLista(String nombreLista) {
        ListaDeTareas lista = listasDeTareas.get(nombreLista);
        if (lista != null) {
            System.out.println("Tareas de la lista '" + nombreLista + "':");
            List<Tarea> tareas = lista.getTareas();
            for (Tarea tarea : tareas) {
                System.out.println("- " + tarea.getDescripcion());
            }
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public void actualizarListaDeTareas(String nombreLista, String nuevaTarea) {
        ListaDeTareas lista = listasDeTareas.get(nombreLista);
        if (lista != null) {
            lista.agregarTarea(nuevaTarea);
            System.out.println("Tarea agregada a la lista '" + nombreLista + "'.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public void eliminarListaDeTareas(String nombreLista) {
        ListaDeTareas listaEliminada = listasDeTareas.remove(nombreLista);
        if (listaEliminada != null) {
            System.out.println("Lista de Tareas '" + nombreLista + "' eliminada.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(proyecto, scanner);
        menu.mostrarMenu();
    }
}