package Sesion6.Modelo;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {

    private List<Tarea> listaTareas;  // Nuevo atributo de tipo list

    public ListaTareas(String nombre) {
        // Otros inicializadores

        this.listaTareas = new ArrayList<>();  // Inicialización de la lista de tareas
    }

    // Método para agregar tareas a la lista, llamado desde la clase ListasTareas
    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
        String nombre = null;
        System.out.println("Tarea '" + tarea.getNombre() + "' agregada a la lista '" + nombre + "'.");
    }

    // Método para eliminar una tarea de la lista
    public void eliminarTarea(String nombreTarea) {
        listaTareas.removeIf(tarea -> tarea.getNombre().equals(nombreTarea));
        String nombre = null;
        System.out.println("Tarea '" + nombreTarea + "' eliminada de la lista '" + nombre + "'.");
    }

    // Método para obtener la lista de tareas
    public List<Tarea> obtenerListaTareas() {
        return new ArrayList<>(listaTareas);
    }

    // Método para obtener el número de tareas en la lista
    public int obtenerNumeroTareas() {
        return listaTareas.size();
    }

    // Método para imprimir los nombres de todas las tareas
    public void imprimirNombresTareas() {
        String nombre = null;
        System.out.println("Nombres de tareas en la lista '" + nombre + "':");
        for (Tarea tarea : listaTareas) {
            System.out.println("- " + tarea.getNombre());
        }
    }

    public Object getNombre() {
        return getNombre();
    }
}
