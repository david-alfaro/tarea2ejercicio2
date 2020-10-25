package alfaroviquez.david.bl.entidades;

/**
 * Clase Vehiculo
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */
public class Vehiculo {

    private String marca;
    private String numeroSerie;
    private Motor motor;

    /**
     * Metodo get para Marca
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo set para marca
     *
     * @param marca del vehiculo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *Metodo get para el numero de serie del vehiculo
     * @return numero de serie del vehiculo
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Metodo set para el numero de serie
     * @param numeroSerie del vehiculo
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Metodo get para el motod
     * @return objeto tipo motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Metodo set para el motor
     * @param motor
     */

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Vehiculo() {
    }

    /**
     * Constructor para el vehiculo
     * @param marca del vehiculo
     * @param numeroSerie del vehiculo
     * @param motor objeto tipo motor
     */
    public Vehiculo(String marca, String numeroSerie, Motor motor) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", motor=" + motor +
                '}';
    }
}
