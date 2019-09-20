public class Main {

    public static void main(String[] args) {
        System.out.println(letraDNI(49036712));
    }
    public static String letraDNI(int dni){
        assert String.valueOf(dni).length()==8 :"Error:el dni tiene que tener una lonitud de 8";
        return String.valueOf(dni)+ "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni%23);

    }
}
