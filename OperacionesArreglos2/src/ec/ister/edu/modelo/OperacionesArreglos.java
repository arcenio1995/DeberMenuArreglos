/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ister.edu.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class OperacionesArreglos {
    
    final int DIM=5;
    
    double notas []= new double[DIM];
   
    public void dimensioar(){
        
        int dim=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE ELEMNTOS "));
        
        notas= new double[dim];
    }
     public void llenarNotas(){
         
         for (int i = 0; i <notas.length; i++) {
             notas[i]=1+Math.random()*10;
             
         }   
     }
     public void imprimir(){
         
         for (int i = 0; i <notas.length; i++) {
             
             System.out.println(""+notas[i]);
         }
         System.out.println("El promedio es : "+promedio());
     }
     
     public double promedio(){
         double suma=0;
         double promedio;
         for (int i = 0; i <notas.length; i++) {
             suma+=notas[i];
         }
         
         promedio=suma/notas.length;
         return promedio;
     }
    
    
    
    
    
    
}
