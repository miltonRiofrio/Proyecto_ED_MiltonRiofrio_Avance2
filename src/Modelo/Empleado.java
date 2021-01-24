/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Sebastian
 */
public class Empleado extends Persona {
    private int AniosTrabajo;
    private double Sueldo;
    private String Licencia;
    private String Rol;

    public int getAniosTrabajo() {
        return AniosTrabajo;
    }

    public void setAniosTrabajo(int AniosTrabajo) {
        this.AniosTrabajo = AniosTrabajo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
}
