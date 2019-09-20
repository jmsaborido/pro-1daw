import java.util.Objects;

public class Intervalo {
    private int izquierda;
    private int derecha;



    public Intervalo(int izquierda, int derecha) {
        assert izquierda < derecha : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        this.izquierda = izquierda;
        this.derecha = derecha;


    }


    public boolean abierto(int dentro) {
        return ((izquierda < dentro) && (dentro < derecha));
    }

    public boolean abiertoIzq(int dentro) {
        return ((izquierda < dentro) && (dentro <= derecha));

    }

    public boolean abiertoDer(int dentro) {
        return ((izquierda <= dentro) && (dentro < derecha));

    }

    public boolean cerrado(int dentro) {
        return ((izquierda <= dentro) && (dentro <= derecha));
    }

    public boolean solapamiento(Intervalo a) {
        int i2 = a.getIzquierda();
        int d2 = a.getDerecha();
        return (cerrado(i2) || cerrado(d2) || a.cerrado(izquierda) || a.cerrado(derecha));

    }

    public boolean intervaloDentroIntervalo(Intervalo a) {
        int i2 = a.getIzquierda();
        int d2 = a.getDerecha();
        return (izquierda < i2) ? (d2 < derecha) : (derecha < d2);
    }

    public int getIzquierda() {
        return izquierda;
    }

    public int getDerecha() {
        return derecha;
    }
}


