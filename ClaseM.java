/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalprograi;

/**
 *
 * @author jdara
 */

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author jdara
 */
public class ClaseM {
    
    
    ClaseP calculador=new ClaseP();
    int opcion;
    int municipio;
    int op2;
    int op;
    ClaseC obj = new ClaseC();
    Scanner scanner = new Scanner(System.in);
    double c,cc,t,cg;
    String n,a,co,nc,d;
    int se;


     public void mostrarMenu(){
     op = Byte.parseByte(JOptionPane.showInputDialog(
    "PROGRAMA PARA EL REGISTRO DE LOS DEPARTAMENTOS DE GUATEMALA\n"
    +"1. VECTORES\n"
    +"2. LISTAS\n"
    +"Ingrese en base a que tipo de registro quiere que funcione el programa: "
     ));
     
    }

   public void desicion() {
       
        
       
        
        switch(op) {
            
            case 1:{
                
           do{
                opcion = Byte.parseByte(JOptionPane.showInputDialog(
               "----MENU BASADO EN VECTORES----\n"
               +"1. REGISTRAR LOS DATOS DE UN DEPARTAMENTO\n"
               +"2. MOSTRAR TODOS LOS DEPARTAMENTOS REGISTRADOS\n"  
               +"3. MOSTRAR LA POSICION DE UN DEPARTAMENTO \n"
               +"4. MOSTRAR DEPARTAMENTOS POR SU INICIAL \n"
               +"5. MOSTRAR DEPARTAMENTOS REGISTRADOS EN LA POSICION PAR DEL VECTOR Y CON MAS DE 4 MUNICIPIOS \n"
               +"0. Salir"));
       
             
       switch(opcion){
               
         case 1 -> { 
             
              
             String departamento= JOptionPane.showInputDialog("\nDepartamento: ");
             municipio=Byte.parseByte(JOptionPane.showInputDialog("\nNumero de municipios: "));
             String cabecera=JOptionPane.showInputDialog("\nCabecera: ");
             System.out.println();
             System.out.print(calculador.departamento(departamento,municipio,cabecera));
               break;
               }
          
        
         
                 case 2 -> {
            calculador.mostrarTransacciones();
    
            break;
            
                 }
                 
     
            
                 
                 
               case 0 -> {
            System.out.println("Gracias por haber usado el programa");
    
            break;
                 } 
            
      }
       
       
       }  while (opcion !=0); 
           
           break;
            }
            
            
            
           case 2:{
           
          do{
       opcion = Byte.parseByte(JOptionPane.showInputDialog(
               "----MENU BASADO EN LISTAS----\n"
               +"1. INGRESAR UN DEPARTAMENTO\n"
               +"2. MOSTRAR TODOS LOS DEPARTAMENTOS REGISTRADOS\n"  
               +"3. VACIAR LA LISTA\n"
               +"4. VERIFICAR SI UN DEPARTAMENTO FUE REGISTRADO\n"
               +"0. Salir"));
       
       
       switch(opcion){
           
          case 1:
              obj.Departamento();
             break;

              case 2:
             obj.mostrarTransacciones();
             break; 
               
   
            
        
          case 0:
             JOptionPane.showMessageDialog(null, "Gracias por haber usado el programa");
             break;
             
          default:
             JOptionPane.showMessageDialog(null, "Opcion invalida");
             break;
             
       }
       
       
    }while(opcion!=0);
    
           break;
           
           
           }
           
           
           
            default: System.out.println("\nOpcion invalida");

        }
        
   
}

}