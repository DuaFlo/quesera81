
package Modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class modelo {
    
    private static Connection con;
    private static final String usuario = "root";//Guardando usuario
    private static final String pass = "";//Guardando contraseña
    private static final String url = "jdbc:mysql://localhost/queserala81";//Guardando ruta
    
    public void conectar(){
        con = null;//Borrar conexion (Cuelga)
        try{//Puede o no poner error  //Si no pone error entra a las linea 21
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,pass);//Llamamos ruta, usuario, contraseña
            if(con != null){   //SI es diferente de null conecta     
                JOptionPane.showMessageDialog(null,"Conexión establecida");      
            }    
        }catch(HeadlessException | ClassNotFoundException | SQLException e){    //Si poner error entra a las linea 27     //Error tipo exeption
            JOptionPane.showMessageDialog(null,"ERROR X_X: " + e);
       }
         
        
    }
    
    public Connection getConeccion(){
    
        return con;
    
    }
}
