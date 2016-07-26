/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.dalc;

import ec.com.educalibro.entidades.clsCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author iorys
 */
public class clienteDalc extends coneccion {
    public void registrar(clsCliente c) throws Exception{
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO cliente(ruc,nombre,telefono) values (?,?,?)");
            st.setString(1, c.getRuc());
            st.setString(2, c.getNombre());
            st.setString(3, c.getTelefono());
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.cerrar();
        }
    }
    public List<clsCliente> listar() throws Exception{
        List<clsCliente> lista;
        ResultSet rs;
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("SELECT id,ruc,nombre,telefono FROM cliente");
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                clsCliente c = new clsCliente();
                c.setId(rs.getInt("id"));
                c.setRuc("ruc");
                c.setNombre(rs.getString("nombre"));
                c.setTelefono("telefono");
                
                lista.add(c);
            }
        }catch (Exception ex) {
                throw ex;
            } finally{
                this.cerrar();
            }
        return lista;
        }

  
    }

