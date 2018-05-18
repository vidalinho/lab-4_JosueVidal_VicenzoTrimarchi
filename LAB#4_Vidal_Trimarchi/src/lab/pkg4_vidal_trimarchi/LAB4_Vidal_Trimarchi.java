/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_vidal_trimarchi;

import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author josue
 */
public class LAB4_Vidal_Trimarchi {

    static String[][] tablero = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
                    tablero = m.getTablero();
                    int j1 = 0;
                    boolean m1 = false;
                    boolean m2 = false;
                    int j2 = 0;
                    int posi,
                     posj;
                    int posi2,
                     posj2;
                    Piezas jug1=new Piezas("Blancas","Cobre");
                    Piezas jug2=new Piezas("Negras","Plata");

                    do {
                        do {
                            
                            System.out.println("**********************");
                            int cont = 0;
                            try {
                                Imprime(tablero);

                                System.out.println("Ingrese coordenada en i");
                                posi = lea.nextInt();
                                validar(posi);
                                System.out.println("Ingrese coordenada en j");
                                posj = lea.nextInt();
                                validar2(posj);
                                if(tablero[posi][posj].equals("c")){
                                     ((caballero)jug1).ataque();
                                }else if (tablero[posi][posj].equals("d")){
                                     ((Dragon)jug1).ataque();
                                }
                               
                                System.out.println("Ingrese la nueva Posicion i");
                                posi2 = lea.nextInt();
                                System.out.println("Ingrese la nueva posicion de j");
                                posj2 = lea.nextInt();

                                esValidoj1(posi, posj, posi2, posj2);
                            } catch (Ex es) {
                                System.out.println(es.getMessage());
                            }
                        } while (m1 == false);

                    } while (j1 == 0 && j2 == 0);

                    break;
            }
        }
    }

    public static void Imprime(String tablero[][]) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");

        }
    }

    static void validar(int i) throws Ex {
        if (i < 0 || i > 10) {
            throw new Ex(Color.YELLOW, "Error 'I',tiene que estar entre 0 y 9");
        }
    }

    static void validar2(int j) throws Ex {
        if (j < 0 || j > 10) {
            throw new Ex(Color.YELLOW, "Error 'J',tiene que estar entre 0 y 9");
        }
    }

    public static boolean esValidoj1(int posi, int posj, int posi2, int posj2) {
        boolean bresp = false;
    
        return bresp;

    }

    public static boolean esValidoj2(int posi, int posj, int posi2, int posj2) {
        boolean bresp = false;
        
        
        return bresp;

    }
}
