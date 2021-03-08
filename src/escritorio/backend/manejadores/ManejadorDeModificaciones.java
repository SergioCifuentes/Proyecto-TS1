/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorio.backend.manejadores;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.database.ConexionDb;

/**
 *
 * @author sergio
 */
public class ManejadorDeModificaciones {
    public static void modificarAcercaDe(String text){
        try {
            PreparedStatement statement = ConexionDb.conexion.prepareStatement("UPDATE informacion set descripcionEscritorio=? WHERE id =4;");
             statement.setString(1, text);
             statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorDeModificaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
