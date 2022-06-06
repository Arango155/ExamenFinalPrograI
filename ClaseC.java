/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalprograi;

/**
 *
 * @author jdara
 */


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClaseC {
 

   ArrayList<ClaseCe> lista = new ArrayList();
   

   public void Departamento(){
  String nombre = JOptionPane.showInputDialog("Nombre del departamento ");
     String municipio = JOptionPane.showInputDialog("Cantidad de municipios que tiene ");
     String cabecera = JOptionPane.showInputDialog("Cabecera ");
     
     ClaseCe clase = new ClaseCe();
     
     clase.setNombre(nombre);
     clase.setMunicipio(municipio);
     clase.setCabecera(cabecera);

     lista.add(clase);
     
   }
   

   
   
    public void mostrarTransacciones(){
      String string="";
      for(int i=0;i<lista.size();i++){
         string+="DATOS DE LOS DEPARTAMENTOS GUARDADOS\n";
      
         string+="Nombre: "+lista.get(i).getNombre()+"\n";
         string+="Aleas: "+lista.get(i).getMunicipio()+"\n";
         string+="Codigo: "+lista.get(i).getCabecera()+"\n";

      }
      
      JOptionPane.showMessageDialog(null, string);
   }
    
   void verificar() {
         
       String string="";
      for(int i=0;i<lista.size();i++){
          
          String busqueda = JOptionPane.showInputDialog("Ingrese la busqueda "); 
          boolean existe = lista.get(i).getNombre().contains(busqueda); 
          if (existe){
        string+="El elemento SI existe";
        }else{
        string+="El elemento NO existe";}
      }
      
    JOptionPane.showMessageDialog(null, string);
   

     }

   
}