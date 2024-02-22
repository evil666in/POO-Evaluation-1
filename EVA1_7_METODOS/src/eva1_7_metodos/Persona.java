/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

/**
 *
 * @author invitado
 */
public class Persona {
   private String nombre;
   private String apellidos;
   private int edad;
   
   //metodos get y set
   
   public String getnombre (){
       return nombre;
    }
   
   public void setnombre (String valor){
       nombre = valor;
   }
   
   public String getapellidos (){
       return apellidos;
   }
   
   public void setapellidos (String valor){
       apellidos = valor;
   }
    
   public int getedad (){
       return edad;
   }
   
   public void setedad (int valor){
       edad = valor;
   }
   
   public String generarNombreCom (){
       return nombre + " " + apellidos ;
   }
   
   public int calcularAnnioNac(){
       return 2024 - edad;
   }
}
