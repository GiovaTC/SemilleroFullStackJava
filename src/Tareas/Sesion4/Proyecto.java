package Sesion4;

import Sesion4.Modelo.ListaTareas;
import Sesion4.Modelo.Tarea;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Proyecto {
    private Map<String, ListaTareas> listaTareas;

    public Proyecto() {
        this.listaTareas = new HashMap<>();
    }

    public void crearNuevaListaDeTareas(String nombre) {
        ListaTareas nuevaLista = new ListaTareas(nombre);
        listaTareas.put(nombre, nuevaLista);
    }

    public void verListasDeTareas() {
        System.out.println("Listas de Tareas:");
        for (String nombreLista : listaTareas.keySet()) {
            System.out.println("- " + nombreLista);
        }
    }

    public void verTareasDeLista(String nombreLista) {
        ListaTareas lista = listaTareas.get(nombreLista);
        if (lista != null) {
            System.out.println("Tareas de la lista '" + nombreLista + "':");
            List<String> tareas = lista.getTareas();
            for (String tarea : tareas) System.out.println("- " + tarea.strip());
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public void actualizarListaDeTareas(String nombreLista, String nuevaTarea) {
        ListaTareas lista = listaTareas.get(nombreLista);
        if (lista != null) {
            lista.agregarTarea(nuevaTarea);
            System.out.println("Tarea agregada a la lista '" + nombreLista + "'.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public void eliminarListaDeTareas(String nombreLista) {
        ListaTareas listaEliminada = listaTareas.remove(nombreLista);
        if (listaEliminada != null) {
            System.out.println("Lista de Tareas '" + nombreLista + "' eliminada.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto();
        Scanner scanner = new Scanner(System.in);

        short opcionSeleccionada;
        String nombreOpcionSeleccionada;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear nueva lista de tareas");
            System.out.println("2. Ver listas de tareas");
            System.out.println("3. Ver tareas de lista");
            System.out.println("4. Actualizar lista de tareas");
            System.out.println("5. Eliminar lista de tareas");
            System.out.println("6. Salir");

            System.out.print("Ingrese la opción: ");
            opcionSeleccionada = scanner.nextShort();
            scanner.nextLine();

            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("Ingrese el nombre de la nueva lista de tareas: ");
                    nombreOpcionSeleccionada = scanner.nextLine();
                    proyecto.crearNuevaListaDeTareas(nombreOpcionSeleccionada);
                    System.out.println("Lista de tareas '" + nombreOpcionSeleccionada + "' creada.");
                    break;
                case 2:
                    proyecto.verListasDeTareas();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la lista de tareas: ");
                    nombreOpcionSeleccionada = scanner.nextLine();
                    proyecto.verTareasDeLista(nombreOpcionSeleccionada);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la lista de tareas: ");
                    nombreOpcionSeleccionada = scanner.nextLine();
                    System.out.print("Ingrese la descripción de la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    proyecto.actualizarListaDeTareas(nombreOpcionSeleccionada, nuevaTarea);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre de la lista de tareas a eliminar: ");
                    nombreOpcionSeleccionada = scanner.nextLine();
                    proyecto.eliminarListaDeTareas(nombreOpcionSeleccionada);
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}