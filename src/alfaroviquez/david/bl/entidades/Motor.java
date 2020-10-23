package alfaroviquez.david.bl.entidades;

public class Motor {
    private String numeroSerie;
    private int numeroCilindros;

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(int numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public Motor() {
    }

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
