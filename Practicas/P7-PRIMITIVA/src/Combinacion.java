import java.util.Arrays;

public class Combinacion {
    private int[] primitiva;
    private int reintegro;
    private TipoPremio premio;

    public Combinacion() {
        primitiva = new int[6];
        generarAutomatica();

    }

    public Combinacion(int[] primitiva, int reintegro) {
        setPrimitiva(primitiva);
        setReintegro(reintegro);
    }

    public int[] getPrimitiva() {

        return primitiva;
    }

    public void setPremio(TipoPremio premio) {
        this.premio = premio;
    }

    public void setPrimitiva(int[] primitiva) throws IllegalArgumentException {
        if (primitiva.length != 6)
            throw new IllegalArgumentException("El tamaño de la primitiva tiene que ser 6");
        this.primitiva = primitiva;
    }

    public void generarAutomatica() {
        for (int i = 0; i < primitiva.length; i++) {
            primitiva[i] = (int) (Math.random() * 50);

            for (int j = 0; j < i; j++)
                if (primitiva[i] == primitiva[j]){
                    i--;
                    break;
                }
        }

        setReintegro((int) (Math.random() * 10));
    }


    public int getReintegro() {
        return reintegro;
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }

    public void comprobador(Combinacion ganadora) {
        boolean[] resultado = comparador(ganadora);

        if (resultado[5] && !resultado[4])
            setPremio(TipoPremio.UNO);

        if (resultado[5] && resultado[4] && !resultado[3])
            setPremio(TipoPremio.DOS);

        if (resultado[5] && resultado[4] && resultado[3] && !resultado[2])
            setPremio(TipoPremio.TRES);

        if (resultado[5] && resultado[4] && resultado[3] && resultado[2] && !resultado[1])
            setPremio(TipoPremio.CUATRO);

        if (resultado[5] && resultado[4] && resultado[3] && resultado[2] && resultado[1] && !resultado[0])
            setPremio(TipoPremio.CINCO);

        if (resultado[5] && resultado[4] && resultado[3] && resultado[2] && resultado[1] && resultado[0] && !resultado[6])
            setPremio(TipoPremio.SEIS);

        if (resultado[5] && resultado[4] && resultado[3] && resultado[2] && resultado[1] && resultado[0] && resultado[6])
            setPremio(TipoPremio.PREMIO_COMPLETO);

        if (!resultado[5])
            setPremio(TipoPremio.PERDEDOR);


    }




    public TipoPremio getPremio() {
        return premio;
    }

    private boolean[] comparador(Combinacion ganadora) throws NullPointerException {
        if (ganadora == null) {
            throw new NullPointerException("La combinacion no puede ser nula");
        }
        boolean[] ar1 = new boolean[7];

        for (int i = 0; i < primitiva.length; i++) {


            ar1[i] = ganadora.getPrimitiva()[i] == primitiva[i];

        }

        ar1[primitiva.length] = ganadora.getReintegro() == reintegro;

        return ar1;
    }

    @Override
    public String toString() {
        return   Arrays.toString(primitiva) +" "+ reintegro;
    }
}
