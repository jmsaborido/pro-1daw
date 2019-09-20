import java.io.*;


public class Main {

    public static void main(String[] args) {
        fileCopy("Eclipse.txt", "Betis.txt");
        fileCopy("IntelliJ.txt", "FaberCastell.txt", "PATRON");

    }

    public static void fileCopy(String origen, String destino) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(origen));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino));
            String linea;
            while ((linea = br.readLine()) != null){
                bw.write(linea);
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void fileCopy(String origen, String destino, String patron) {


        try {


            BufferedReader br = new BufferedReader(new FileReader(origen));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino));

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(patron)){
                    bw.write(linea);
                    bw.write("\n");
                }
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
