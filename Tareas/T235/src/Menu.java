import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Menu extends JMenuBar implements ActionListener {

    private JMenu archivo;
    private JMenu edicion;
    private JMenu formato;
    private JMenu ver;
    private JMenu ayuda;
    private JMenuItem nuevo;
    private JMenuItem abrir;
    private JMenuItem guardar;
    private JMenuItem guardarComo;
    private JMenuItem configurarPagina;
    private JMenuItem imprimir;
    private JMenuItem salir;
    private JMenuItem deshacer;
    private JMenuItem cortar;
    private JMenuItem copiar;
    private JMenuItem pegar;
    private JMenuItem eliminar;
    private JMenuItem bing;
    private JMenuItem buscar;
    private JMenuItem buscarSiguiente;
    private JMenuItem reemplazar;
    private JMenuItem irA;
    private JMenuItem seleccionarTodo;
    private JMenuItem horaYFecha;
    private JMenuItem ajusteDeLinea;
    private JMenuItem fuente;
    private JMenu zoom;
    private JMenuItem acercar;
    private JMenuItem alejar;
    private JMenuItem predeterminado;
    private JMenuItem barraEstado;
    private JMenuItem verAyuda;
    private JMenuItem about;


    private TextPanel textPanel;


    public Menu() {

        setVisible(true);


        archivo = new JMenu("Archivo");
        nuevo = new JMenuItem("Nuevo");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        guardarComo = new JMenuItem("Guardar Como");
        configurarPagina = new JMenuItem("Configurar Pagina");
        imprimir = new JMenuItem("Imprimir");
        salir = new JMenuItem("Salir");

        edicion = new JMenu("Edicion");
        deshacer = new JMenuItem("Deshacer");
        cortar = new JMenuItem("Cortar");
        copiar = new JMenuItem("Copiar");
        pegar = new JMenuItem("Pegar");
        eliminar = new JMenuItem("Eliminar");
        bing = new JMenuItem("Busqueda con Bing...");
        buscar = new JMenuItem("Buscar...");
        buscarSiguiente = new JMenuItem("Buscar siguiente");
        reemplazar = new JMenuItem("Reemplazar...");
        irA = new JMenuItem("Ir a...");
        seleccionarTodo = new JMenuItem("Seleccionar todo");
        horaYFecha = new JMenuItem("Hora y fecha");

        formato = new JMenu("Fomato");
        ajusteDeLinea = new JMenuItem("Ajuste de linea");
        fuente = new JMenuItem("Fuente...");


        ver = new JMenu("Ver");
        zoom = new JMenu("Zoom");
        acercar = new JMenuItem("Acercar");
        alejar = new JMenuItem("Alejar");
        predeterminado = new JMenuItem("Restaurar zoom predeerminado");
        barraEstado = new JMenuItem("Barra de estado");


        ayuda = new JMenu("Ayuda");
        verAyuda = new JMenuItem("Ver la ayuda");
        about = new JMenuItem("Acerca del Bloc de notas");


        add(archivo);
        add(edicion);
        add(formato);
        add(ver);
        add(ayuda);


        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(guardarComo);
        archivo.addSeparator();
        archivo.add(configurarPagina);
        archivo.add(imprimir);
        archivo.addSeparator();
        archivo.add(salir);


        edicion.add(deshacer);
        edicion.addSeparator();
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.add(eliminar);
        edicion.addSeparator();
        edicion.add(bing);
        edicion.add(buscar);
        edicion.add(buscarSiguiente);
        edicion.add(reemplazar);
        edicion.add(reemplazar);
        edicion.add(irA);
        edicion.addSeparator();
        edicion.add(seleccionarTodo);
        edicion.add(horaYFecha);


        formato.add(ajusteDeLinea);
        formato.add(fuente);

        ver.add(zoom);
        zoom.add(acercar);
        zoom.add(alejar);
        zoom.add(predeterminado);
        ver.add(barraEstado);

        ayuda.add(verAyuda);
        ayuda.addSeparator();
        ayuda.add(about);


        nuevo.addActionListener(this);
        abrir.addActionListener(this);
        guardar.addActionListener(this);
        guardarComo.addActionListener(this);
        configurarPagina.addActionListener(this);
        imprimir.addActionListener(this);
        salir.addActionListener(this);
        deshacer.addActionListener(this);
        cortar.addActionListener(this);
        copiar.addActionListener(this);
        pegar.addActionListener(this);
        eliminar.addActionListener(this);
        bing.addActionListener(this);
        buscar.addActionListener(this);
        buscarSiguiente.addActionListener(this);
        reemplazar.addActionListener(this);
        irA.addActionListener(this);
        seleccionarTodo.addActionListener(this);
        horaYFecha.addActionListener(this);
        ajusteDeLinea.addActionListener(this);
        fuente.addActionListener(this);
        acercar.addActionListener(this);
        alejar.addActionListener(this);
        predeterminado.addActionListener(this);
        barraEstado.addActionListener(this);
        verAyuda.addActionListener(this);
        about.addActionListener(this);

        archivo.setMnemonic(KeyEvent.VK_A);
        edicion.setMnemonic(KeyEvent.VK_E);
        formato.setMnemonic(KeyEvent.VK_O);
        ver.setMnemonic(KeyEvent.VK_V);
        ayuda.setMnemonic(KeyEvent.VK_Y);

        nuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        abrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        guardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        imprimir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        deshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
        cortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        eliminar.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_DELETE,0,true));
        bing.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.SHIFT_MASK));
        buscar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        buscarSiguiente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
        reemplazar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        irA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
        seleccionarTodo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        horaYFecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
        acercar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD,ActionEvent.CTRL_MASK));
        alejar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT,ActionEvent.CTRL_MASK));
        predeterminado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0,ActionEvent.CTRL_MASK));
        verAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1,0));




    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem clicked = (JMenuItem) e.getSource();


        textPanel.appendText(clicked.getText()+"\n");
        textPanel.appendText(clicked.getAccelerator().toString() + "\n");

    }
}