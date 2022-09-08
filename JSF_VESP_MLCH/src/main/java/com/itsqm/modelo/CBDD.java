package com.itsqm.modelo;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CBDD {
    
    private Statement st;
    private String driver;
    private String user;
    private String clave;
    private String cadena;
    private Connection con;
    
    public CBDD(){
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.user = "root";
        this.clave = "";
        this.cadena = "jdbc:mysql://localhost:3306/sis_inventario?useSSL=false";
        this.con = this.crearConexion();
    }

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getClave() {
        return clave;
    }

    public String getCadena() {
        return cadena;
    }

    public Connection getCon() {
        return con;
    }
    
    private Connection crearConexion(){
        try {
            Class.forName(getDriver()).newInstance();
            Connection con = DriverManager.getConnection(getCadena(),getUser(),getClave());
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet consulta(String sql){
        ResultSet rs = null;
        try {
            st = getCon().createStatement();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public boolean ejecutar(String sql){
        boolean resp = false;
        try {
            st = getCon().createStatement();
            int bandera = st.executeUpdate(sql);
            if(bandera == 1){
                resp = true;
            }else{
                resp = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
    
}
