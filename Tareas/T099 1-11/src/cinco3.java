public class cinco3 {

    public static int dias(int mes, int anio) {
        assert mes <= 12 && mes >0 : "Error: el numero tiene que ser mayor que 0 y menor que 12";
        mes = mes-1;
        int[] diasMes = {31, ((anio % 4 == 0) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numeroElementos = diasMes[mes];
        return numeroElementos;
    }
}
