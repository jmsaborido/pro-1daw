public class Persona {
    private String alias;
    private int anyoNac;

    public Persona(String alias, int anyoNac) {
        this.alias = alias;
        this.anyoNac = anyoNac;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }



    public int getAnyoNac() {
        return anyoNac;
    }

    public int mostarEdad() {
        return calcularEdad();
    }

    private int calcularEdad() {
        return 2018-getAnyoNac();
    }

    // Metodos estaticos

    public static int mostrarEdad(int anyo) {
        return calcEdad(anyo);
    }

    private static int calcEdad(int anyo) {
        return 2018-anyo;


    }
}
