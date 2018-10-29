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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
}
