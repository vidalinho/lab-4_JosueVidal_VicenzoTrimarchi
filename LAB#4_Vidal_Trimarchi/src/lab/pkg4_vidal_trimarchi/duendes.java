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
private boolean bresp;
 public boolean Movimiento(int i,int j,int i2,int j2) {
     boolean bresp=false;
     if((i+1==i2&&j==j2)){
         bresp=true;
     }else if((i-1==i2&&j==j2)){
         bresp=true;
         
     }else{
         bresp=false;
     }
     this.bresp=bresp;
        return bresp;
        
    }

    public duendes() {
    }

    public duendes(boolean bresp, String Color, String material) {
        super(Color, material);
        this.bresp = bresp;
    }

    public duendes(boolean bresp) {
        this.bresp = bresp;
    }
 
    public boolean ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isBresp() {
        return bresp;
    }

    public void setBresp(boolean bresp) {
        this.bresp = bresp;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "duendes{" + "bresp=" + bresp + '}';
    }
    
    
}
