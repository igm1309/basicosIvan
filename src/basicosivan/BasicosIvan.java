/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosivan;

/**
 *
 * @author Iván Giner Medina
 */
public class BasicosIvan {

   
    public static void main(String[] args) {
           numericos();
        cadenas();
    }
    
     /**
     * Método para mostrar ejemplos de tipos cadenas.
     */
    public static void cadenas() {

        //Estos son los tipos básicos
        char letra;
        String frase;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        letra = 'a';
        frase = "Una frase";

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor char: "+letra);
        System.out.println("Valor string: "+frase);
    }
    
     /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    } 
}
