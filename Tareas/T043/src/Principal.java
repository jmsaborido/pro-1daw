public class Principal {

    public static void main(String[] args) {

        String s1 = "PEPITO";
        String s2 = "JUANITO";
        String s3 = "Hulio";

        System.out.println(s1.charAt(0));                                           // P
        System.out.println(s1.compareTo(s2));                                       // - 0 +
        System.out.println(s1.equals(s2));                                          // false
        System.out.println(String.format("Me llamo %s y mi amigo %s",s1,s2));       // texto formatado
        System.out.println(s1.indexOf('P'));                                        // 0
        System.out.println(s1.isEmpty());                                           // false
        System.out.println(s1.length());                                            // 6
        System.out.println(s1.substring(2));                                        // PITO
        System.out.println(s3.toUpperCase());                                       // HULIO
        System.out.println(s2.toLowerCase());                                       // juanito
        System.out.println(String.valueOf(true));                                   // Devuelve la representación en cadena de los argumentos, sobrecargado


    }
}
