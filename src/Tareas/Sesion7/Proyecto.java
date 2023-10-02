package Sesion7;

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

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear nueva lista de tareas");
            System.out.println("2. Ver listas de tareas");
            System.out.println("3. Ver tareas de lista");
            System.out.println("4. Actualizar lista de tareas");
            System.out.println("5. Eliminar lista de tareas");
            System.out.println("6. Gestionar Tareas");
            System.out.println("7. Salir");

            System.out.print("Ingrese la opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la nueva lista de tareas: ");
                    String nombreNuevaLista = scanner.nextLine();
                    proyecto.crearNuevaListaDeTareas(nombreNuevaLista);
                    System.out.println("Lista de tareas '" + nombreNuevaLista + "' creada.");
                    break;
                case 2:
                    proyecto.verListasDeTareas();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la lista de tareas: ");
                    String nombreListaVer = scanner.nextLine();
                    proyecto.verTareasDeLista(nombreListaVer);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la lista de tareas: ");
                    String nombreListaActualizar = scanner.nextLine();
                    System.out.print("Ingrese la descripción de la nueva tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    proyecto.actualizarListaDeTareas(nombreListaActualizar, nuevaTarea);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre de la lista de tareas a eliminar: ");
                    String nombreListaEliminar = scanner.nextLine();
                    proyecto.eliminarListaDeTareas(nombreListaEliminar);
                    break;
                case 6:
                    gestionarTareas(proyecto);
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
    private static void gestionarTareas(Proyecto proyecto) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la lista de tareas: ");
        String nombreLista = scanner.nextLine();

        ListaDeTareas lista = proyecto.listasDeTareas.get(nombreLista);

        if (lista != null) {
            int opcion;
            do {
                opcion = Menu.mostrarMenuTareas();
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la descripción de la nueva tarea: ");
                        String nuevaTarea = scanner.nextLine();
                        ManejadorTareas.agregarNuevaTarea(lista, nuevaTarea);
                        break;
                    case 2:
                        System.out.print("Ingrese el índice de la tarea a eliminar: ");
                        int indiceEliminar = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea pendiente
                        ManejadorTareas.eliminarTarea(lista, indiceEliminar);
                        break;
                    case 3:
                        System.out.print("Ingrese el índice de la tarea a marcar como realizada: ");
                        int indiceMarcar = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea pendiente
                        ManejadorTareas.marcarTareaRealizada(lista, indiceMarcar);
                        break;
                    case 4:
                        System.out.println("Regresando al menú principal.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            } while (opcion != 4);
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }
}