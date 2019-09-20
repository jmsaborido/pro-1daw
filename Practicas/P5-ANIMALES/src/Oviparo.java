public interface Oviparo{
    void ponerHuevos();

    static void incubar(){
        System.out.println("estoy incubando un resfriao");
    }

    default void anidar(){
        System.out.println("Aqui voy a guardar mis huevos");
    }
}