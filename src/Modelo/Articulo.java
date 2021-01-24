/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.enums.Categoria;

/**
 *
 * @author Sebastian
 */
public class Articulo {
    private long IdArticulo;
    private String NombreArticulo;
    private int Cantidad;
    private Categoria Categoria;

    public long getIdArticulo() {
        return IdArticulo;
    }

    public void setIdArticulo(long IdArticulo) {
        this.IdArticulo = IdArticulo;
    }

    public String getNombreArticulo() {
        return NombreArticulo;
    }

    public void setNombreArticulo(String NombreArticulo) {
        this.NombreArticulo = NombreArticulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }
    
    
}
