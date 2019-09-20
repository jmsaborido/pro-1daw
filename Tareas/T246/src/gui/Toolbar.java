package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener {
    private JButton select;
    private JButton insert;
    private JButton update;
    private JButton delete;


    private ToolbarListener textListener;

    public Toolbar() {
        setBorder(BorderFactory.createEtchedBorder());

        select = new JButton("Select");
        insert = new JButton("Insert");
        update = new JButton("Update");
        delete = new JButton("Delete");


        select.addActionListener(this);
        insert.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(select);
        add(insert);
        add(update);
        add(delete);
    }

    public void setToolbarListener(ToolbarListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (clicked == select) {
            if (textListener != null) {
                textListener.selectClicked();
            }
        } else if (clicked == insert) {
            if (textListener != null) {
                textListener.insertClicked();
            }
        } else if (clicked == update) {
            if (textListener != null) {
                textListener.updateClicked();
            }
        } else if (clicked == delete) {
            if (textListener != null) {
                textListener.deleteClicked();
            }
        }

    }
}
