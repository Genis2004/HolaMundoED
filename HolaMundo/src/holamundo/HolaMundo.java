package holamundo;

import java.util.Scanner;

/**
 * Este programa solicita al usuario que ingrese su nombre y luego le da la bienvenida
 * mostrando un mensaje personalizado en la consola.
 * 
 * @version 1.0
 * @author TuNombre
 */
public class HolaMundo {

    /**
     * Método principal que ejecuta el programa. Solicita al usuario que ingrese su nombre
     * y muestra un mensaje de bienvenida personalizado.
     * 
     * @param args Argumentos de línea de comandos (no se usan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita al usuario que ingrese su nombre
        System.out.print("Ingresa tu nombre: ");
        
        String nombre = scanner.nextLine();
        
        // Muestra un mensaje de bienvenida personalizado
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java ptimer cambio.");
    }

    // en rama desarrollo
    // “Comentario después de realizar fusión”
    // Este cambio se realiza desde github
    // “Cambio realizado después de hacer el pull”
}
