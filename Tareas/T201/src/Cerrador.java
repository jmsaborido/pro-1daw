import java.io.IOException;

public class Cerrador implements AutoCloseable {
    private boolean cerrado;

    public Cerrador() {
        cerrado=false;
    }

    @Override
    public void close() throws IOException {
        if (cerrado)
            throw  new IOException("Esta cerrado hamijo");
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }
}
