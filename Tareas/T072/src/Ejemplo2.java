public class Ejemplo2 {
    public static String ejemplo2(int a) {
        java.util.ArrayList<String> mesFuturos = new java.util.ArrayList<String>();
        switch (a) {
            case 1:
                mesFuturos.add("Enero \n");
            case 2:
                mesFuturos.add("Febrero \n");
            case 3:
                mesFuturos.add("Marzo \n");
            case 4:
                mesFuturos.add("Abril \n");
            case 5:
                mesFuturos.add("Mayo \n");
            case 6:
                mesFuturos.add("Junio \n");
            case 7:
                mesFuturos.add("Julio \n");
            case 8:
                mesFuturos.add("Agosto \n");
            case 9:
                mesFuturos.add("Septiembre \n");
            case 10:
                mesFuturos.add("Octubre \n");
            case 11:
                mesFuturos.add("Noviembre \n");
            case 12:
                mesFuturos.add("Diciembre \n");
                break;
            default:
                mesFuturos.add ("Error: tienes que darme un numero entre el 1 y el 12");

        }

            return mesFuturos.toString();
    }
}

