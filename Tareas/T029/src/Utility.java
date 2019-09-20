public class Utility {
    private Utility() {
        //el constructor debe ser privado para que no se pueda instanciar un objeto de la clase utility ya que
        //no tendria sentido.
        //ii1=intervalo izquierda 1
        //id1=intervalo derecha 1
        //ii1=intervalo izquierda 2
        //ii1=intervalo derecha 2


    }

    public static boolean abierto(int izquierda, int dentro, int derecha) {
        assert izquierda < derecha : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        return ((izquierda < dentro) && (dentro < derecha));
    }

    public static boolean abiertoIzq(int izquierda, int dentro, int derecha) {
        assert izquierda < derecha : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        return ((izquierda < dentro) && (dentro <= derecha));
    }

    public static boolean abiertoDer(int izquierda, int dentro, int derecha) {
        assert izquierda < derecha : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        return ((izquierda <= dentro) && (dentro < derecha));
    }

    public static boolean cerrado(int izquierda, int dentro, int derecha) {
        assert izquierda <= derecha : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        return ((izquierda <= dentro) && (dentro <= derecha));

    }

    public static boolean solapamiento(int ii1, int id1, int ii2, int id2) {
        assert ii1 <= id1 : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        assert ii2 <= id2 : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 2)";
        return (cerrado(ii1,ii2,id1) || cerrado(ii1,id2,id1) || cerrado(ii2,ii1,id2) || cerrado(ii2,id1,id2));

    }

    public static boolean intervaloDentroIntervalo(int ii1, int id1, int ii2, int id2) {
        assert ii1 < id1 : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 1)";
        assert ii2 < id2 : "Error:tienes que poner el numero menor primero y el numero mayor despues (par 2)";
        return  ii1 < ii2 ? id2 < id1 : id1 < id2;
    }


}


