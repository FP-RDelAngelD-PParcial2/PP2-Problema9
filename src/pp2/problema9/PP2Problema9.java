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
        int a;
        String c, d, e, f;

        cad=b.toCharArray();
        a=cad.length-1;

            c=cad[0]+"000";
            d=cad[1]+"00";
            e=cad[2]+"0";
            f=cad[3]+"";
        
        System.out.print("El resultado es: " + c + "+" + d + "+" + e + "+" + f + "=" + b);
    }
}
