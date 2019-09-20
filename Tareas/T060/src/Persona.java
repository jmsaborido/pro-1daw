public class Persona {
    private String alias;
    private int peso;
    private int altura;

    public Persona() {
    }

    public Persona(String alias) {
        this.alias = alias;
    }

    public Persona(String alias, int peso) {
        this.alias = alias;
        this.peso = peso;
    }

    public Persona(String alias, int peso, int altura) {
        this.alias = alias;
        this.peso = peso;
        this.altura = altura;
    }

    public String mostrar(String alias) {
        return "Hola soy "+ alias;
    }

    public String mostrar(String alias, int peso) {
        return "Hola soy "+ alias+ "y peso "+ peso;
    }

    /*public int mostrar(String alias, int peso) {
        return "Hola soy "+ alias+ "y peso "+ peso;
    }*/
}
