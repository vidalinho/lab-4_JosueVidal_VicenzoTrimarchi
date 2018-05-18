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
public class duendes extends Piezas{

 public boolean Movimiento(int i,int j,int i2,int j2) {
     boolean bresp=false;
     if((i+1==i2&&j==j2)){
         bresp=true;
     }else{
         bresp=false;
     }
        return bresp;
        
    }
 
    public boolean ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
