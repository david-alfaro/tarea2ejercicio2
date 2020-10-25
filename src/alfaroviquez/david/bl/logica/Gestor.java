package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.Motor;
import alfaroviquez.david.bl.entidades.Vehiculo;
import java.util.ArrayList;

/**
 * Clase Gestor
 * En esta clase esta la logica del programa, se invocan los constructores para crear instancias de vehivulo y motor
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */

public class Gestor {

    ArrayList<Motor> motores;
    ArrayList<Vehiculo> vehiculos;

    public Gestor(){
        this.motores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    /**
     * Metodo para crear una instancia de Motor
     * Se invoca el constructor y se le envian los parametros para crear la instancia
     * @param serie numero de serie del motor
     * @param cilindros cantidad de cilindros que tiene el motor
     */
    public void crearMotor(String serie, int cilindros){
        Motor nuevoMotor = new Motor(serie,cilindros);
        motores.add(nuevoMotor);
    }

    /**
     * Metodo para crear una instancia de la clase vehiculo
     * @param marca del vehiculo
     * @param serie del vehiculo
     */
    public void crearVehiculo(String marca, String serie){
        Vehiculo nuevoVehiculo = new Vehiculo();
        nuevoVehiculo.setMarca(marca);
        nuevoVehiculo.setNumeroSerie(serie);
        vehiculos.add(nuevoVehiculo);
    }

    /**
     * Metodo para agregar una instancia motor a una instancia vehiculo
     * @param vehiculo instancia de la clase vehiculo
     * @param motor instancia de la clase motor
     */
    public void agregarMotor(Vehiculo vehiculo, Motor motor){
        vehiculo.setMotor(motor);
    }

    /**
     * Funcion para buscar una instancia vehiculo en el arraylist vehiculos
     * La busqueda se realiza mediante el numero de serie del vehiculo
     * @param serie numero de serie del vehiculo
     * @return la instancia vehiculo que corresponde con el parametro de busqueda
     */
    public Vehiculo buscarVehiculo(String serie){
        for(int i=0;i<vehiculos.size();i++){
            Vehiculo autoActual = vehiculos.get(i);
            if(autoActual.getNumeroSerie().equalsIgnoreCase(serie)){
                return autoActual;
            }
        }
        return null;
    }

    /**
     * Funcion para buscar una instancia de la clase motor en el arraylist motores
     * La busqueda se realiza de acuerdo con el parametro de numero de serie del motor
     * @param serie numero de serie del motor
     * @return una instancia de la clase motor que coincide con el numero de serie buscado
     */
    public Motor buscarMotor(String serie){
        for(int i=0;i<motores.size();i++){
            Motor motorActual = motores.get(i);
            if(motorActual.getNumeroSerie().equalsIgnoreCase(serie)){
                return motorActual;
            }
        }
        return null;
    }

    /**
     * Funcion para listar motores
     *
     * @return los elementos del arraylist motores
     */
    public ArrayList<Motor> listarMotor(){
        return this.motores;
    }

    /**
     * Funcion para listar vehiculos
     * @return los elementos del arraylist vehiculos
     */

    public ArrayList<Vehiculo> listaVehiculos(){
        return this.vehiculos;
    }
}
