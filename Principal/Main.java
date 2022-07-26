
package Principal;

//importar librerias herencia

import Vistas.*;
import Modelo.*;
import java.sql.SQLException;

public class Main {
    
   public static void main(String[] args) throws SQLException{
       // crear la instancia de la login
       Login login = new Login();
       // setVisible deja ver la ventana
       login.setVisible(true);
       
       // crear instancia de conexion
       Conexion conexion = new Conexion();
       conexion.getConnection();
       
       
       
       
       
       
   
   }

       
}
