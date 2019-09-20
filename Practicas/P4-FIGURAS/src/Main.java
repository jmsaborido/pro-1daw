public class Main {

    public static void main(String[] args) {
        Figura a1 = new Circulo(TipoColor.AMARILLO, new Punto(1, 2), 1);
        Figura a2 = new Cuadrado(TipoColor.NEGRO,new Punto(5,-1),5);
        Figura a3 = new Rectangulo(TipoColor.VERDE, new Punto(-20, 1),50,2);
        Figura a4 = new Equilatero(TipoColor.BLANCO, new Punto(-5,2),5,1);
        Figura a5 = new Escaleno(TipoColor.ROJO, new Punto(1,0),2,3,1,4);
        Figura a6 = new Triangulo(TipoColor.ROJO,new Punto(1,0),5,3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a1.compareTo(a2));
        System.out.println(a5.compareTo(a6));
        a1.dibujar();



    }
}
