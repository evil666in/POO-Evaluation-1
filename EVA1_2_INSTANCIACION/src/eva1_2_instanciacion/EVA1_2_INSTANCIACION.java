/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_instanciacion;

/**
 *
 * @author evely
 */
public class EVA1_2_INSTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        //instanciacion: crear el objeto --> darle memoria.
        //clase identificador = new Constructor();
        //Constructor --> Metodo con el mismo nombre que la clase.
        Persona perso1 = new Persona (); //instanciacion
        System.out.print(perso1);
        //perso1 --> referencia --> direccion de memoria
        Vehiculo batimobil = new Vehiculo();
        System.out.print(batimobil);
        batimobil.marca = "Ford";
        batimobil.modelo = "Mustang";
        batimobil.anio = 1965;
        System.out.print("marca: " + batimobil.marca);
        
        System.out.print("modelo: " + batimobil.modelo);
        
        System.out.print("anio: " + batimobil.anio);
    }
    
}

//tipo de dato abstracto 
class Persona{

}

class Vehiculo {
    String marca;
    int anio;
    String modelo;
}