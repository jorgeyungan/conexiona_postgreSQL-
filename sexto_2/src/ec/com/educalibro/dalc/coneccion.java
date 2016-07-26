/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.dalc;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author iorys
 */
public class coneccion {
    private Connection cn;
    
    public void conectar() throws Exception{
        String cadena="jdbc:postgresql://localhost:5432/factura";
        String user="postgres";
        String pass="postgre";
        
        try {
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection(cadena,user,pass);
            //cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/factura?user=postgres?pass=postgre");
            
               //getConnection("jdbc:mysql://localhost:3306/prueba?user=root");
        } catch (Exception ex) {
            throw ex;
        }
       
    }
    public void cerrar() throws Exception{
        try {
            if(cn != null){
                if(cn.isClosed()==false){
                    cn.close();
                }
            }
        }catch (Exception ex) {
            throw ex;
        }
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    
}
