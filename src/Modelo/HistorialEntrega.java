/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class HistorialEntrega {
    private long IdHEntrega;
    private Envio envio;
    private Empleado camionero;
    private Camion Camion;
    private Date Fecha_entrega;
    private String Ciudad_origen;
    private String Ciudad_destino;

    public long getIdHEntrega() {
        return IdHEntrega;
    }

    public void setIdHEntrega(long IdHEntrega) {
        this.IdHEntrega = IdHEntrega;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public Empleado getCamionero() {
        return camionero;
    }

    public void setCamionero(Empleado camionero) {
        this.camionero = camionero;
    }

    public Camion getCamion() {
        return Camion;
    }

    public void setCamion(Camion Camion) {
        this.Camion = Camion;
    }

    public Date getFecha_entrega() {
        return Fecha_entrega;
    }

    public void setFecha_entrega(Date Fecha_entrega) {
        this.Fecha_entrega = Fecha_entrega;
    }

    public String getCiudad_origen() {
        return Ciudad_origen;
    }

    public void setCiudad_origen(String Ciudad_origen) {
        this.Ciudad_origen = Ciudad_origen;
    }

    public String getCiudad_destino() {
        return Ciudad_destino;
    }

    public void setCiudad_destino(String Ciudad_destino) {
        this.Ciudad_destino = Ciudad_destino;
    }  
}
