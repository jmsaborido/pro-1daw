public class Main {

    public static void main(String[] args) {
	FalsoString a1 = new FalsoString("juan");
    try {
        a1.add(("Juan"));
    }catch (UnsupportedOperationException e){
        System.out.println("no se puede añadir elementos a un String");
    }
    }
}
