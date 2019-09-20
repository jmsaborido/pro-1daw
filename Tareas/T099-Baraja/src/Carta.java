public class Carta {
    private Palo tipoPalo;
    private static final int MIN = 1;
    private int numero;
    private String nombre;


    public Carta(Palo tipoPalo, int numero) {
        setPalo(tipoPalo);
        setNumero(numero);
        setNombre(numero);
    }

    private void setPalo(Palo tipoPalo) {
        assert tipoPalo!=null:"Error: El palo no puede ser nulo";
        this.tipoPalo = tipoPalo;
    }

    private void setNumero(int numero) {
        assert numero >= MIN : "Error:El numero tiene que ser mayor que 1.";
        this.numero = numero;
    }

    private void setNombre(int numero){
        switch(numero){
            case 1: nombre = "AS";
                break;
            case 8: nombre = "SOTA";
                break;
            case 9: nombre = "CABALLO";
                break;
            case 10: nombre = "REY";
                break;
            default : nombre = String.valueOf(numero);
                break;
        }
    }

    @Override
    public String toString() {
        return nombre + " DE " + tipoPalo;
    }
}
