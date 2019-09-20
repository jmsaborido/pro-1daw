public class Ordenador {

    private String cpu;
    private int memoria;
    private boolean encendido;

    public Ordenador(String cpu, int memoria, boolean encendido) {
        setCpu(cpu);
        setMemoria(memoria);
        setEncendido(encendido);
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
