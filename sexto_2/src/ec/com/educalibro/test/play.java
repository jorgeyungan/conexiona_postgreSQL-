/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.educalibro.test;

import ec.com.educalibro.dalc.clienteDalc;
import ec.com.educalibro.entidades.clsCliente;
import java.util.List;

/**
 *
 * @author iorys
 */
public class play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clienteDalc dalc = new clienteDalc();
        clsCliente c = new clsCliente(0, "0603745332", "jorge", "0983454076");
        try {
            dalc.registrar(c);
        } catch (Exception ex) {
            //Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }

        try {
            List<clsCliente> listado = dalc.listar();
            for (clsCliente cli : listado) {
                System.out.println(cli.toString());
            }
        } catch (Exception ex) {
            //Logger.getLogger(play.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }
    }
    
}
