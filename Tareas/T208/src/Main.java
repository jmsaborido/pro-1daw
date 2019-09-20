public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EurosConverterGUI a =new EurosConverterGUI();
                a.setVisible(true);
                a.setSize(375,150);

            }
        });
    }


}
