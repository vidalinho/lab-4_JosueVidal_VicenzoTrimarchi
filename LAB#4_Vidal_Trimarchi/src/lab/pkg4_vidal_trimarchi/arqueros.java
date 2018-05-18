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
public class arqueros extends Piezas{

    public boolean Movimiento(int i,int j,int i2,int j2) {
         
          boolean bresp = false;
        if ((i == i2 && (j + 1 == j || j - 1 == j2))) {
            bresp = true;
        } else if ((j == j2 && (i + 1 == i2 || i - 1 == i2))) {
            bresp = true;
        } else if ((j == j2 && (i + 2 == i2 || i - 2 == i2))) {
            bresp = true;

        } else if ((j == j2 && (i + 3 == i2 || i - 3 == i2))) {
            bresp = true;
        } else if ((j == j2 && (i + 4 == i2 || i - 4 == i2))) {
            bresp = true;
        } else if ((j == j2 && (i + 5 == i2 || i - 5 == i2))) {
            bresp = true;
        } else if ((j == j2 && (i + 6 == i2 || i - 6 == i2))) {
            bresp = true;
        } else if ((j == j2 && (i + 7 == i2 || i - 7 == i2))) {
            bresp = true;
        } else if ((i == i2 && (j + 1 == i2 || j - 1 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 2 == i2 || j - 2 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 3 == i2 || j - 3 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 4 == i2 || j - 4 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 5 == i2 || j - 5 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 6 == i2 || j - 6 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 7 == i2 || j - 7 == j2))) {
            bresp = true;
        } else if ((i == i2 && (j + 8 == i2 || j - 8 == j2))) {
            bresp = true;

        } else if (((i + 1 == i2) && j + 1 == j2)) {
            bresp = true;
        } else if (((i + 2 == i2) && j + 2 == j2)) {
            bresp = true;
        } else if (((i + 3 == i2) && j + 3 == j2)) {
            bresp = true;
        } else if (((i + 4 == i2) && j + 4 == j2)) {
            bresp = true;
        } else if (((i + 5 == i2) && j + 5 == j2)) {
            bresp = true;
        } else if (((i + 6 == i2) && j + 6 == j2)) {
            bresp = true;
        } else if (((i + 7 == i2) && j + 7 == j2)) {
            bresp = true;
        } else if (((i + 8 == i2) && j + 8 == j2)) {
            bresp = true;
        } else if (((i - 1 == i2) && j - 1 == j2)) {
            bresp = true;
        } else if (((i - 5 == i2) && j - 5 == j2)) {
            bresp = true;
        } else if (((i - 6 == i2) && j - 6 == j2)) {
            bresp = true;
        } else if (((i - 7 == i2) && j - 7 == j2)) {
            bresp = true;
        } else if (((i - 8 == i2) && j - 8 == j2)) {
            bresp = true;
        } else if (((i - 2 == i2) && j - 2 == j2)) {
            bresp = true;
        } else if (((i - 3 == i2) && j - 3 == j2)) {
            bresp = true;
        } else if (((i - 4 == i2) && j - 4 == j2)) {
            bresp = true;
        } else {
            bresp = false;
        }

        return bresp;

    
    }
  
    public boolean ataque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
