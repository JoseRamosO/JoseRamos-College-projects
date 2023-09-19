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
public class Rutas {

    private int id_ruta;
    private String ubicacion;
    //private String fotografía;
    private Accesorio accesorio;
    private Prenda prenda;
    private double Calificación;
    private int dificualtad;
    private String horario;
    private boolean MayorEdad;

    public Rutas() {
    }

    public Rutas(int id_ruta, String ubicacion, Accesorio accesorio, Prenda prenda, double Calificación, int dificualtad, String horario, boolean MayorEdad) {
        this.id_ruta = id_ruta;
        this.ubicacion = ubicacion;
        this.accesorio = accesorio;
        this.prenda = prenda;
        this.Calificación = Calificación;
        this.dificualtad = dificualtad;
        this.horario = horario;
        this.MayorEdad = MayorEdad;
    }

    public int getDificualtad() {
        return dificualtad;
    }

    public void setDificualtad(int dificualtad) {
        this.dificualtad = dificualtad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isMayorEdad() {
        return MayorEdad;
    }

    public void setMayorEdad(boolean MayorEdad) {
        this.MayorEdad = MayorEdad;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Accesorio getAccesorio() {
        return accesorio;
    }

    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public double getCalificación() {
        return Calificación;
    }

    public void setCalificación(double Calificación) {
        this.Calificación = Calificación;
    }

    public void trazarRuta() {

    }

    public void mostrarRuta() {

    }
}
