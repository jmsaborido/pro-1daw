import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cubo();
            }
        });


    }
}


    //
    // Casilla[][] c1= new Casilla[3][3];
    // String dev="";
    //
    //     for (int i = 0; i <3 ; i++) {
    //     for (int j = 0; j <3 ; j++) {
    //     c1[i][j]=new Casilla(TipoColor.values()[0]);
    //     dev+=c1[i][j];
    //     }
    //     dev+="\n";
    //     }
    //     System.out.println(dev);
