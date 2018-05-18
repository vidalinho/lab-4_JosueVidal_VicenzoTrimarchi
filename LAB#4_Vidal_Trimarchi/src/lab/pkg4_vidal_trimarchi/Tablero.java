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
public class Tablero {

    String[][] tablero = new String[10][10];

    public Tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "*";
            }
        }
        tablero[0][0] = "c";
        tablero[0][9] = "c";
        tablero[9][0] = "C";
        tablero[9][9] = "C";

        tablero[0][2] = "f";
        tablero[9][2] = "F";
        tablero[0][7] = "f";
        tablero[9][7] = "F";

        tablero[0][3] = "a";
        tablero[0][6] = "a";
        tablero[9][3] = "A";
        tablero[9][6] = "A";

        tablero[1][0] = "d";
        tablero[1][3] = "d";
        tablero[1][2] = "a";
        tablero[1][4] = "c";
        tablero[1][5] = "f";
        tablero[1][6] = "d";
        tablero[1][7] = "a";
        tablero[1][9] = "d";

        tablero[8][0] = "D";
        tablero[8][3] = "D";
        tablero[8][2] = "A";
        tablero[8][4] = "F";
        tablero[8][5] = "C";
        tablero[8][6] = "D";
        tablero[8][7] = "A";
        tablero[8][9] = "D";

        tablero[0][4] = "r";
        tablero[9][5] = "R";

        tablero[0][5] = "m";
        tablero[9][4] = "M";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }

    }

    public Tablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

}
