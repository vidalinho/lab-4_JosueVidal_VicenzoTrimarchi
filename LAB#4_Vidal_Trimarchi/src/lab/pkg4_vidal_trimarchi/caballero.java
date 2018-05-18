/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_vidal_trimarchi;

/**
 *
 * @author X
 */
public abstract class caballero extends Piezas {
    public boolean Movimiento(int i,int j,int i2,int j2) {
           boolean bresp=false;
     if((i==i2&&(j+1==j||j-1==j2))){
         bresp=true;
     }else if((j==j2&&(i+1==i2||i-1==i2))){
        bresp=true; 
     }else{
         bresp=false;
     }
        return bresp;
        
    }
    

    public caballero() {
    }
    
}
