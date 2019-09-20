import java.util.Arrays;

public class CombinacionLinea {
    private Ficha[] fichas=new Ficha[4];

    public CombinacionLinea() {
    }

    public void colocar (Ficha ficha, int posicion){
        assert ficha != null :"Error:La ficha no puede ser nula";
        assert posicion>=0 && posicion<=3 :"Error la posicion tiene que estar entre 0 y 4";
        fichas[posicion]=ficha;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    @Override
    public String toString() {

        String aux = "";
        for (int i = 0; i <fichas.length ; i++)
            aux=aux + (fichas[i]==null? " ": fichas[i]);
        return aux;
    }
}
