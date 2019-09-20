import java.io.*;

public class FileCopy {
    public static void main(String[] args) {


        if (args.length == 2) {


            try {
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
                String linea;
                while ((linea = br.readLine()) != null){
                    bw.write(linea);
                    bw.write("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (args.length == 3) {

            try {


                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

                String linea;
                while ((linea = br.readLine()) != null) {
                    if (linea.contains(args[2])) {
                        bw.write(linea);
                        bw.write("\n");
                    }
                }
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else
            System.err.println("Numero de parametros invalidos");
    }
}

