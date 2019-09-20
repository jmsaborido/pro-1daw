public class Prueba {
    private String alias;
    private static int cont = 0;

    public Prueba(String alias) {
        setAlias(alias);
    }

    /**
     * @param alias
     * @throws IllegalArgumentException si el alias es Eclipse
     * @throws NullPointerException     si el alias es nulo
     * @throws IllegalStateException    si quieres cambiar el nombre 2 veces
     */
    public void setAlias(String alias) throws IllegalArgumentException,
            NullPointerException, IllegalStateException {
        if (alias == null)
            throw new NullPointerException("El alias no puede ser nulo");
        if (alias.equals("Eclipse"))
            throw new IllegalArgumentException("Esa palabra no gusta por aqui");
        if (cont > 1)
            throw new IllegalStateException("No se puede cambiar el nombre por algun extraño motivo");
        this.alias = alias;
        cont++;
    }
}
