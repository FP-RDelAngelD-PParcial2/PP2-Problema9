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
        int[]n = new int [4];
        System.out.print(n.length);
        mostrarNumero(n);
    }
    public static void mostrarNumero(int[]n){
        int a = solicitarDatos(" numero a convertir ");
        for(int i =0; i<n.length; i++){
            n[0]=1000*a;
            n[1]=100*a;
            n[2]=10*a;
            n[3]=1*a;
            System.out.print("El resultado es " + "\n" + n[i]);
        }   
    }
        public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
}
