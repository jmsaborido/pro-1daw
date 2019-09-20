import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal("Juan",2);
        Animal a2 = new Animal("Ruben",1);
        Animal a3 = new Animal("Pepe",3);
        Animal a4 = new Animal("Juan",4);
        Animal[] animales = {a1,a2,a3,a4};
        ordenar(animales);
        try {
            PrintStream out = new PrintStream(new FileOutputStream("animales.txt"));
            out.println(Arrays.toString(animales));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void ordenar(Animal[] animales){
            Animal temp;
            for(int i=0; i < animales.length; i++){
                for(int j=1; j < (animales.length-i); j++){
                    if(animales[j-1].compareTo(animales[j])>=0){
                        temp = animales[j-1];
                        animales[j-1] = animales[j];
                        animales[j] = temp;
                    }

                }
            }
    }
}
