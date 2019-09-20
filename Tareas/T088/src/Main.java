public class Main {

    public static void main(String[] args) {
        System.out.println(vocales5("mURCIELAGO"));
    }
    public static boolean vocales5 (String a){
        assert a!=null : "Error: La cadena no puede ser nula.";
        a=a.toLowerCase();
        return a.contains("a") &&  a.contains("e") && a.contains("i") && a.contains("o") && a.contains("u");
    }
}
