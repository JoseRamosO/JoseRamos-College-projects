/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Jose Ramos
 */
public abstract class Objeto implements Serializable, Comparable<Usuario> {

    private String NombreO;
    private int Stock;
    private double precio;
    private String descripcion;
    private String Color;
    private int Grupo;

    public Objeto() {
    }

    public Objeto(String NombreO, int Stock, double precio, String descripcion, String Color) {
        this.NombreO = NombreO;
        this.Stock = Stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.Color = Color;
    }

    @Override
    public int compareTo(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreO() {
        return NombreO;
    }

    public void setNombreO(String NombreO) {
        this.NombreO = NombreO;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
