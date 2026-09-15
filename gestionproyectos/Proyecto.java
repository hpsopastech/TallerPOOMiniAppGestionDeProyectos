/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPOOMiniAppGestionDeProyectos.gestionproyectos;

import java.util.ArrayList;

/**
 *
 * @author anran
 */
public class Proyecto {
    
    private String nombre;
    private double presupuesto;
    private ArrayList<Tarea> tareas;
    
    public Proyecto(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.tareas = new ArrayList<>();
    }
    
    public String getNombre()  { return nombre; }
    public double getPresupuesto ()  { return presupuesto; }
    public ArrayList<Tarea> getTareas ()  { return tareas; }
    
    public void setPresupuesto (double presupuesto) {
        if (presupuesto >= 0) {
            this.presupuesto = presupuesto;
        } else {
            System.out.println("Error: presupuesto negativo.");
        }
    }
    public void agregarTarea(Tarea tarea) { 

        tareas.add(tarea); 

        System.out.println("Tarea agregada: " + tarea.getNombre());
    } 
    public double calcularAvance() { 

        if (tareas.isEmpty()) { 
            return 0.0; 
        } 
        
        int terminadas = 0; 
        for (Tarea t : tareas) {             // for-each en Java 
            if (t.getEstado().equals(Tarea.TERMINADA)) {
                terminadas++; 
            } 
        } 
        return (double) terminadas / tareas.size() * 100; 
    }
    public void listarTareas() { 

        System.out.println("\n============================="); 
        System.out.println(" PROYECTO: " + nombre); 
        System.out.printf(" Presupuesto: $%,.0f%n", presupuesto); 
        System.out.printf(" Avance: %.1f%%%n", calcularAvance()); 
        System.out.println("============================="); 
        
        for (int i = 0; i < tareas.size(); i++) { 
            System.out.println(" " + (i + 1) + ". " + tareas.get(i));
        } 
        System.out.println("=============================");
    }
    @Override 
    public String toString() { 
        return "[" + nombre + "] Avance: " + calcularAvance() + "%";
    }
    public Tarea buscarPorResponsable(String responsable) {
        for (Tarea t : tareas) {
            if (t.getResponsable().equals(responsable)) {
                return t;
            }
        }
        return null;
    }
}