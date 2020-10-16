
package Modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    public void RegistroUsuario(int id, String nombre, String usuario, String pass){
       
        
        try{
            PreparedStatement ps;  //statement se usa para ejecutar comandos sobre la base de datos
            
            ps = con.prepareStatement("INSERT INTO usuarios (id, nombre, usuario, pass) VALUES (?, ?, ?, ?);");//que comando se va a ejecutar
            ps.setString(1, id + "");//se cambian los "?" por datos
            ps.setString(2, nombre);
            ps.setString(3, usuario);
            ps.setString(4, pass);
           
            int respuesta = ps.executeUpdate();//respuesta, se ejecuta el comando
            if(respuesta > 0){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Error de registro");
            
            }
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
    public void RegistroProducto(String nombre, String marca, int precio){
       
        
        try{
            PreparedStatement ps;  //statement se usa para ejecutar comandos sobre la base de datos
            
            ps = con.prepareStatement("INSERT INTO productos (nombre, marca, precio) VALUES (?, ?, ?);");//que comando se va a ejecutar
            ps.setString(1, nombre + "");//se cambian los "?" por datos
            ps.setString(2, marca);
            ps.setInt(3, precio );

           
            int respuesta = ps.executeUpdate();//respuesta, se ejecuta el comando
            if(respuesta >0){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Error de registro");
            
            }
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
    
    public boolean Login(int cedula, String contraseña){
       
        
        try{
            PreparedStatement ps;  //statement se usa para ejecutar comandos sobre la base de datos
            
            ps = con.prepareStatement("SELECT * FROM usuarios WHERE id = ? AND pass = ?;");//Buscar el usuario en MYSQL
            ps.setInt(1, cedula );//se cambian los "?" por datos
            ps.setString(2, contraseña);
            
            ResultSet rs;
            rs = ps.executeQuery();
            
            if (rs.next()) {//para saber si existen los datos
                JOptionPane.showMessageDialog(null, "El usuario si existe");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }
           return false;
           
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    return false;
    }
    public DefaultTableModel listarproductos(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            PreparedStatement ps = null ;
            ResultSet rs = null;
            String sql = "SELECT * FROM productos";
            ps = con.prepareStatement(sql);//Buscar el usuario en MYSQL
            rs = ps.executeQuery();

            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();// para saber cuantos resultados llegaron
            modelo.addColumn("marca");
            modelo.addColumn("precio");
            modelo.addColumn("codigo");
            modelo.addColumn("nombre");
            modelo.addColumn("bodega");
            while (rs.next()) {
                Object[] filas  = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    filas[i] = rs.getObject( i +1 );
                }
                modelo.addRow(filas);
                
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    
    }
     public DefaultTableModel listarproductos(String codigo){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            PreparedStatement ps = null ;
            ResultSet rs = null;
            String sql = "SELECT * FROM productos WHERE codigo= " + codigo;
            ps = con.prepareStatement(sql);//Buscar el usuario en MYSQL
            rs = ps.executeQuery();

            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();// para saber cuantos resultados llegaron
            modelo.addColumn("marca");
            modelo.addColumn("precio");
            modelo.addColumn("codigo");
            modelo.addColumn("nombre");
            modelo.addColumn("bodega");
            while (rs.next()) {
                Object[] filas  = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    filas[i] = rs.getObject( i +1 );
                }
                modelo.addRow(filas);
                
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    
    }
     
     public DefaultTableModel buscarusuario(String codigo){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            PreparedStatement ps = null ;
            ResultSet rs = null;
            String sql = "SELECT * FROM usuarios WHERE id= " + codigo;
            //JOptionPane.showMessageDialog(null, sql);//
            ps = con.prepareStatement(sql);//Buscar el usuario en MYSQL
            rs = ps.executeQuery();

            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();// para saber cuantos resultados llegaron
            modelo.addColumn("id");
            modelo.addColumn("nombre");
            modelo.addColumn("usuario");
            modelo.addColumn("pass");
            modelo.addColumn("tipo");
            while (rs.next()) {
                Object[] filas  = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    filas[i] = rs.getObject( i +1 );
                }
                modelo.addRow(filas);
                
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    
    }
     
     public void EditarProducto(String nombre, String marca, String precio, String codigo, String bodega){
       
        
        try{
            PreparedStatement ps;  //statement se usa para ejecutar comandos sobre la base de datos
         
            ps = con.prepareStatement("UPDATE productos SET marca = '" + marca + "', precio = " + precio + ", nombre = '" + nombre + "', bodega = " + bodega + " WHERE codigo = " + codigo + ";");//que comando se va a ejecutar
            

           
            int respuesta = ps.executeUpdate();//respuesta, se ejecuta el comando
                JOptionPane.showMessageDialog(null, "Registro exitoso");
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
     }
     
     public void EditarUsuario(String nombre, String usuario, String pass, String codigo){
       
        
        try{
            PreparedStatement ps;  //statement se usa para ejecutar comandos sobre la base de datos
            String s = "UPDATE usuarios SET nombre = '" + nombre + "', usuario = '" + usuario + "', pass = '" + pass + "'  WHERE id = " + codigo + ";";
            
            //JOptionPane.showMessageDialog(null, s);
            ps = con.prepareStatement(s);//que comando se va a ejecutar
            

           
            int respuesta = ps.executeUpdate();//respuesta, se ejecuta el comando
                JOptionPane.showMessageDialog(null, "Registro exitoso");
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
}