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
}
