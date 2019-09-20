public class Rango {
    private int ini;
    private int fin;

    public Rango(int ini, int fin) {
       setIni(ini);
        setFin(fin);
    }

    private void setIni(int ini) {
        this.ini = ini;
    }

    private void setFin(int fin) {
        assert fin<ini:"Error: el fin tiene que ser mayor que el inicio";
        this.fin = fin;
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return ini +", "+ fin;
    }
}
