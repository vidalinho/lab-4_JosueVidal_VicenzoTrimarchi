/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_vidal_trimarchi;

import java.awt.Color;

/**
 *
 * @author josue
 */
public class Ex extends Exception {

    private Color color;

    public Ex() {
        super();
    }

    public Ex(Color color, String string) {
        super(string);
        this.color = color;
    }

    public Ex(Color color, String string, Throwable thrwbl) {
        super(string, thrwbl);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Miexcepcion{" + "color=" + color + '}';
    }
}
