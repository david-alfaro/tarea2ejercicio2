package alfaroviquez.david.iu;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Clase IU para la interfaz de usuario
 * En esta clase se crean los metodos que van a realizar impresiones en pantalla y leer lo que el usuario ingresa
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */
public class IU {

    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para imprimir en pantalla las opciones que vera el usuario en el menu
     */
    public void mostrarMenu(){
        output.println("Bienvenido al sistema dde registro de vehiculos y motore");
        output.println("Escoja una opcion del menu: ");
        output.println("1. Registrar motor");
        output.println("2. Registrar vehiculo");
        output.println("3. Agregar motor a vehiculo");
        output.println("4. Listar motores");
        output.println("5. Listar vehiculos");
        output.println("6. Salir");
    }

    /**
     * Funcion para leer el texto que ingresa el usuario
     * @return el texto que el usuario ingresa
     */
    public String leerTexto(){
        return input.next();
    }

    /**
     * Metodo para imprimir en pantalla
     * @param msg parametro tipo string, es el mensaje que se imprimira en pantalla
     */
    public void imprimirmensaje(String msg){
        output.println(msg);
    }

    /**
     * Funcion para leer opciones de numero que el usuario ingrese
     * @return numero entero ingresado por el usuario
     */
    public int leerOpcion(){
        return input.nextInt();
    }
}
