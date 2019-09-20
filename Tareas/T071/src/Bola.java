public class Bola {
    private int numero;
    private String color;


    public Bola(int numero, String color) {
        setNumero(numero);
        setColor(color);


    }

    private void setNumero(int numero) {
        assert numero>=0 : "Error:el numero no puede ser negativo";
        this.numero = numero;

    }

    private void setColor(String color) {
        assert color != null : "Error:el color no puede ser nulo";
        this.color = color;

    }

    public static Bola generar() {

        int numRan = (int) (Math.random() * 10);
        int colRan = (int) (Math.random() * 5);
        String color = "";
        switch (colRan) {
            case 0:
                color = "rosa";
            case 1:
                color = "verde";
                break;
            case 2:
                color = "rojo";
                break;
            case 3:
                color = "amarillo";
                break;
            case 4:
                color = "azul";
                break;
            default:
                System.out.printf("Fuera de los limites,el valor es %d \n", colRan);
        }

        return new Bola(numRan, color);
    }

    @Override
    public String toString() {
        return "Bola{" +
                "numero=" + numero +
                ", color='" + color + '\'' +
                '}';
    }
}
