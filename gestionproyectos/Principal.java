/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPOOMiniAppGestionDeProyectos.gestionproyectos;

/**
 *
 * @author anran
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Tarea t1 = new Tarea("Analisis de requisitos","Ana"); 

        Tarea t2 = new Tarea("Diseno de la BD","Carlos"); 

        Tarea t3 = new Tarea("Desarrollo backend","Luis"); 

        Tarea t4 = new Tarea("Testing","Maria");  

        Proyecto proyecto = new Proyecto("Sistema de Nomina", 50000000); 

        proyecto.agregarTarea(t1); 

        proyecto.agregarTarea(t2); 

        proyecto.agregarTarea(t3); 

        proyecto.agregarTarea(t4); 

        proyecto.listarTareas(); 

        t1.completar(); 

        t2.iniciar(); 

        t3.iniciar(); 
        
        System.out.println("\nEstado actualizado:"); 
        proyecto.listarTareas();
        
        System.out.println(proyecto);
    }
}