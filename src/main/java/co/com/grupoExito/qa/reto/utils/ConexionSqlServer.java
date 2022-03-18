package co.com.grupoExito.qa.reto.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionSqlServer {

    //SQLSERVER
    private String strHostSqlServer = "";
    private String strUserSqlServer = "";
    private String strPasswordSqlServer = "";
    private String strPortSqlServer = "";
    private String strServiceSqlServer ="";
    private Connection conexion;
    
  
    
    
    public Connection conectarme() {  
	        	try {
	     		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	     		   String cadenaConexion = "jdbc:sqlserver://"+strHostSqlServer+":"+strPortSqlServer+";databaseName="+strServiceSqlServer+";user="+strUserSqlServer+";password="+strPasswordSqlServer+"";                       
                   conexion = DriverManager.getConnection(cadenaConexion);
	               System.out.println("Conexion exitosa SQL SERVER");             
	 		 } catch (ClassNotFoundException ex) {
	 			 System.err.println("Error Cargando la Clase "+toString()+"\n"+ex.getMessage());
	          }catch (SQLException ex) {
	 			System.err.println("Error intentando crear la conexion "+toString()+"\n"+ex.getMessage());
	 		}
		
    	 return this.conexion;
    }
    
    public void close() throws SQLException {
        if(this.conexion != null){
           this.conexion.close();
           System.out.println("Conexion Cerrada");
        }
    }  
    
    
    
    



    
    
}
