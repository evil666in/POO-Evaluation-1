/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso = new Persona();
        perso.setnombre("Juan");
        perso.setapellidos("Perez");
        perso.setedad(50);
        
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nacio en el año " + perso.calcularAnnioNac());
        
        //-------
        Persona[] grupo = new  Persona [3];
        //HAY QUE CREAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++){
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona ();
            //UNA VEZ CREADO EL OBJETO, HAY QUE LLENARLO:
            System.out.println("Introduce el nombre: ");
            String nombre = input.nextLine();
            grupo[i].setnombre(nombre);
            
            System.out.println("Introduce el apellido: ");
            String apellidos = input.nextLine();
            grupo[i] .setapellidos(apellidos);
            
            System.out.println("Introdice la edad: ");
            int edad = input.nextInt();
            grupo[i].setedad(edad);
            
        }
        //Leer
        for (int i = 0; i < grupo.length; i++){
            System.out.println("El nombre es " + grupo[i].generarNombreCom());
            System.out.println("Nacio en el año " + grupo[i].calcularAnnioNac());
        }
        
    
    
}
}
