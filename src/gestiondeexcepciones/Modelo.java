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
public class Modelo {
    public int mA() throws FabianException/*throws IllegalArgumentException*/{
    return this.mB();
    }
public int mB()throws FabianException /*throws IllegalArgumentException*/{//indica que el no se va a encargar de capturar esa excepcion sino que debe encargarse el que llamo a este metodo
try{
return this.mC(0);//el try catch deja de propagar la excepcion

}catch(IllegalArgumentException e){
    System.out.println("asdsfasdf");

}
    
    return 0;

}
public int mC(int denominador) /*throws ArithmeticException*/ throws FabianException {//si tengo una excepcion personalizada el sistema operativo no las puede propagar por eso hay que registrar la excepcion(por eso puse throws FabianException) por medio del throws(con los otros no era necesario pues esas excepciones las conocia la maquina virtual)
if(denominador==0)
//throw new IllegalArgumentException();//indica que lanza una excepcion al que llamo este metodo
throw new FabianException("division por cero");
    else
    return 10/denominador;
}
}
