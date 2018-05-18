/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_vidal_trimarchi;

import java.util.Scanner;

/**
 *
 * @author josue
 */
public class LAB4_Vidal_Trimarchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][]tablero= new String[11][11];
        Scanner lea = new Scanner(System.in);
        int opc = 0;
        while (opc < 5) {
            System.out.println("    ---MENU---");
            System.out.println("1) Agregar jugador");
            System.out.println("2) Eliminar jugador");
            System.out.println("3) Listar jugadores");
            System.out.println("4) Jugar");
            System.out.println("5) Salir");
            opc = lea.nextInt();
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                   Tablero m=new Tablero();
                   
                    break;
            }
        }
    }

}
