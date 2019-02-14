/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientada_a_objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Raymundo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //declaramos las variables que vamos a utilizar
        String Nombre="JOSE RAYMUNDO";
        String Apellildo="CANCHE CANCHE";
        int Edad=22;
        //creamos una instancia de la clase persona
        Persona p=new Persona(Nombre,Apellildo,Edad);
        //se imprimen los datos de la persona en un mensaje 
        JOptionPane.showMessageDialog(null,"Nombre Completo:\n"+ p.datos()+"\n"
                + "Edad: "+p.edad()+" años");
    }
    
}
