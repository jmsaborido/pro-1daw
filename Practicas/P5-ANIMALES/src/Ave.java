public abstract class Ave extends Vertebrado
        implements Oviparo {

    public Ave(int peso) {
        super(peso);
    }

    @Override
    public void ponerHuevos() {
        System.out.println("Que tortilla mas buena voy a hacer");
    }


}
