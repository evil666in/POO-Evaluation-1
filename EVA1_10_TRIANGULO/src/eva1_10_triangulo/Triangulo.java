/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_triangulo;

/**
 *
 * @author invitado
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        base = -1;
        altura = -1;
    }
    
    public double getbase (){
        return base;
    }
    
    public void setbase (double valor){
        base = valor;
    }
    
    public double getaltura (){
        return altura;
    }
    
    public void setaltura (double valor){
        altura = valor;
    }
    
    private double calcularArea(){
        return (base + altura) / 2;
    }
    
    private double calcularPeri(){
        double peri;
        peri = base + altura + (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
        return peri;
    }
    
    public void imprimirDatos (){
        System.out.println("Base: " + getbase());
        System.out.println("ALtura: "+ getaltura());
        System.out.println("El área del triándulo es: " + calcularArea());
        System.out.println("El perimetro del tripangulo es; " + calcularPeri());
    }
}
