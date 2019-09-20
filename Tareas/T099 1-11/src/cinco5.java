public class cinco5 {
    public static String nombreDia(int numDiaSemana) {
        numDiaSemana = numDiaSemana - 1;
        String[] nombres = {"Lunes", "Martes", "Miércoles",
                "Jueves", "Viernes",
                "Sabado", "Domingo"};
        return (numDiaSemana >= 1 && numDiaSemana <= 7) ? nombres[numDiaSemana - 1] : "Día incorrecto";
    }

}
