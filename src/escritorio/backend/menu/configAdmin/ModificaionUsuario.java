/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio.backend.menu.configAdmin;

import java.util.ArrayList;
import modelos.database.UsuarioDb;
import modelos.objetos.Usuario;

/**
 *
 * @author sergio
 */
public class ModificaionUsuario {
    
    public static ArrayList<Usuario> obtenerUsuarios(){
        UsuarioDb ud= new UsuarioDb();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.addAll(ud.leerUsuarios());
        return usuarios;
        
    }
}
