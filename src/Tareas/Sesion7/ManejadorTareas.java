package Sesion7;

import java.util.List;

public class ManejadorTareas {
    public static void agregarNuevaTarea(ListaDeTareas lista, String descripcion) {
        lista.agregarTarea(descripcion);
        System.out.println("Nueva tarea agregada a la lista '" + lista.getNombre() + "'.");
    }

    public static void eliminarTarea(ListaDeTareas lista, int indice) {
        List<Tarea> tareas = lista.getTareas();
        if (indice >= 0 && indice < tareas.size()) {
            Tarea tareaEliminada = tareas.remove(indice);
            System.out.println("Tarea '" + tareaEliminada.getDescripcion() + "' eliminada de la lista '" +
                    lista.getNombre() + "'.");
        } else {
            System.out.println("Índice no válido. La tarea no fue eliminada.");
        }
    }

    public static void marcarTareaRealizada(ListaDeTareas lista, int indice) {
        List<Tarea> tareas = lista.getTareas();
        if (indice >= 0 && indice < tareas.size()) {
            Tarea tarea = tareas.get(indice);
            // Puedes agregar una propiedad 'realizada' a la clase Tarea y establecerla como verdadera aquí.
            System.out.println("Tarea '" + tarea.getDescripcion() + "' marcada como realizada en la lista '" +
                    lista.getNombre() + "'.");
        } else {
            System.out.println("Índice no válido. La tarea no fue marcada como realizada.");
        }
    }
}