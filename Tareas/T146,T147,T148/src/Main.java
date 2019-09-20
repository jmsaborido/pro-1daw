public class Main {

    public static void main(String[] args) {
	Nodo[] nodos={new Nodo("juan",5),new Nodo("Juan",1),new Nodo("pepe",3),new Nodo("Pepe",7),new Nodo("Anacleto", 0),new Nodo("anacleto",6),new Nodo("rodolfo",1),new Nodo("rodolfo",-1)};
    mostrar(nodos);
    ordenarAscend(nodos);
    // mostrar(nodos);
    // ordenarDescend(nodos);
    // mostrar(nodos);
    }

    public static void ordenarAscend(Nodo[] array){
        int n = array.length;
        Nodo aux;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1].compareTo(array[j])>0){
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }

            }
        }  
    }
    public static void ordenarDescend(Nodo[] array){
        int n = array.length;
        Nodo aux;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1].compareTo(array[j])<0){
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }

            }
        }


    }


    public static void mostrar(Nodo[] valores) {
        if (valores == null || valores.length == 0)
            return;
        for (int i = 0; i < valores.length; i++) {
            String separador = (i != 0) ? "," : "";
            System.out.print(separador + valores[i]);
        }
        System.out.println();
    }
}
