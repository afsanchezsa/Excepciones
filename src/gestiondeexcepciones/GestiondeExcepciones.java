/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexcepciones;

/**
 *
 * @author Estudiante
 */
public class GestiondeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // EjemploExcepcion e=new EjemploExcepcion();
    //e.division();
        Modelo m=new Modelo();
        try{
            m.mA();
    }
    catch(IllegalArgumentException e){
    
    
    }
    
    }
    
}
