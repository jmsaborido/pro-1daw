/*==================================================
 Archivo: GuiMemoria.java
 Fecha de creacion: 05-Mar-2017
 Fecha de la ultima modificacion: 11-Mar-2017
 Autor: Esneider Manzano
==================================================*/
/*
Clase: GuiMemoria.
Responsabilidad: Posee los elementos de la interfaz de usuario, como el tablero y botones,
	todos los componentes graficos.
Colaboracion: Se compone de objetos de la clase Botones, y utilizar un objeto de la clase
	Control para manejar los procesos. Se extiende de la clase JFrame
*/

package JuegoMemoria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import JuegoMemoria.Botones;

public class MemoriaGUI extends JFrame{

    private static final int FILAS = 5, COLUMNAS = 6; // constantes del tamano de la matriz
    private Botones[] botones;
    private Control control; // Se encarga de manejar la logica
    private Container main, inicio;
    private JPanel panel, panelInicial, panelSur;
    private JLabel logo;
    private JComboBox<String>  comboBox;
    private JButton botonInicio;
    private EventoBoton eventoBoton = new EventoBoton(); // Eventos para los botones
    private EventoCombo eventoCombobox = new EventoCombo(); // Eventos para el comboBox
    private String elegido = "Pokemon";

    // Inicializa los componentes de la ventana
    public MemoriaGUI(){
        ventanaInicial();
        setSize(410,300);
        setTitle("Memory Blocks!");
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

        // Se crea un segundo contendor que tendra los botones
        main = getContentPane();
        panel = new JPanel();
        panel.setLayout(new GridLayout(FILAS,COLUMNAS));
        control = new Control();
        // Se crean los botones del tablero y se ponen en panel.
        botones = control.crearBotones();
        for(int i=0;i<FILAS*COLUMNAS;i++){
            botones[i].addActionListener(eventoBoton);
            panel.add(botones[i]);
        }
        main.add(panel);
        panel.setVisible(false); // Se oculta este panel
    }

    // Crea los elementos primarios a mostrar en la ventana, se muestra un logotipo,
    // un boton y un combobox
    public void ventanaInicial(){
        inicio = getContentPane();
        panelInicial = new JPanel();
        panelSur = new JPanel();
        botonInicio = new JButton("Jugar!");
        botonInicio.addActionListener(eventoBoton);
        botonInicio.setPreferredSize(new Dimension(90,40));
        botonInicio.setBackground(new Color(185,190,215));
        logo = new JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
        logo.setIcon(icon);
        String[] temas = { "Pokemon", "Bleach"};
        comboBox= new JComboBox<>(temas);
        comboBox.addActionListener(eventoCombobox);
        comboBox.setPreferredSize(new Dimension(150,40));
        panelSur.setLayout(new FlowLayout());
        panelInicial.setLayout(new BorderLayout());
        panelSur.add(comboBox);
        panelSur.add(botonInicio);
        panelInicial.add(logo, BorderLayout.NORTH);
        panelInicial.add(panelSur, BorderLayout.CENTER);
        inicio.add(panelInicial);
    }

    // Escucha del comboBox, asigna a "elegido" el tema escogido.
    private class EventoCombo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JComboBox<String> lista = (JComboBox)e.getSource();
            elegido = (String)lista.getSelectedItem();
        }
    }

    // Escuha para los botones
    private class EventoBoton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //Elige si el evento es el boton para empezar el juego o un boton de la matriz.
            if(e.getSource()==botonInicio){
                // Se asignan las imagenes del tema escogido.
                control.asignarImagenes(botones, elegido);
                // Oculta el panel inicial y muestra el panel principal
                panelInicial.setVisible(false);
                panel.setVisible(true);
                pack();
                setLocationRelativeTo(null);
                control.ocultar(botones); // Efecto de esconder los botones
            }else{
                // En este punto todo esta listo, se reciben los eventos de los botones del tablero.
                Botones boton = (Botones)e.getSource();
                control.cambiar(boton, botones); // Muestra la ficha escondida
                if(control.ganador()){
                    // Si el juego ha concluido, muestra ventana con opcion de seguir jugando
                    control.desbloquearBotones(botones);
                    String[] Opciones = {"Si quiero!", "No mejor luego..."};
                    int eleccion = JOptionPane.showOptionDialog(null,
                            "Perfecto Ganaste!\n Deseas jugar otra vez?","Has ganado!",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, Opciones, Opciones[0]);
                    if(eleccion==0){
                        panel.setVisible(false);
                        panelInicial.setVisible(true);
                        setSize(410,300);
                        setLocationRelativeTo(null);
                        control.seguirJugando(botones);
                    }else{
                        System.exit(1);
                    }
                }
            }
        }
    }
}
