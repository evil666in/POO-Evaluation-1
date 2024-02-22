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
public class EVA1_8_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                           //Constructor
        Television tv = new Television();
        tv.bajarVolumen();
        tv.bajarCanal();
        tv.power();
        
        
        tv.imprimirConfig();
        
        
    }
    
}
