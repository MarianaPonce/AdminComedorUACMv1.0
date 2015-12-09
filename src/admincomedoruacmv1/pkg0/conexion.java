/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admincomedoruacmv1.pkg0;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mariana
 */
public class conexion {
    Connection con= null;

    /**
     *
     * @return
     */
    public Connection conectar(){
    try{
    //cargar nuestro driver
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost/db_comedoruacmv2", "root", "ponglez2646");
        System.out.println("conexion establecida");
        JOptionPane.showMessageDialog(null, "conexion establecida ");
    }catch (ClassNotFoundException | SQLException e){
        System.out.println("error de conexion");
        JOptionPane.showMessageDialog(null, "error de conexion "+e);
    }
    return con;
    }

    
    
}
