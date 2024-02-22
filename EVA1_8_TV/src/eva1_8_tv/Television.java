/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_tv;

/**
 *
 * @author invitado
 */
public class Television {
    //ATRIBUTOS
    private int volumen;
    private int canal;
    private boolean EstaEncendida;
    
    //CONSTRUCTORES:
    //CONSTRUCTOR SIN ARGUMENTOS: CONSTRUCTOR DEFAULT
    //Método para inicializar los objetos:
    public Television(){
        //NO ES OBLIGATORIO
       volumen = 30;
       canal = 5;
       EstaEncendida = false;
       
    }
    
    public void subirVolumen(){
        if(EstaEncendida && (volumen < 100))
        volumen = volumen + 1;
        //vlumen+=1;
        //volumen++;
    }       
    
    public void bajarVolumen(){
        if(EstaEncendida && (volumen > 0))
        volumen = volumen - 1;
    }
    
    public void subirCanal(){
        if(EstaEncendida)
        canal = canal + 1;
    }
    
    public void bajarCanal(){
        if(EstaEncendida && (canal > 0))
        canal = canal - 1;
    }
    
    public void cabiarCanal(int numCanal){
                        // "!" es una negación 
        if(EstaEncendida && !(numCanal < 0))
        canal = numCanal;
    }
    
    public void power(){
        /*if(EstaEncendida == true)
            EstaEncendida = false;
        else
            EstaEncendida = true;*/
        EstaEncendida = !EstaEncendida;
    }
    
    public void imprimirConfig(){
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + EstaEncendida);
    }
}
