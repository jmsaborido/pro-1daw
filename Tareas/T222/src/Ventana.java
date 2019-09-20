import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame
{
    public Ventana()
    {
        super ("Ejemplo 1");        // El título
        this.getContentPane().setLayout (new GridBagLayout()); // Le ponemos el GridBagLayout
        JTextArea areaTexto = new JTextArea("Area texto");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 2; // El área de texto ocupa 2 filas.
        this.getContentPane().add (areaTexto, constraints);


        JTextArea cajaTexto = new JTextArea("Area texto");
        constraints.gridx = 0; // Columna 0. No necesita estirarse, no ponemos weightx
        constraints.gridy = 0; // Fila 0. Necesita estirarse, hay que poner weighty
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.weighty = 1.0; // La fila 0 debe estirarse, le ponemos un 1.0
        this.getContentPane().add (cajaTexto, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        JButton boton1 = new JButton ("Boton 1");
        constraints.gridx = 2; // Columna 2. No necesita estirarse, no ponemos weightx
        constraints.gridy = 0; // Fila 0. Necesita estirarse, hay que poner weighty
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; /* La fila 0 debe estirarse, le ponemos un 1.0. Ya lo hicimos en el area de texto, pero aquí debemos ser coherentes y poner lo mismo.*/
        this.getContentPane().add (boton1, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        JButton boton2 = new JButton ("Boton 2");
        constraints.gridx = 2; // Columna 2, no necesita estirarse, no ponemos weigthx
        constraints.gridy = 1; // Fila 1, necesita estirarse, hay que poner weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; // La fila 1 debe estirarse, le ponemos 1.0
        this.getContentPane().add (boton2, constraints);
        constraints.weighty = 0.0; // Restauramos el valor por defecto.

        JButton boton3 = new JButton ("Boton 3");
        constraints.gridx = 0; // Columna 0, no necesita estirarse, no ponemos weigthx
        constraints.gridy = 2; // Fila 2, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton3, constraints);

        JButton boton4 = new JButton ("Boton 4");
        constraints.gridx = 2; // Columna 2, no necesita estirarse, no ponemos weightx
        constraints.gridy = 2; // Fila 2, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton4, constraints);

        JTextField campoTexto = new JTextField ("Campo texto");
        constraints.gridx = 1; // Columna 1, debe estirarse, le ponemos el weigthx
        constraints.gridy = 2; // Fila 2, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; // La columna 1 debe estirarse, ponemos el 1.0 en weigthx
        this.getContentPane().add (campoTexto, constraints);
        /* Puesto que es el último componente, no restauramos el valor por defecto. Si más adelante añadimos más componentes, seguro que pagamos cara nuestra osadía.*/


        String[] a1= {"a","b","c","d","e","f"};
        JComboBox comboBox= new JComboBox(a1);
        constraints.gridx = 0; // Columna 0, debe estirarse, le ponemos el weigthx
        constraints.gridy = 1; // Fila 1, no necesita estirarse, no ponemos weigth
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; // La columna 1 debe estirarse, ponemos el 1.0 en weigthx
        this.getContentPane().add (comboBox, constraints);

        JCheckBox checkBox= new JCheckBox("Estoy en la columna 1 y en la fila 0");
        constraints.gridx = 1; // Columna 1, debe estirarse, le ponemos el weigthx
        constraints.gridy = 0; // Fila 0, no necesita estirarse, no ponemos weigthy
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; // La columna 1 debe estirarse, ponemos el 1.0 en weigthx
        this.getContentPane().add (checkBox, constraints);




        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        setVisible(true);
    }
}