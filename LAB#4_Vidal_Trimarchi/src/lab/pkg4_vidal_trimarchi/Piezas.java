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
public class Piezas implements ataques{
    int movimiento;
    String Color;
    String material;

    public Piezas(int movimiento, String Color, String material) {
        this.movimiento = movimiento;
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
    

    public Piezas(int movimiento) {
        this.movimiento = movimiento;
    }

    public Piezas() {
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public String toString() {
        return "Piezas{" + "movimiento=" + movimiento + ", Color=" + Color + ", material=" + material + '}';
    }
    
    
}
