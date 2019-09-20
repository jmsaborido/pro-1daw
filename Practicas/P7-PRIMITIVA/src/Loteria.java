public class Loteria {
    private Combinacion resultado;
    private Combinacion ganadora;

    public Loteria(Combinacion resultado) {
        this.resultado = resultado;
        ganadora = new Combinacion();
        resultado.comprobador(ganadora);
    }

    public Combinacion getResultado() {
        return resultado;
    }

    public Combinacion getGanadora() {
        return ganadora;
    }

    public Loteria(Combinacion resultado, Combinacion ganadora) {
        this.resultado = resultado;
        this.ganadora = ganadora;
        resultado.comprobador(ganadora);
    }

    @Override
    public String toString() {
        String dev = "";

        switch (resultado.getPremio()) {
            case UNO:
                dev = "Has ganado un Euro";
                break;
            case DOS:
                dev = "Has ganado dos Euros ";
                break;
            case TRES:
                dev = "Has ganado cinco Euros ";
                break;
            case CUATRO:
                dev = "Has ganado diez Euros";
                break;
            case CINCO:
                dev = "Has ganado veinte Euros";
                break;
            case SEIS:
                dev = "Has ganado cinquenta Euros";
                break;
            case PREMIO_COMPLETO:
                dev = "Has ganado cien Euros";
                break;
            case PERDEDOR:
                dev = "Sigue buscando";
                break;
            case REINTEGRO:
                dev="Has acertado el reintegro";
                break;
            default:
                dev = "Error";
                break;

        }
        return dev;
    }
}
