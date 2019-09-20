import java.util.Arrays;

public class Habitacion {
    private Puerta puertas[] ;
    private Casa casa;

    public Habitacion(Casa casa) {
        this.puertas = new Puerta[4];
        setCasa(casa);
    }
    private void setCasa(Casa casa){
        assert casa!=null;
        this.casa=casa;
    }

    private void setPuertas(Puerta[] puertas){

    }

    public void agregar(Puerta p, TipoOrientacion o) {
        assert esPuerta(p): "Error: La puerta ya existe";
        assert p!=null:"Error: La puerta no puede ser nula";
        assert o!=null:"Error: La orientacion no puede ser nula";
        assert !puertasCompletas() :"Error: la habitacion no admite mas puertas";

        p=puertas[o.ordinal()];


    }

    public boolean puertasCompletas() {

        for (int i = 0; i < puertas.length; i++) {
            if (puertas[i]==null) {
                return false;
            }
        }
        return true;
    }

    public Puerta getPuerta(TipoOrientacion o) {
        assert o!=null :"Error :La orientaicion no puede ser nula";
        return puertas[o.ordinal()] ;
    }

    public boolean esPuerta(Puerta p) {
        assert p!=null :"Error: La puerta no existe";
        for (int i = 0; i <puertas.length ; i++) {
            if (puertas[i]==p)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "puertas=" + Arrays.toString(puertas) +
                '}';
    }
}
