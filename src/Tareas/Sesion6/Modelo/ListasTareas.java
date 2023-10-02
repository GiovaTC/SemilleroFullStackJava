package Sesion6.Modelo;

import Sesion6.Lector;

import java.util.*;

public class ListasTareas {
    private List<ListaTareas> listaTareas;

    public ListasTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void crearNuevaListaDeTareas(Scanner scanner) {
        System.out.print("Ingrese el nombre de la nueva ListaTareas: ");
        String nombreLista = Lector.leerCadena(scanner);
        ListaTareas nuevaLista = new ListaTareas(nombreLista);
        listaTareas.add(nuevaLista);
        System.out.println("Lista de Tareas '" + nombreLista + "' creada.");
    }

    public void actualizarListaDeTareas(Scanner scanner) {
        System.out.print("Seleccione la lista de tareas: ");
        String nombreLista = Lector.leerCadena(scanner);

        ListaTareas lista = obtenerListaTareas(nombreLista);
        if (lista != null) {
            System.out.print("Ingrese la descripción de la nueva tarea: ");
            String nuevaTarea = Lector.leerCadena(scanner);

            Tarea tarea = new Tarea(nuevaTarea);
            lista.agregarTarea(tarea);//llamada al metodo agregarTarea de la clase ListaTareas

            System.out.println("Tarea agregada a la lista '" + nombreLista + "'.");
        } else {
            System.out.println("La lista '" + nombreLista + "' no existe.");
        }
    }

    private ListaTareas obtenerListaTareas(String nombreLista) {
        for (ListaTareas lista : listaTareas) {
            if (lista.getNombre().equals(nombreLista)) {
                return lista;
            }
        }
        return null;
    }
}
