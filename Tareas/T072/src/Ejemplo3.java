public class Ejemplo3 {
    public static String ejemplo3(int mes, int año) {
        int diaDeMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaDeMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaDeMes = 30;
                break;
            case 2:
                if ((año % 4 == 0) && !(año % 100 == 0) ||(año % 400 ==0)) {
                    diaDeMes = 29;
                } else {
                    diaDeMes = 28;

                }
                break;
                default:
                    return  " Error: tienes que darme un numero entre el 1 y el 12";
        }
        return "Numero de dias: "+ diaDeMes;
    }
}
