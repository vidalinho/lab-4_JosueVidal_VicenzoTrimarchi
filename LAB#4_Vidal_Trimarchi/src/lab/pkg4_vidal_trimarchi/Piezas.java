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
public class Piezas {
    String Color;
    String material;

    public Piezas(String Color, String material) {
      
        this.Color = Color;
        this.material = material;
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
    



    public Piezas() {
    }


    @Override
    public String toString() {
        return "Piezas{"+ ", Color=" + Color + ", material=" + material + '}';
    }
    
    
    public boolean ataque() {
        return false;
        
    }
     public boolean Movimiento(int i, int j, int i2, int j2) {
        return false;
         
     }
    
}
