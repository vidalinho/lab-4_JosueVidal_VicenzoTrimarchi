/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_vidal_trimarchi;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class LAB4_Vidal_Trimarchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] tablero = new String[11][11];
        Scanner lea = new Scanner(System.in);
        ArrayList jugadores = new ArrayList();
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
                    System.out.println("Ingrese nombre: ");
                    String nombre = lea.next();
                    System.out.println("Ingrese usuario: ");
                    String usuario = lea.next();
                    int puntos = 0;
                    System.out.println("Ingrese lugar de nacimiento: ");
                    String lugar = lea.next();
                    System.out.println("Ingrese edad: ");
                    int edad = lea.nextInt();
                    System.out.println("Ingrese sexo[F/M]: ");
                    String sexo = lea.next();
                    jugadores.add(new Jugador(nombre, usuario, lugar, edad, sexo));
                    break;
                case 2:
                    for (Object t : jugadores) {
                        if (t instanceof Jugador) {
                            System.out.println(jugadores.indexOf(t) + " " + t);
                        }
                    }
                    System.out.println("ingrese el indice de quien quiere eliminar:");
                    int eliminar = lea.nextInt();
                    jugadores.remove(eliminar);
                    break;
                case 3:
                    for (Object t : jugadores) {
                        if (t instanceof Jugador) {
                            System.out.println(jugadores.indexOf(t) + " " + t);
                        }
                    }
                    break;
                case 4:
                    Tablero m = new Tablero();

                    break;
            }
        }
    }

}
