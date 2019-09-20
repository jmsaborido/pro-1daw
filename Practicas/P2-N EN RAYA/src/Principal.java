public class Principal {

    public static void main(String[] args) {
        Jugador a = new Jugador("Eclipse",new Ficha(TipoFicha.O));
        Jugador b = new Jugador("Faber Castell",new Ficha(TipoFicha.X));
        int dimension=3;
        Partida p = new Partida(a,b,dimension);
        p.jugar();

    }



}
