/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ister.edu.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ClaseArreglos {
    int array[];
    int minimo;
    public void meu(){
        int op=0;
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion :\n "
                    + "1.- Dimensionar\n"
                    + "2.- Ingresar elementos\n"
                    + "3.- Promedio de los elementos\n"
                    + "4.- Máximo de los E del arreglo\n"
                    + "5.- Mínimo de los E del arreglo\n"
                    + "6.- Salir"));
        switch(op){
            case 1:
                dimensionar();
            break; 
            
            case 2:
                llenarArreglo();
            break;
            
            case 3:
               JOptionPane.showMessageDialog(null,imprimirArrays()+
                            "\n su promedio es: "+promedio());  
            break;
            
            case 4:
                maximo();
            break;
            
            case 5:
              minimo();  
            break;
                 case 6:
              
            break;
            
        }
        
        }while(op!=6);
        }
    
    public void dimensionar(){
        int dim=Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE ELEMENTOS"));
        array= new int [dim];
    }
    
    public void llenarArreglo(){
        
        for (int i = 0; i <array.length; i++) {
            
            array[i]= Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero "+(i+1)+"de "+array.length));
            break;
        }
    }
    
    public String imprimirArrays(){
        return Arrays.toString(array);
    }
    
    
    
    public String imprimir(){
        String acu="";
        for (int i = 0; i < array.length; i++) {
            acu += " "+array[i];
        }
        return "[ "+acu+"]";
    }
    
    public float promedio(){
        float acu=0,prom=0;
        for(int i=0;i<array.length;i++){
            acu += array[i];
        }
        return acu/array.length;
    }
    
    public void maximo(){
        Arrays.sort(array);
        JOptionPane.showMessageDialog(null,imprimirArrays());
        int max = array[(array.length-1)];
        JOptionPane.showMessageDialog(null, max);
        
    }
    public void minimo(){
        JOptionPane.showMessageDialog(null,imprimirArrays());
        for (int i = 0; i <array.length; i++) {
            
            if(array[i]<minimo){
                
                minimo = array[i];
                
            }    
            
        }
        
      JOptionPane.showMessageDialog(null, minimo);  
    }
    
   
    
        }


