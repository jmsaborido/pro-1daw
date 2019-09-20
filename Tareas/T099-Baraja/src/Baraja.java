public class Baraja {
    private final int CANTIDAD = 40;
    private final int CPP = 10;                     // CPP= Cantidad Por Palo
    private Carta baraja[] = new Carta[CANTIDAD];
    private Palo[] tipoPalo = Palo.values();

    public Baraja() {
        crearMazo();
    }

    private void crearMazo() {
        for (int i = 0, aux = 0; i < tipoPalo.length; i++) {
            for (int j = 1; j < CPP + 1; j++) {
                baraja[aux++] = new Carta(tipoPalo[i], j);
            }
        }
    }

    @Override
    public String toString() {
        String mazo = "";
        for (int i = 0; i < CANTIDAD; i++) {
            String separador = (i != 0) ? ", " : "";
            mazo += (separador + baraja[i]);
        }
        return mazo;
    }
}

