package alfaroviquez.david.bl.entidades;

public class Vehiculo {

    private String marca;
    private String numeroSerie;
    private Motor motor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Vehiculo() {
    }

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
