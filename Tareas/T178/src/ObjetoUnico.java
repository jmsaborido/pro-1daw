public class ObjetoUnico {
    public static boolean yaExisteUno;

    public ObjetoUnico() {
        if (yaExisteUno)
            throw new IllegalStateException("Ya existe un objeto unico");
        yaExisteUno = true;
    }

}