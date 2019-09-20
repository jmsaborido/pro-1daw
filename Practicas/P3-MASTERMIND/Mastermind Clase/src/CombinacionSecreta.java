import java.util.Arrays;

public class CombinacionSecreta {
    private Ficha[] fichas=new Ficha[4];

    public CombinacionSecreta(TipoColorFicha[] colores) {
        crearFichas(colores);

    }

    public Ficha[] getFichas() {
        return fichas;
    }

    private void crearFichas(TipoColorFicha[] colores) {
        assert colores.length==4:"Error: la longitud de la combinacion secreta tiene que ser 4";
        for (int i = 0; i <colores.length ; i++) {
            fichas[i]=new Ficha(colores[i]);
        }

    }

    @Override
    public String toString() {
        return  Arrays.toString(fichas);
    }
}
