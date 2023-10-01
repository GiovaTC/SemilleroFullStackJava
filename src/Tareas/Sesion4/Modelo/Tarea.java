
package Sesion4.Modelo;

import java.time.LocalDateTime;

public class Tarea {
    private String nombre;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaExpiracion;
    private boolean realizada;
    private LocalDateTime fechaRealizacion;

    public Tarea(String nombre) {
        this.nombre = nombre;
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

    public LocalDateTime getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDateTime fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public LocalDateTime getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }
}
