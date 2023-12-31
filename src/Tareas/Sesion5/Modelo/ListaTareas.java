package Sesion5.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private String nombre;
    private final LocalDateTime fechaCreacion;
    private List<String> tareas;

    public ListaTareas(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
        this.fechaCreacion = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }
}