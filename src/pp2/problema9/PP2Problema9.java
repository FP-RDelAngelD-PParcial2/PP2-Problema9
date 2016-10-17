/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema9;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      muestraResultado(convertirNumero());
    }
     public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static String convertirNumero(){
        int a = solicitarDatos(" numero a convertir ");
        String r="";
        r=r+a;
        return r;
    }
    public static void muestraResultado(String b){
        char cad [];
        int a, c, d, e, f;
        c=0;
        d=0;
        e=0;
        f=0;
        cad=b.toCharArray();
        a=cad.length-1;
        while(a>=cad.length){
            c=cad[0]*1000;
            d=cad[1]*100;
            e=cad[2]*10;
            f=cad[3]*1;
        }
        System.out.print("El resultado es: " + c + " + " + d + " + " + e + " + " + f + " = " + b);
    }
}
