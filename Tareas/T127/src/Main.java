import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
    String y = "Juan,Pepe";
    mostrar(constructorAnimales(y));

    }

    public static Animal[] constructorAnimales(String y){
        StringTokenizer a = new StringTokenizer(y, ",");
        Animal[] ret = new Animal[a.countTokens()];
        for (int i = 0; i <ret.length ; i++) {
            ret[i]=new Animal(a.nextToken());
        }

        return ret;
    }

    public static void mostrar(Animal[] valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ",": "";
            System.out.print(separador+valores[i]);
        }
    }
}
