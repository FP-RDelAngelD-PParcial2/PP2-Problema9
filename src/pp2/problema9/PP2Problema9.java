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
        int a = solicitarDatos(" numero a convertir "); //Se ingresa el numero de 4 digitos //4589
        String r=""; //Se declara un string para guardar el numero
        r=r+a;//El numero se transorma a String //""+4589 
        return r;//Regresa 4589 en forma de dato String
    }
    public static void muestraResultado(String b){
        char cad []; //Se crea un arreglo de caracteres
        String c, d, e, f; //Se declaran variables String para guardar el valor de la posicion del arreglo

        cad=b.toCharArray(); //El String se vuelve un arreglo de caracteres

            c=cad[0]+"000"; //A la posicion 0 se le agregan 000
            d=cad[1]+"00";  //A la posicion 1 se le agregan 00
            e=cad[2]+"0";   //A la posicion 2 se le agregan 0
            f=cad[3]+"";    //A la posicion 3 se le agregan ""
        
        System.out.print("El resultado es: " + c + "+" + d + "+" + e + "+" + f + "=" + b);
    }
}
