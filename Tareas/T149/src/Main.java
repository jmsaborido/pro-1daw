public class Main {

    public static void main(String[] args) {
	Militar a1=new Militar("Juan",TipoRango.TROPA);
	Militar a2=new Militar("Juan",TipoRango.SUBOFICIAL);
	Militar a3=new Militar("Pepe",TipoRango.OFICIAL);
        System.out.println(a3.compareTo(a1));
    }
}
