package Leccion42.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Toolbar extends JPanel implements ActionListener {
    private JButton saveButton;
    private JButton refreshButton;

    private ToolbarListener textListener;

    public Toolbar() {
        setBorder(BorderFactory.createEtchedBorder());

        saveButton = new JButton("Save");
        refreshButton = new JButton("Refresh");

        saveButton.addActionListener(this);
        refreshButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(saveButton);
        add(refreshButton);
    }

    public void setToolbarListener(ToolbarListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (clicked == saveButton) {
            if (textListener != null) {
                textListener.saveEventOccured();
            }
        } else if (clicked == refreshButton) {
            if (textListener != null) {
                textListener.refreshEventOccured();
            }
        }

    }
}
