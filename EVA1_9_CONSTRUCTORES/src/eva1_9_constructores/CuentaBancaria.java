/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_constructores;

/**
 *
 * @author invitado
 */
public class CuentaBancaria {
    private int numCuenta;
    private double saldo;
    private String cliente;
    
    //CONSTRUCTORES
    public CuentaBancaria(){
        numCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 1000000;
        
    }
    
    //GET Y SET
    public int getnumCuenta(){
        return numCuenta;
    }
    
    public void setnumCuenta(int cuenta){
        numCuenta = cuenta;
    }
    
    public String getcliente (){
        return cliente;
    }
    
    public void setcliente(String numCliente){
        cliente = numCliente;
    }
    
    public double getSaldo (){
        return saldo;
    }
    
    public void retirar (double monto){
        if(saldo >= monto)
            saldo = saldo - monto;
    }
    
    public void depositar (double deposito){
        saldo = saldo + deposito;
    }
}
