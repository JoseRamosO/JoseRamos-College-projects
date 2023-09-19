/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Ramos
 */
public abstract class Usuario implements Serializable, Comparable<Usuario> {

    protected int id_user;
    protected String Nombre;
    protected String Apellido;
    protected String Username;
    protected String correo;
    protected String contraseña;
    protected int Edad;
    protected String telefono;
    protected String Foto;

    public Usuario() {
    }

    public Usuario(String Username, String contraseña) {
        this.Username = Username;
        this.contraseña = contraseña;
    }

    public Usuario(String Username, String correo, String telefono) {
        this.Username = Username;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Usuario(int id_user, String Nombre, String Apellido, String Username, String correo, String contraseña, int Edad, String telefono, String Foto) {
        this.id_user = id_user;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Username = Username;
        this.correo = correo;
        this.contraseña = contraseña;
        this.Edad = Edad;
        this.telefono = telefono;
        this.Foto = Foto;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getCorreo() {
        String p = correo.substring(0, 1);
        int k = correo.indexOf("@");
        String q = correo.substring(k);
        String correoOculto = p + "*****" + q;
        return correoOculto;
    }

    public String getCorreo(int num) {
        return correo;
    }

    public void setCorreo(String correo) {
        int t = 0;
        do {
            if (correo.contains("@")) {
                this.correo = correo;
                t=1;
            } else {
                correo = JOptionPane.showInputDialog("Digite un correo valido");
            }
        }while(t!=1);
        
    
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public void registrarse() {
    }

    public void IniciarSesion() {
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

}
