public class Main {
    public static void main (String[]args){
        Persona juan = new Persona("juan",'V');
        Persona pepi = new Persona("pepi",'F');
        Persona ramon = new Persona("ramon",'V');
        Persona ramona = new Persona("ramona",'F');

        juan.setMadre(pepi);
        juan.setPadre(ramon);
        pepi.setConyuge(ramon);
        juan.setConyuge(ramona);
       // System.out.println(ramon.estaCasada());
        System.out.println(juan);
    }
}
