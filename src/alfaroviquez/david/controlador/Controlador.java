package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.Motor;
import alfaroviquez.david.bl.entidades.Vehiculo;
import alfaroviquez.david.bl.logica.Gestor;
import alfaroviquez.david.iu.IU;

import java.util.ArrayList;

public class Controlador {
    Gestor gestor = new Gestor();
    IU iu = new IU();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }

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

    private void crearMotor() {
        iu.imprimirmensaje("Registrar motor-->");
        iu.imprimirmensaje("Numero de serie: ");
        String serie = iu.leerTexto();
        iu.imprimirmensaje("Numero de cilindros: ");
        int cilindros = iu.leerOpcion();
        gestor.crearMotor(serie, cilindros);
        iu.imprimirmensaje("Se ha creado con exito un nuevo motor");
    }

    private void crearVehiculo() {
        iu.imprimirmensaje("Registrar nuevo vehiculo-->");
        iu.imprimirmensaje("Marca del vehiculo: ");
        String marca = iu.leerTexto();
        iu.imprimirmensaje("Numero de serie: ");
        String serie = iu.leerTexto();
        gestor.crearVehiculo(marca, serie);
        iu.imprimirmensaje("Se ha creado con exito un nuevo vehiculo");
    }

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

    private void listarMotores() {
        for (Motor motor : gestor.listarMotor()
        ) {
            iu.imprimirmensaje(motor.toString());
        }


    }

    private void listarVehiculos() {
        for (Vehiculo vehiculo : gestor.listaVehiculos()
        ) {
            iu.imprimirmensaje(vehiculo.toString());
        }
    }
}
