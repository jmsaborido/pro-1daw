public class Main {

    public static void main(String[] args) {
        String[]s1 ={"hola","hello"};
        String[]s2={"adios","bye"};
        String[]s3={"eclipse","eclipse"};
        String[]s4={"perro","dog"};
        String[]s5={"gato","cat"};
        Palabra p1 = new Palabra(s1);
        Palabra p2 = new Palabra(s2);
        Palabra p3 = new Palabra(s3);
        Palabra p4 = new Palabra(s4);
        Palabra p5 = new Palabra(s5);
        Palabra[]pa1 ={p1,p2,p3,p4,p5};
        Diccionario a1 =new Diccionario(pa1);
        new interfazDiccionario(a1);
    }
}
