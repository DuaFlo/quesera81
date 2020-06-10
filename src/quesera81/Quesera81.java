
package quesera81;

import Modelo.modelo;
import Vistas.Login;


public class Quesera81 {

   
    public static void main(String[] args) {
        
        modelo mod = new modelo();
        mod.conectar();
        
       Login l = new Login();
       l.setVisible(true);//true=visible,False=invisible
       
    }
    
}
