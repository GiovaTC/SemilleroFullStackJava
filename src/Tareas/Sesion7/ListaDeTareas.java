package Sesion7;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {
    private String nombre;
    private List<Tarea> tareas;

    public ListaDeTareas(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        tareas.add(nuevaTarea);
    }
}
