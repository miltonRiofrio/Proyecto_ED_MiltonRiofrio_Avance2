/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.enums.Capacidad;

/**
 *
 * @author Sebastian
 */
public class Camion {
    private String Placa;
    private String Modelo;
    private Capacidad Capacidad;

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Capacidad getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(Capacidad Capacidad) {
        this.Capacidad = Capacidad;
    }
    
    
}
