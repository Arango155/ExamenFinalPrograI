/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalprograi;

/**
 *
 * @author jdara
 */
public class ClaseCe {
  public String nombre;
  public String municipio;
  public String cabecera;
   


  
  //constructor
  public ClaseCe(){
    
    String nombre = "No ha sido registrado";
    String municipio ="No ha sido registrado";
    String cabecera ="No ha sido registrado";
   

  }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getMunicipio() {
      return municipio;
   }

   public void setMunicipio(String municipio) {
      this.municipio = municipio;
   }
   
    public String getCabecera() {
      return cabecera;
   }

   public void setCabecera (String cabecera) {
      this.cabecera = cabecera;
   }
   
  
  
}