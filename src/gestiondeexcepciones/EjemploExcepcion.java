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
public class EjemploExcepcion {
    public int division(){
    int x=0;
   try{
   x=10/0;
       System.out.println("xxx");
   }catch(ArithmeticException e){
       System.out.println("division por cero");
   
  } 
    return x;
    
    }
}
