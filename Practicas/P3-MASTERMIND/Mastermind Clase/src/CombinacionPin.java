import java.util.Arrays;

public class CombinacionPin {
    private Pin[] pines =new Pin[4];

    public CombinacionPin() {

    }
    public void agregar (Pin pin){
        assert pin != null :"Error:La ficha no puede ser nula";
        for (int i = 0; i < pines.length; i++) {
            if (pines[i]==null)
                pines[i]=pin;
        }
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i <pines.length ; i++)
            aux=aux + (pines[i]==null? " ": pines[i]);
        return aux;
    }
}
