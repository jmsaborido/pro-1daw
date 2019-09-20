public class Casa {
    private Habitacion[][] habitaciones;
    private static final int MINFILIAS=1;
    private static final int MINCOLUMNAS=1;

    public Casa (int filas, int columnas){
        assert filas >= MINFILIAS : "Error: El numero minimo de filas tiene que ser 1";
        assert filas >= MINCOLUMNAS: "Error: El numero minimo de columnas tiene que ser 1";
        habitaciones=new Habitacion[filas][columnas];
    }
    private void inicializarHabitaciones(){
        for (int i = 0; i <habitaciones.length ; i++) {
            for (int j = 0; j <habitaciones[i].length ; j++) {
                habitaciones[i][j]=new Habitacion(this);
            }
        }
    }
    // private boolean esPuerta(Puerta p){
    //     assert p!=null :"Error: La puerta no existe";
    //     for (int i = 0; i <habitaciones.length ; i++) {
    //         // if (puertas[i]==p)
    //             return true;
    //     }
    //     return false;
    // }
}
