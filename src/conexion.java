import java.sql.*;

public class conexion {
    public Connection conex;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/persona","root","");
            System.out.println("Conexion establecida");
            
        } catch (Exception e) {
            System.out.println("No fue posible la conexion."+e.getMessage());
        }
        return conex;
    }


    
}
