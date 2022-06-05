/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalprograi;

/**
 *
 * @author jdara
 */

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class ClaseP  {
    private String[] vectorTransacciones;  
    private int indiceVector;
    private String[] vectorTransaccionesD;  
    private int indiceVectorD;
    private int[] vectorTransaccionesM;  
    private int indiceVectorM;
    Scanner leer = new Scanner(System.in);
    int pos;
    
     public ClaseP(){
        vectorTransacciones= new String[5];
        this.indiceVector=0;
        vectorTransaccionesD= new String[5];
        this.indiceVectorD=0;
        vectorTransaccionesM= new int[5];
        this.indiceVectorM=0;
        
 
     }
     
      public String Input(String text){
      return JOptionPane.showInputDialog(text);
   }
     
      
    public String departamento (String departamento, int municipio, String cabecera){
        String resultado = "";
        this.registrarTransaccion(" ",departamento, municipio, cabecera);
        return "";
    }
    
       private void registrarTransaccion(String a_, String departamento, int municipio, String cabecera) {
       
           indiceVector= indiceVector+1;
           indiceVectorD= indiceVectorD+1;
        vectorTransacciones[indiceVector]="El departamento es "+departamento+" \nLa cabecera es "+cabecera+" \nTiene "+municipio+" municipios" ;
    vectorTransaccionesD[indiceVectorD]=departamento;
    vectorTransaccionesM[indiceVectorM]=municipio;
       }
       

            

    public void mostrarTransacciones(){
        String string="";
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    string+=(vectorTransacciones[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        JOptionPane.showMessageDialog(null, string);
        
    }
 
   
}