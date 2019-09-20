public class Main {

    public static void main(String[] args) {
        Prueba a1 =new Prueba("BlueJ");
	   try {
           a1.setAlias("IntelliJ");
           a1.setAlias("NetBeans");
       }catch (IllegalStateException e) {
           System.err.println("No puedes cambiar el alias");
       }
	   try {
	       a1.setAlias(null);
       }catch (NullPointerException e){
           System.err.println("El alias no puede ser nulo");
       }
	   try {
	       a1.setAlias("Eclipse");
       }catch (IllegalArgumentException e) {
           System.err.println("Prueba con IntelliJ");
       }
    }
}
