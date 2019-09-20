public class Tarro {

    private static final int TAMAÑOMAX = 20;
    private static Aceituna[] aceitunas;

    static {
        aceitunas = new Aceituna[TAMAÑOMAX];
        System.out.println("Añadiendo aceitunas al tarro (BLOQUE ESTATICO)");
        aceitunas[0] = (new Aceituna("CHUPADEDO"));
        aceitunas[1] = (new Aceituna("VERDIALES"));
        aceitunas[2] = (new Aceituna("GORDALES"));
    }


    public Tarro(String nombre) {
        for (int i = aceitunasIntroducidas(); i < aceitunas.length; i++) {
            aceitunas[i] = (new Aceituna(nombre));
        }
    }

    public Tarro(int n, String nombre) {
        System.out.println("Añadiendo no estaticas");
        añadir(n, nombre);
    }

    public Aceituna[] getAceitunas() {
        return aceitunas;
    }

    private void añadir(int n, String nombre) {
        int x = aceitunasIntroducidas();
        assert n <= x - TAMAÑOMAX : "Error:Tamaño maximo de aceitunas sobrepasado.";

        for (int i = aceitunasIntroducidas(); i <= n - 1 + x; i++) {
            aceitunas[i] = (new Aceituna(nombre));
        }
    }

    private int aceitunasIntroducidas() {
        int contador = 0;
        for (int i = 0; i < aceitunas.length; i++) {
            if (aceitunas[i] != null)
                contador++;
        }
        return contador;
    }


}
