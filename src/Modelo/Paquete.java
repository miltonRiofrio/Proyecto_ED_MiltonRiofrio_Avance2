/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ListaDoble.ListaDoble;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Paquete {
    private long IdPaquete;
    private Persona Destinatario;
    private Persona Remitente;
    private double Peso;
    private boolean Fragil;
    private Date Fecha_Envio;
    private Date Fecha_Entrega;
    private ListaDoble Contenido = new ListaDoble();

    public long getIdPaquete() {
        return IdPaquete;
    }

    public void setIdPaquete(long IdPaquete) {
        this.IdPaquete = IdPaquete;
    }

    public ListaDoble getContenido() {
        return Contenido;
    }

    public void setContenido(ListaDoble Contenido) {
        this.Contenido = Contenido;
    }

    public Persona getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(Persona Destinatario) {
        this.Destinatario = Destinatario;
    }

    public Persona getRemitente() {
        return Remitente;
    }

    public void setRemitente(Persona Remitente) {
        this.Remitente = Remitente;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public boolean isFragil() {
        return Fragil;
    }

    public void setFragil(boolean Fragil) {
        this.Fragil = Fragil;
    }

    public Date getFecha_Envio() {
        return Fecha_Envio;
    }

    public void setFecha_Envio(Date Fecha_Envio) {
        this.Fecha_Envio = Fecha_Envio;
    }

    public Date getFecha_Entrega() {
        return Fecha_Entrega;
    }

    public void setFecha_Entrega(Date Fecha_Entrega) {
        this.Fecha_Entrega = Fecha_Entrega;
    }
}
