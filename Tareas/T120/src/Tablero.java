import java.util.Arrays;

public class Tablero {
    private Robot[] robots ;
    private int aforo;

    public Tablero(int aforo) {
        setAforo(aforo);

    }

    private void setAforo(int aforo) {
        assert aforo>0:"Error: el aforo tiene que ser positivo";
        this.aforo=aforo;
        robots= new Robot[aforo];
    }

    public boolean colocar(Robot robot){
        assert robot!=null:"Error: el robot no puede ser nulo";

        for (int i = 0; i <aforo ; i++) {
            if(robots[i]==null) {
                robots[i] = robot;
                return true;
            }

        }

        return false;
    }

    @Override
    public String toString() {
        return  Arrays.toString(robots);
    }
}
