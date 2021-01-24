/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ListaDoble;

/**
 *
 * @author Milton Riofrio
 */
public class NodoDE {
    private NodoDE ant;
    private String dato;
    private NodoDE sig;

    public NodoDE() {
        ant = null;
        dato = null;
        sig = null;
    }

    public NodoDE(String dato, NodoDE sig, NodoDE ant) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }
    
    public NodoDE getAnt() {
        return ant;
    }

    public void setAnt(NodoDE ant) {
        this.ant = ant;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDE getSig() {
        return sig;
    }

    public void setSig(NodoDE sig) {
        this.sig = sig;
    }
}
