public class Tanque {
    -fila:int {>=0}
-columna:int {>=0}
-direccion:char = ‘N’ {‘N’,’S’,’E’,’O’}
«constructores»
            +Tanque()
«accesores»
            +getFila():int
+getColumna():int
+getDireccion():char
«mutadores»
            -setFila(fila:int)
-setColumna(columna:int)
+setDireccion(direccion:char)
«otros»
            +avanzar(distancia:int) {distancia>=0}
+toString():String
}
