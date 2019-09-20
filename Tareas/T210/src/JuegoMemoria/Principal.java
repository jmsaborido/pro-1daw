/* Clases: JFrame, JButton, ImageIcon, Dimension
 * Metodos:
 *          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
 *          setSize(410,300);
		    setTitle("Memory Blocks!");
		    panel.setLayout(new GridLayout(FILAS,COLUMNAS));
		    setPreferredSize(new Dimension(TAMANO,TAMANO));
 */

package JuegoMemoria;

import javax.swing.JFrame;

public class Principal
{
    public static void main(String[] args)
    {
        MemoriaGUI vista = new MemoriaGUI();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
