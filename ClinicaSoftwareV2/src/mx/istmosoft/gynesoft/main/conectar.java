package mx.istmosoft.gynesoft.main;


import java.sql.*;
import javax.swing.*;
/**
 *
 * @author lozseli
 */

public class conectar {
Connection conect = null;
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("com.mysql.jdbc.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/login","root","loze9214");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
}}
