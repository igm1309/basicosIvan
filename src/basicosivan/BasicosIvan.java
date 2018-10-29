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
        logicos();
    }
    
     /**
     * Método para mostrar ejemplos de tipos logicos.
     */
    public static void logicos() {

        //Estos son los tipos básicos
       boolean es_igual;
       int numero1; //numero creado para la comparación
       int numero2; //numero creado para la comparación

        //Ejemplos de asignación de valores a las variables de tipos básicos
       es_igual = true;
       numero1 = 5;
       numero2 = 7;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Comparación de dos números: ");
        System.out.println("El primer número es: "+numero1);
        System.out.println("El segundo número es: "+numero2);
        
        if(numero1 == numero2){
            System.out.println("Los números son IGUALES!!!");
        }else{System.out.println("Los números NO son IGUALES");} 
    }
}
