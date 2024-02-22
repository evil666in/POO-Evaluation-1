/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_vehiculo;

/**
 *
 * @author evely
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double valor;
    
    public void setmarca(String valor){
        marca = valor;
    }
    
    public void setmodelo (String valor){
        modelo = valor;
    }
    
    public void setanio (int valor){
        anio = valor;
    }
    
    public void setcolor (String valor){
        color = valor;
    }
    
    public void setvalor (double monto){
        valor = monto;
    }
}
