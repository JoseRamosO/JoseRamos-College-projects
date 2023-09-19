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
public class Cliente extends Usuario {

    private double monedero;
    private int AñosExperiencia;

    public Cliente() {
    }

    public Cliente(String Username, String contraseña) {
        super(Username, contraseña);

    }



    public Cliente(String Username, String correo, String telefono) {
        super(Username, correo, telefono);

    }

    public Cliente(double monedero, int AñosExperiencia, int id_user, String Nombre, String Apellido, String Username, String correo, String contraseña, int Edad, String telefono, String Foto) {
        super(id_user, Nombre, Apellido, Username, correo, contraseña, Edad, telefono, Foto);
        this.monedero = monedero;
        this.AñosExperiencia = AñosExperiencia;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    @Override
    public void IniciarSesion() {
        super.IniciarSesion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarse() {
        super.registrarse(); //To change body of generated methods, choose Tools | Templates.
    }

    public void Comprar() {
    }

    public void CalificarSendero() {
    }

    @Override
    public int compareTo(Usuario pUsuario) {
        return this.Username.compareTo(pUsuario.getUsername());
    }

    @Override
    public boolean equals(Object x) {
        try {
            Usuario vUsuario = (Usuario) x;
            return this.Username.equals(vUsuario.getUsername());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {

        return super.Username;

    }

}
