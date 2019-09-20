public class Main {

    public static void main(String[] args) {
        Persona[] hijos = new Persona[args.length];

        for (int i = 0; i < hijos.length; i++) {
            hijos[i] = new Persona(args[i]);
        }
        mostrar(hijos);
    }
    public static void mostrar(Persona[] valores){
        if (valores==null || valores.length==0)
            return;
        for (int i = 0; i <valores.length ; i++) {
            String separador = (i!=0)? ",": "";
            System.out.print(separador+valores[i]);
        }
    }
}
