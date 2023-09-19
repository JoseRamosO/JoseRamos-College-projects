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
public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(int id_user, String Nombre, String Apellido, String Username, String correo, String contraseña, int Edad, String telefono,String Foto) {
        super(id_user, Nombre, Apellido, Username, correo, contraseña, Edad, telefono,Foto);
    }

    public Administrador(String Username, String contraseña) {
        super(Username,contraseña);
    }

    @Override
    public void IniciarSesion() {
        super.IniciarSesion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarse() {
        super.registrarse(); //To change body of generated methods, choose Tools | Templates.
    }
    public void CrearSenderos(){}
    public void AgregarArticulos(){}

}
