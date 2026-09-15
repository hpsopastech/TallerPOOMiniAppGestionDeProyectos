/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPOOMiniAppGestionDeProyectos.gestionproyectos;
/**
 *
 * @author anran
 */
public class Tarea {
    
    private String nombre;
    private String responsable;
    private String estado;
    private String fechaCreacion;
    
    
    public static final String PENDIENTE = "pendiente";
    public static final String EN_PROGRESO = "en progreso";
    public static final String TERMINADA = "terminada";
    
    public Tarea(String nombre, String responsable) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.estado = PENDIENTE;
        this.fechaCreacion = "Sin fecha";
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getResponsable() {
        return responsable;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setNombre (String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio. ");
        }
    }
    public void setResponsable (String responsable) {
        this.responsable = responsable;
        
    }
    
    public void setEstado (String estado) {
        if (estado.equals (PENDIENTE) || estado.equals(EN_PROGRESO) || estado.equals(TERMINADA)) {
            this.estado = estado;
        } else {
            System.out.println("Estado invalido: " + estado);   
        }
        
    }
    
    public void iniciar() {
        if (this.estado.equals(PENDIENTE)) {
            this.estado = EN_PROGRESO;
            System.out.println("Tarea iniciada: " + nombre);
        } else {
            System.out.println("La tarea ya fue iniciada o terminada. ");
        }
    }
    
    @Override
    public String toString() {
        return "[" + estado.toUpperCase() + "]" + nombre + " -> " + responsable;
    }
    
    public void pausar() {
        if (this.estado.equals(EN_PROGRESO)) {
            this.estado = PENDIENTE;
            System.out.println("Tarea pausada: " + nombre);
        } else {
            System.out.println("Solo se puede pausar una tarea en progreso.");
        }
    }
    
    public void completar () {
        if (this.estado.equals(EN_PROGRESO) || this.estado.equals(PENDIENTE)){
            this.estado = TERMINADA;
            System.out.println("La tarea: " + nombre + " de " + responsable + " a sido TERMINADA, BIEN HECHO");
        } else {
            System.out.println("Solo se pueden terminar Tareas que estan en progreso o pendientes");
        }
    }
}