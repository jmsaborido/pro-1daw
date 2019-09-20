/*==================================================
 Archivo: Control.java
 Fecha de creacion: 05-Mar-2017
 Fecha de la ultima modificacion: 11-Mar-2017
 Autor: Esneider Manzano
==================================================*/
/*
Clase: Control
Responsabilidad: Maneja la logica y procesos de la interfaz en la clase GuiMemoria. Crea los
	botones y los manda a la interfaz, es el mediador para ocultar, mostrar, comparar y hacer
	efectos necesarios para la jugabilidad.
Colaboracion: Se compone de objetos de la clase Botones.
*/

package JuegoMemoria;


import java.util.Random;
import java.util.Vector;

public class Control{
    private static final int FILAS = 5, COLUMNAS = 6; // constantes de la cantidad de botones.
    private Vector<String> numero;
    private Botones[] botones;
    private Random aleatorio;
    private int ramdon, fichas, cambio, tipo1, tipo2, identi1, identi2, contador;

    // Se inicializan los botones y algunas variables
    public Control(){
        fichas = FILAS*COLUMNAS;
        botones = new Botones[FILAS*COLUMNAS];
        numero = new Vector<String>();
        aleatorio = new Random();
        prepararRamdon();
    }

    // LLena el vector "numero" con parejas del 1 a 15
    public void prepararRamdon(){
        for(int i=0;i<(FILAS*COLUMNAS/2);i++){
            numero.addElement (String.valueOf(i+1));
            numero.addElement (String.valueOf(i+1));
        }
    }

    // Retorna un numero del 1 al 15 contenidos en "numero" y elimina este elemento del vetor.
    public int ramdonNumero(){
        int retorno;
        ramdon = aleatorio.nextInt(fichas);
        retorno = Integer.parseInt(numero.elementAt(ramdon));
        numero.removeElementAt(ramdon);
        fichas-=1;
        return retorno;
    }

    // Crea los botones, les asigna el numero random y un identificador y los manda a la interfaz
    public Botones[] crearBotones(){
        for(int i=0;i<FILAS*COLUMNAS;i++){
            botones[i] = new Botones();
            botones[i].setNumero(ramdonNumero());
            botones[i].setIndentificador(i);
        }
        return botones;
    }

    // Dependiendo del tema y el numero random asigna la imagen correspondiente al boton
    public void asignarImagenes(Botones[] arreglo, String tema){
        for(int i=0;i<FILAS*COLUMNAS;i++){
            arreglo[i].setTema(tema);
        }
    }

    // Muestra la ficha, juzga si las fichas son iguales mas no la misma y
    // la oculta si no son iguales, si los son las bloquea
    public void cambiar(Botones boton, Botones[] arreglo){
        cambio+=1; //cada numero par corresponde a una comparacion de 2 fichas
        boton.mostrarOcultarImg(1);
        if(cambio%2!=0){
            // Guarda los datos del primer boton pulsado
            tipo1 = boton.getTipo();
            identi1 = boton.getIdentificador();
        }else{
            // Guarda los datos del segundo boton pulsado
            tipo2 = boton.getTipo();
            identi2 = boton.getIdentificador();
            if(tipo1 == tipo2 && identi1 != identi2){
                // Si la imagen es la misma pero diferente boton los bloquea
                boton.setEnabled(false);
                arreglo[identi1].setEnabled(false);
                contador+=1;
            }else{
                // si es el mismo boton o diferentes fichas las tapa
                boton.mostrarOcultarImg(0);
                arreglo[identi1].mostrarOcultarImg(0);
            }
        }
    }

    // Efecto que espera a que el usuario vea las fichas por un momento, luego las tapa.
    public void ocultar(final Botones[] boton){
        // Se utiliza un Hilo para el efecto
        Thread hilo = new Thread(){
            public synchronized void run(){
                try {
                    sleep(1500);
                    for(int i=0;i<FILAS*COLUMNAS;i++){
                        boton[i].setIcon(null);
                        sleep(30);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };hilo.start();
    }

    // Mira si todas las fichas estan destapadas
    public boolean ganador(){
        boolean gano=false;
        if(contador == (FILAS*COLUMNAS/2)){ gano = true; }
        return gano;
    }

    // Efecto para desbloquear los botones una vez terminado el juego.
    public void desbloquearBotones(final Botones[] boton){
        // Se utiliza un Hilo para el efecto
        Thread hilo = new Thread(){
            public synchronized void run(){
                try {
                    sleep(900);
                    for(int i=(FILAS*COLUMNAS)-1;i>-1;i--){
                        boton[i].setEnabled(true);
                        sleep(30);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };hilo.start();
    }

    // Si continua jugando, se resetea las botones, se prepara otro ramdon y setean variables
    public void seguirJugando(Botones[] botones){
        prepararRamdon();
        fichas = FILAS*COLUMNAS;
        contador = 0;
        cambio = 0;
        for(int i=0;i<FILAS*COLUMNAS;i++){
            //botones[i].setEnabled(true);
            botones[i].setNumero(ramdonNumero());
        }
    }

}
