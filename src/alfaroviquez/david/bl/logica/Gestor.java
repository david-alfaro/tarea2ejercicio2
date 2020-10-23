package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.Motor;
import alfaroviquez.david.bl.entidades.Vehiculo;

import java.util.ArrayList;

public class Gestor {

    ArrayList<Motor> motores;
    ArrayList<Vehiculo> vehiculos;

    public Gestor(){
        this.motores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public void crearMotor(String serie, int cilindros){
        Motor nuevoMotor = new Motor(serie,cilindros);
        motores.add(nuevoMotor);
    }
    public void crearVehiculo(String marca, String serie){
        Vehiculo nuevoVehiculo = new Vehiculo();
        nuevoVehiculo.setMarca(marca);
        nuevoVehiculo.setNumeroSerie(serie);
        vehiculos.add(nuevoVehiculo);
    }
    public void agregarMotor(Vehiculo vehiculo, Motor motor){
        vehiculo.setMotor(motor);
    }
    public Vehiculo buscarVehiculo(String serie){
        for(int i=0;i<vehiculos.size();i++){
            Vehiculo autoActual = vehiculos.get(i);
            if(autoActual.getNumeroSerie().equalsIgnoreCase(serie)){
                return autoActual;
            }
        }
        return null;
    }
    public Motor buscarMotor(String serie){
        for(int i=0;i<motores.size();i++){
            Motor motorActual = motores.get(i);
            if(motorActual.getNumeroSerie().equalsIgnoreCase(serie)){
                return motorActual;
            }
        }
        return null;
    }

    public ArrayList<Motor> listarMotor(){
        return this.motores;
    }

    public ArrayList<Vehiculo> listaVehiculos(){
        return this.vehiculos;
    }
}
