/*==================================================
 Archivo: Botones.java
 Fecha de creacion: 05-Mar-2017
 Fecha de la ultima modificacion: 11-Mar-2017
 Autor: Esneider Manzano
==================================================*/
/*
Clase: Botones
Responsabilidad: Posee los metodos y caracteristicas para cada boton, como identificador
	tema, color de fondo, tamano, quitar o asignar imagen a un boton.
Colaboracion: Es necesaria para la clase Control y GuiMemoria, se extiende la clase JButton
*/

package JuegoMemoria;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Botones extends JButton{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final int TAMANO = 103; // Tamano de los botones
    private int tipo, identificador;
    private String tema;
    private Border borde;

    // Se instancia un boton con borde y su tamano
    public Botones(){
        setPreferredSize(new Dimension(TAMANO,TAMANO));
        setFocusPainted(false);
        borde = new LineBorder(new Color(228,223,208), 6);
        setBorder(borde);
    }

    // Asina un numero que indica la imagen que tendra ademas del background
    public void setNumero(int num){
        tipo=num;
        setBackground(new Color(num*12,200,70));
    }

    // Con el tema elegido, asigna de esta gama de temas una imagen segun el tipo.
    public void setTema(String tem){
        tema=tem;
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/"+tema+tipo+".png"));
        setIcon(img);
    }

    public void setIndentificador(int ident){ // Asigna un identificador
        identificador = ident;
    }

    public int getTipo(){ // Retorna el tipo
        return tipo;
    }

    public int getIdentificador(){ // Retorna el identificador
        return identificador;
    }

    // Se encarga de mostrar la imagen del boton (1) o ocultarla (0)
    public void mostrarOcultarImg(final int tipoOperacion){
        // Con uso de un hilo, se crea un efecto para mostrar o cultar la imagen
        Thread hilo = new Thread(){
            public synchronized void run(){
                try {
                    int aux = 0;
                    switch (tipoOperacion) {
                        // Si las imagenes no son iguales, espera un momento para que el usuario las veas
                        // luego las oculta
                        case 0: sleep(500); aux = 92; break;
                        case 1: aux = 0; break;
                        default: break;
                    }
                    for(int i=1;i<92;i+=5){
                        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/"+tema+tipo+".png"));
                        img = new ImageIcon((img.getImage()).getScaledInstance(Math.abs(aux-i), 91, java.awt.Image.SCALE_SMOOTH));
                        setIcon(img);
                        sleep(5);
                    }
                    if(tipoOperacion==0){
                        setIcon(null);}
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };hilo.start();
    }
}
