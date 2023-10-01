package Sesion3;

import java.util.Scanner;

public class Menu {
    private Proyecto proyecto;
    private Scanner scanner;

    public Menu(Proyecto proyecto, Scanner scanner) {
        this.proyecto = proyecto;
        this.scanner = scanner;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("------ Menú ------");
            System.out.println("1. Crear nueva lista de tareas");
            System.out.println("2. Ver listas de tareas");
            System.out.println("3. Ver tareas de una lista");
            System.out.println("4. Actualizar lista de tareas");
            System.out.println("5. Eliminar lista de tareas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Lector.leerEntero(scanner);

            switch (opcion) {
                case 1:
                    ListasTareas.crearNuevaListaDeTareas(proyecto, scanner);
                    break;
                case 2:
                    ListasTareas.verListasDeTareas(proyecto);
                    break;
                case 3:
                    ListasTareas.verTareasDeLista(proyecto, scanner);
                    break;
                case 4:
                    ListasTareas.actualizarListaDeTareas(proyecto, scanner);
                    break;
                case 5:
                    ListasTareas.eliminarListaDeTareas(proyecto, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 6);
    }
}
