/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.entidades;

/**
 *
 * @author iorys
 */
public class clsCliente {
    private int id;
    private String nombre;
    private String ruc;
    private String telefono;

    public clsCliente() {
    }
/**
 * constructor que crea un objeto directamente
 * @param id (int)
 * @param nombre (String)
 * @param ruc(String)
 * @param telefono(String) 
 */
    public clsCliente(int id, String nombre, String ruc, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.ruc = ruc;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return "clscliente{"+ "id=" + id + ", RUC=" + ruc + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    
    
    
}

