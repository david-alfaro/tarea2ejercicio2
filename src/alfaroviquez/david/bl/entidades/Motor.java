package alfaroviquez.david.bl.entidades;

/**
 * Clase Motor
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 22/10/2020
 */
public class Motor {
    private String numeroSerie;
    private int numeroCilindros;

    /**
     * Metodo get para numero de serie del motor
     * @return retorna el numero de serie que es un String
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Metodo set para el numero de serie
     * @param numeroSerie numero de serie del motor, es un string
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Metodo get para numero de cilindros
     * @return la cantidad de cilindros en el motor
     */
    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    /**
     * Metodo set para el numero de cilindros
     * @param numeroCilindros cantidad de cilindros en el motor es un numero entero
     */
    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public Motor() {
    }

    /**
     * Constructor para la clase motor
     * @param numeroSerie numero de serie del motor, es un string
     * @param numeroCilindros cantidad de cilindros en el motor, es un int
     */
    public Motor(String numeroSerie, int numeroCilindros) {
        this.numeroSerie = numeroSerie;
        this.numeroCilindros = numeroCilindros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", numeroCilindros=" + numeroCilindros +
                '}';
    }
}
