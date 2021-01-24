/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ListaDoble.ListaDoble;
import Modelo.enums.Prioridad;

/**
 *
 * @author Sebastian
 */
public class Envio {
    private long IdEnvio;
    private double Precio;
    private Paquete Paquete;
    private ListaDoble HEntrega = new ListaDoble();
    private Prioridad prioridad;
    private String Estado;

    public long getIdEnvio() {
        return IdEnvio;
    }

    public void setIdEnvio(long IdEnvio) {
        this.IdEnvio = IdEnvio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Paquete getPaquete() {
        return Paquete;
    }

    public void setPaquete(Paquete Paquete) {
        this.Paquete = Paquete;
    }

    public ListaDoble getHEntrega() {
        return HEntrega;
    }

    public void setHEntrega(ListaDoble HEntrega) {
        this.HEntrega = HEntrega;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
