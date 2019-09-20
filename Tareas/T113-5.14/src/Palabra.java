import java.util.Arrays;

public class Palabra {
    private String[] palabra;



    public Palabra(String[] palabra) {
        setPalabra(palabra);
    }

    private void setPalabra(String[] palabra) {
        assert !palabra[0].contains(" ") :"Error: Las palabras en castellano no pueden tener espacios";
        assert !palabra[1].contains(" ") :"Error: Las palabras en ingles no pueden tener espacios";
        assert palabra!=null:"Error: El array no puede ser nulo";
        assert palabra.length==2 :"Error: El array tiene que ser de longitud 2";
        this.palabra = palabra;
    }

    public String getCastellano() {
        return palabra[0];
    }

    public String getIngles() {
        return palabra[1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra1 = (Palabra) o;
        return palabra[0].equals(palabra1.getCastellano()) || palabra[1].equals(palabra1.getIngles());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(palabra);
    }

    @Override
    public String toString() {
        return palabra[0] + " -- " + palabra[1];
    }
}
