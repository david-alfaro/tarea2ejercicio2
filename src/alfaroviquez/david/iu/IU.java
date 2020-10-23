package alfaroviquez.david.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in).useDelimiter("\n");

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

    public String leerTexto(){
        return input.next();
    }

    public void imprimirmensaje(String msg){
        output.println(msg);
    }

    public int leerOpcion(){
        return input.nextInt();
    }
}
