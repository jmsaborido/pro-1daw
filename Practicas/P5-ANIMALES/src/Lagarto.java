public final class Lagarto extends Reptil implements Mostrable{
    public Lagarto(int peso) {
        super(peso);
    }

    @Override
    public String toString() {
        return "Lagarto{" +
                "peso=" + peso +
                '}';
    }
}
