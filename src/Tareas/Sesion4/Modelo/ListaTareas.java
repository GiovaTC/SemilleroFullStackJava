package Sesion4.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private String nombre;
    private LocalDateTime fechaCreacion;
    private List<Tarea> tareas;

    public ListaTareas(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    {
        // Bloque de inicialización para la fecha de creación
        fechaCreacion = LocalDateTime.now();
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

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
}