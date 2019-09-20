public final class Ornitorrinco extends Mamifero
        implements Venenoso, Oviparo, Mostrable{

    public Ornitorrinco(int peso) {
        super(peso);
    }

    @Override
    public void morder() {
        System.out.println("Crunch");

    }

    @Override
    public void ponerHuevos() {

    }

    @Override
    public void envenenar() {

    }

    @Override
    public String toString() {
        return "Ornitorrinco{" +
                "peso=" + peso +
                '}';
    }
}
