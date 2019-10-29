
package com.pilas.test;

import com.expresion.Expresion;
import com.pilas.Pila;
import java.util.StringTokenizer;


public class PilaTest {
    
    public static void main(String [] args){
        Pila pila=new Pila();
//        System.out.println("Esta vacia :"+pila.estaVacia());
//        System.out.println("Esta llena :"+pila.estaLlena());
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(6);
//        pila.apilar(1);
//        pila.apilar(7);
//        pila.apilar(8);
//        pila.mostrar();
//        System.out.println("Cima :"+pila.verCima());
//        System.out.println("Esta vacia :"+pila.estaVacia());
//        System.out.println("Esta llena :"+pila.estaLlena());
//        pila.desapilar();
//        System.out.println("Cima :"+pila.verCima());
//        pila.mostrar();
//        pila.apilar("brayan");
//        pila.apilar("norma");
//        pila.mostrar();
        
        String cadena="((5+8)*(5-1)-2)";
        Expresion expresion=new Expresion(cadena);
        pila=expresion.notacionInfija2();
        pila.mostrar();
        //pila.mostrar2();
        pila=expresion.notacionPosfija(pila);
        pila.mostrar();
        expresion.operarExprecion();
        

    }
    
}
