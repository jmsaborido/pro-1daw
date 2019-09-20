public enum TipoColor {
    ROJO(66),
    VIOLETA(46),
    AZUL(50),
    VERDE(56),
    AMARILLO(59),
    AMBAR(61);


    private final int longitud;

    TipoColor( int longitud) {
        this.longitud=longitud;
    }

    public int getLongitud() {
        return this.longitud;
    }


}
