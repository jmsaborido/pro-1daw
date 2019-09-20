

public class Primos {

    private int[] primos;
    private Rango rango;

    public Primos(int[] primos, Rango rango) {
        comprobarRango(rango);
        comprobarPrimos(primos);


    }

    private void setPrimos(int[] primos) {
        this.primos = primos;
    }

    private void setRango(Rango rango) {
        this.rango = rango;
    }

    private void comprobarRango(Rango rango){
        if (rango.getIni()>rango.getFin())
            setPrimos(new int[0]);

        setRango(rango);

    }

    private void comprobarPrimos(int[] primos) {
        assert  primos!=null:"Error:el array no puede ser nulo";
        if (primos.length==0)
            setPrimos(new int[0]);

        int aux = 0, contador =0;

        for (int j = 0; j < primos.length; j++,contador=0) {
            for (int i = 1; i*i <= primos[j]; i ++) {
                if (primos[j] % i == 0)
                    contador++;
            }
            if (contador == 1 && primos[j] >= rango.getIni() && primos[j] <= rango.getFin())
                aux++;
        }

        int[] prim = new int[aux];
        aux =0;

        for (int j = 0; j < primos.length; j++,contador=0) {
            for (int i = 1; i*i <= primos[j]; i++) {
                if (primos[j] % i == 0)
                    contador++;
            }
            if (contador == 1 && primos[j] >= rango.getIni() && primos[j] <= rango.getFin()) {
                prim[aux] = primos[j];
                aux++;
            }
            setPrimos(prim);

        }

    }

    @Override
    public String toString() {
        String aux = "";

        for (int i = 0; i < primos.length; i++) {
            String separador = (i != 0) ? ", " : "";
            aux += separador + primos[i];
        }
        return aux;
    }


}
