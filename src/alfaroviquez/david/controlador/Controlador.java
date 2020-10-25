package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.Motor;
import alfaroviquez.david.bl.entidades.Vehiculo;
import alfaroviquez.david.bl.logica.Gestor;
import alfaroviquez.david.iu.IU;
import java.util.ArrayList;

/**
 * Clase controlador
 * En esta clase se realiza las impresiones de pantalla para enviar los parametros a la clase Gestor
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */
public class Controlador {
    Gestor gestor = new Gestor();
    IU iu = new IU();

    /**
     * Metodo para ejecutar el programa
     * Imprime el menu y procesa las opciones escogidas por el usuario
     */
    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }

    /**
     * Metodo para procesar las opciones de menu escogidas por el usuario
     * @param opcion numero entero que corresponde con una opcion de menu
     *
     */
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearMotor();
                break;
            case 2:
                crearVehiculo();
                break;
            case 3:
                agregarMotor();
                break;
            case 4:
                listarMotores();
                break;
            case 5:
                listarVehiculos();
                break;
            case 6:
                break;
            default:
                iu.imprimirmensaje("La opcion no es valida");
        }
    }

    /**
     * Metodo para crear instancias de la clase motor
     * Usando la interfaz IU se toma lo que el usuario ingresa, y el controlador envia los parametros al gestor
     */
    private void crearMotor() {
        iu.imprimirmensaje("Registrar motor-->");
        iu.imprimirmensaje("Numero de serie: ");
        String serie = iu.leerTexto();
        iu.imprimirmensaje("Numero de cilindros: ");
        int cilindros = iu.leerOpcion();
        gestor.crearMotor(serie, cilindros);
        iu.imprimirmensaje("Se ha creado con exito un nuevo motor");
    }
    /**
     * Metodo para crear instancias de la clase vehiculo
     * Usando la interfaz IU se toma lo que el usuario ingresa, y el controlador envia los parametros al gestor
     */
    private void crearVehiculo() {
        iu.imprimirmensaje("Registrar nuevo vehiculo-->");
        iu.imprimirmensaje("Marca del vehiculo: ");
        String marca = iu.leerTexto();
        iu.imprimirmensaje("Numero de serie: ");
        String serie = iu.leerTexto();
        gestor.crearVehiculo(marca, serie);
        iu.imprimirmensaje("Se ha creado con exito un nuevo vehiculo");
    }

    /**
     * Metodo para agregar una instancia motor en una instancia vehiculo
     */
    private void agregarMotor() {
        iu.imprimirmensaje("Ingrese el numero de serie del vehiculo: ");
        String serie = iu.leerTexto();
        Vehiculo vehiculo = gestor.buscarVehiculo(serie);
        iu.imprimirmensaje("Ingrese el numero de serie del motor: ");
        String seriemotor = iu.leerTexto();
        Motor motor = gestor.buscarMotor(seriemotor);
        gestor.agregarMotor(vehiculo, motor);
        iu.imprimirmensaje("Se agrego el motor " + motor.getNumeroSerie() + " al vehiculo " + vehiculo.getNumeroSerie());
    }

    /**
     * Metodo para listar los motores que se han guardado dentro del arraylist
     */

    private void listarMotores() {
        for (Motor motor : gestor.listarMotor()
        ) {
            iu.imprimirmensaje(motor.toString());
        }


    }

    /**
     * Metodo para listar los vehiculos que se han guardado en el arraylist vehiculos
     */
    private void listarVehiculos() {
        for (Vehiculo vehiculo : gestor.listaVehiculos()
        ) {
            iu.imprimirmensaje(vehiculo.toString());
        }
    }
}
