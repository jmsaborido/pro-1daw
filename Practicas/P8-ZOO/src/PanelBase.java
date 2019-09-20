import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


public class PanelBase extends JPanel implements ActionListener {

    private JLabel etiquetaId;
    private JLabel etiquetaAlias;
    private JLabel etiquetaColor;
    private JTextField idText;
    private JTextField aliasText;
    private JTextField colorText;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private JTextArea textArea;
    private JButton select;
    private JButton insert;
    private JButton update;
    private JButton delete;
    private JScrollPane jp;
    private String columnas = "--------------------------------------------------------------------------\n" +
            "| ID                  | ALIAS                                        | COLOR     |\n" +
            "--------------------------------------------------------------------------\n";
    private Database database;


    public PanelBase(Connection conexion) {


        // PANEL SUPERIOR GRIDBAGLAYOUT CONSTRAINS
        panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridBagLayout());
        GridBagConstraints go = new GridBagConstraints();
        panelSuperior.setPreferredSize(new Dimension(395, 300));


        textArea = new JTextArea();
        textArea.append(columnas);
        panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.add(textArea, BorderLayout.CENTER);
        panelInferior.setPreferredSize(new Dimension(300, 300));
        //BARRA DEZPLAZAMINETO
        jp = new JScrollPane(textArea);
        panelInferior.add(jp);

        // BORDES PANELES SUPERIOR E INFERIOR

        Border innerBorder1 = BorderFactory.createTitledBorder("Consulta");
        Border innerBorder2 = BorderFactory.createTitledBorder("Tabla");
        Border outerBorder2 = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panelSuperior.setBorder(BorderFactory.createCompoundBorder(outerBorder2, innerBorder1));
        panelInferior.setBorder(BorderFactory.createCompoundBorder(outerBorder2, innerBorder2));

        // DATABASE
        database = new Database();
        database.setConnection(conexion);
        textArea.append(database.select());


        // ETIQUETAS JTEXTFIELD JLABEL
        select = new JButton();
        etiquetaId = new JLabel("Id: ");
        etiquetaAlias = new JLabel("Alias: ");
        etiquetaColor = new JLabel("Color: ");
        idText = new JTextField(15);
        aliasText = new JTextField(15);
        colorText = new JTextField(15);


        // BOTON DE CONSULTA
        select = new JButton("Consultar");
        select.addActionListener(this);
        insert = new JButton("Agregar");
        insert.addActionListener(this);
        update = new JButton("Modificar");
        update.addActionListener(this);
        delete = new JButton("Eliminar");
        delete.addActionListener(this);


        // AÑADIR AL BORDERLAYOUT DEL PANELBASE
        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.SOUTH);
        add(panelInferior, BorderLayout.NORTH);


        // PANEL INFERIOR CONSTRAINS

        //LINEA 1
        go.gridx = 0;
        go.gridy = 1;
        go.anchor = GridBagConstraints.WEST;
        go.insets = new Insets(0, 10, 0, 0);
        panelSuperior.add(etiquetaId, go);

        //LINEA 2
        go.gridx = 0;
        go.gridy = 2;
        go.insets = new Insets(0, 10, 0, 0);
        go.anchor = GridBagConstraints.WEST;
        go.fill = GridBagConstraints.HORIZONTAL;
        panelSuperior.add(idText, go);

        //LINEA 3
        go.gridx = 0;
        go.gridy = 3;
        go.insets = new Insets(0, 10, 0, 0);
        go.anchor = GridBagConstraints.WEST;
        panelSuperior.add(etiquetaAlias, go);

        //LINEA 4
        go.gridx = 0;
        go.gridy = 4;
        go.insets = new Insets(0, 10, 0, 0);
        go.anchor = GridBagConstraints.WEST;
        panelSuperior.add(aliasText, go);


        //LINEA 5
        go.gridx = 0;
        go.gridy = 5;
        go.insets = new Insets(0, 15, 0, 0);
        go.anchor = GridBagConstraints.WEST;
        panelSuperior.add(etiquetaColor, go);

        //LINEA 6
        go.gridx = 0;
        go.gridy = 6;
        go.insets = new Insets(0, 10, 0, 0);
        go.anchor = GridBagConstraints.WEST;
        panelSuperior.add(colorText, go);

        // ULTIMA LINEA

        go.gridx = 0;
        go.gridy = 8;
        go.insets = new Insets(10, 10, 0, 0);
        go.anchor = GridBagConstraints.LINE_END;
        panelSuperior.add(select, go);

        go.gridx = 1;
        go.gridy = 8;
        go.insets = new Insets(10, 10, 0, 0);
        go.anchor = GridBagConstraints.LINE_END;
        panelSuperior.add(insert, go);

        go.gridx = 2;
        go.gridy = 8;
        go.insets = new Insets(10, 10, 0, 0);
        go.anchor = GridBagConstraints.LINE_END;
        panelSuperior.add(update, go);


        go.gridx = 3;
        go.gridy = 8;
        go.insets = new Insets(10, 10, 0, 0);
        go.anchor = GridBagConstraints.LINE_END;
        panelSuperior.add(delete, go);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source == select) {
            textArea.setText("");
            textArea.setText(columnas);
            textArea.append(database.select());
        } else if (source == insert) {

            int id = Integer.parseInt(idText.getText());
            String alias = aliasText.getText();
            String color = colorText.getText();
            textArea.setText("");
            textArea.setText(columnas);

            if (!database.insert(id, alias, color))
                Marco.mostrar(database.getUser(), "agregar");
            textArea.append(database.select());

        } else if (source == update) {
            int id = Integer.parseInt(idText.getText());
            String alias = aliasText.getText();
            String color = colorText.getText();
            textArea.setText("");
            textArea.setText(columnas);
            if (!database.update(id, alias, color))
                Marco.mostrar(database.getUser(), "modificar");

            textArea.append(database.select());

        } else if (source == delete) {
            int id = Integer.parseInt(idText.getText());
            textArea.setText("");
            textArea.setText(columnas);
            if (!database.delete(id))
                Marco.mostrar(database.getUser(), "eliminar");
            textArea.append(database.select());
        }

        /*Animal ev = new Animal(this, id, alias, color);

        if (formListener != null) {
            formListener.formEventOcurred(ev);
        }*/
    }

    public void cerrar() {
        database.disconnect();
    }
}
