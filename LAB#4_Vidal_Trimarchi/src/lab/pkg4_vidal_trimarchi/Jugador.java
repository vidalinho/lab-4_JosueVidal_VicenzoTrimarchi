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
public class Jugador {
    private String Nombre;
    private String Usuario;
    private int puntos=0;
    private String nacimiento;
    private int edad;
    private String sexo;

    public Jugador() {
    }

    public Jugador(String Nombre, String Usuario, String nacimiento, int edad, String sexo) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", Usuario=" + Usuario + ", puntos=" + puntos + ", nacimiento=" + nacimiento + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}
