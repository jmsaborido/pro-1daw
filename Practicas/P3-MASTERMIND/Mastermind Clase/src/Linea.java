public class Linea {
    private CombinacionLinea combinacionLinea;
    private CombinacionPin combinacionPin;

    public Linea() {
        crearCombinacionPin();
        crearCombinacionLinea();

    }
    private void crearCombinacionPin(){
        combinacionPin = new CombinacionPin();
    }

    private void crearCombinacionLinea(){
        combinacionLinea= new CombinacionLinea();
    }

    @Override
    public String toString() {
        return  (combinacionLinea.toString()) + (combinacionPin.toString());
    }
}
