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
        mostrarNumero();
    }
    public static void mostrarNumero(){
        int numeroingresado = solicitarDatos(" numero a separar ");
        System.out.print((numeroingresado/1000)+000);
        System.out.print((numeroingresado/100)+00);
        System.out.print((numeroingresado/10)+0);
        System.out.print((numeroingresado/1));
    }
        public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
}
