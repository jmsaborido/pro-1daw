public class Curso {
    private static final int MAXESTUDIANTES = 5;
    private static final int MAXASIGNATURAS = 3;
    private Estudiante[] estudiantes;
    private int[][] notas;

    public Curso(String[] estudiantes) {
        inicializarEstudiantes(estudiantes);
        inicializarNotas();
    }

    private void inicializarEstudiantes(String[] estudiantes) {
        assert estudiantes != null : "Error:Los estudiantes no pueden ser nulos";
        assert estudiantes.length > 0 && estudiantes.length < MAXESTUDIANTES : "Error:El numero de estudiantes tiene que estar entre 0 y 5";
        this.estudiantes = new Estudiante[estudiantes.length];
        for (int i = 0; i < estudiantes.length; i++) {
            this.estudiantes[i] = new Estudiante(estudiantes[i]);
        }
    }

    private void inicializarNotas() {
        assert estudiantes != null : "Error:Los estudiantes no pueden ser nulos";
        notas = new int[estudiantes.length][MAXASIGNATURAS];
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++) {
                notas[fila][columna] = (int) ((Math.random() * 10) + 1);
            }
        }
    }

    public float[] mediasA() {
        assert notas != null : "Error:Las notas no pueden ser nulas";
        assert notas.length > 0 : "Error:Las notas no pueden ser vacias";
        float[] mediaA = new float[notas.length];
        float sumatorio = 0;
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++) {
                sumatorio += notas[fila][columna];
            }
            mediaA[fila] = sumatorio / notas[fila].length;
            sumatorio = 0;
        }
        return mediaA;
    }

    public float[] mediasP(float[] pesos) {
        assert notas != null : "Error:Las notas no pueden ser nulas";
        assert notas.length > 0 : "Error:Las notas no pueden ser vacias";
        assert pesos != null : "Error:Los pesos no pueden ser nulos";
        assert pesosCorrecto(pesos) : "Error:Los pesos no suman 1";
        float[] mediaP = new float[notas.length];
        float sumatorio = 0;
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++) {
                sumatorio += (notas[fila][columna] * pesos[columna]);
            }
            mediaP[fila] = sumatorio;
            sumatorio = 0;
        }
        return mediaP;

    }

    private boolean pesosCorrecto(float[] pesos) {
        assert pesos != null : "Error:Los pesos no pueden ser nulos";
        assert pesos.length == MAXASIGNATURAS : "Error:Los pesos tienen que ser 3";
        float sumatorio = 0;
        for (int i = 0; i < pesos.length; i++) {
            sumatorio += pesos[i];
        }
        return sumatorio == 1.00f;
    }

    public Estudiante[] suspensos(int x) {
        int contador = 0, aux = 0;
        for (int fila = 0; fila < notas.length; fila++) {
            contador = 0;
            for (int columna = 0; columna < notas[fila].length; columna++) {
                if (notas[fila][columna] < 5.00)
                    contador++;
            }
            if (contador >= x)
                aux++;
        }

        if (aux == 0)
            return new Estudiante[0];

        Estudiante[] suspensos = new Estudiante[aux];
        aux=0;

        for (int fila = 0; fila < notas.length; fila++) {
            contador = 0;
            for (int columna = 0; columna < notas[fila].length; columna++) {
                if (notas[fila][columna] < 5.00)
                    contador++;
            }
            if (contador >= x) {
                suspensos[aux] = estudiantes[fila];
                aux++;
            }
        }

        return suspensos;
    }


    @Override
    public String toString() {
        String s1 = "Curso{";
        for (int fila = 0; fila < notas.length; fila++) {
            s1 += "{estudiante=" + estudiantes[fila] + ", notas=" +
                    notas[fila][0];
            for (int columna = 1; columna < notas[fila].length; columna++) {
                s1 += ", " + notas[fila][columna];
            }
            s1 += "}, ";
        }
        return s1;
    }
}