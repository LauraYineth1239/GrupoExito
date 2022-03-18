package co.com.grupoExito.qa.reto.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class ConexionAS400 {
	 //Variables Necesarias
    private String strHost="";
    private String strUsuario="";
    private String strPass="";
    private Connection conexion;
    
    //Se Puede usar un Archivo Properties
    /*
     private void cargarDatos() {
		try {
			Properties propiedad= new Properties();
			propiedad.load(new FileInputStream("src/test/resources/dataInicioAS400.properties"));
			strUsuario = propiedad.getProperty("Usuario");
			strPass = propiedad.getProperty("Pass");
			strHost = propiedad.getProperty("Host");
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
    */
    
    public Connection conectarme() {  
    	//cargarDatos();
    	try {
    		   Class.forName("com.ibm.as400.access.AS400JDBCDriver");
               conexion = DriverManager.getConnection("jdbc:as400://"+strHost, strUsuario, strPass);
               System.out.println("Conexion exitosa");             
		 } catch (ClassNotFoundException ex) {
			 System.err.println("Error Cargando la Clase "+toString()+"\n"+ex.getMessage());
         }catch (SQLException ex) {
			System.err.println("Error intentando crear la conexion "+toString()+"\n"+ex.getMessage());
		}
    	 return this.conexion;
    }
    
    public ResultSet Consultar(String sql) throws SQLException{
        if(conexion == null || conexion.isClosed()){
          conectarme();
        }        
        Statement st = conexion.createStatement();
        return st.executeQuery(sql);
    }
    
    public void close() throws SQLException {
        if(this.conexion != null){
           this.conexion.close();
           System.out.println("Conexion Cerrada");
        }
    }  
}
