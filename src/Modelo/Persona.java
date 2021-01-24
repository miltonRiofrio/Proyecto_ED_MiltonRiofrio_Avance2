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
public class Persona {
    private long IdPersona;
    private String Nombre;
    private String CI_RUC;
    private String Telefono;
    private String Ciudad;
    private String Direccion;

    public long getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(long IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCI_RUC() {
        return CI_RUC;
    }

    public void setCI_RUC(String CI_RUC) {
        this.CI_RUC = CI_RUC;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
}
