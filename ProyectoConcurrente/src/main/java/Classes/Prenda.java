/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Jose Ramos
 */
public class Prenda extends Objeto {
 private String Talla;
 private String sexo;

    public Prenda() {
    }

    public Prenda(String Talla, String sexo, String NombreO, int Stock, double precio, String descripcion, String Color) {
        super(NombreO, Stock, precio, descripcion, Color);
        this.Talla = Talla;
        this.sexo = sexo;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
 
}
