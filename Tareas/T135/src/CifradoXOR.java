
public class CifradoXOR {
    private String aCifrar;
    private String cifrada;


    public CifradoXOR(String aCifrar) {
        setaCifrar(aCifrar);

    }

    private void setaCifrar(String aCifrar) {

        assert  aCifrar!=null:"Error: la palabra a cifrar no puede ser nula";
        assert  !aCifrar.isEmpty():"Error: la palabra a cifrar no puede ser vacia";

        this.aCifrar = aCifrar;
    }

    public String getaCifrar() {
        return aCifrar;
    }

    public String getCifrada() {
        return cifrada;
    }

    public void setCifrada(String cifrada) {
        assert  cifrada!=null:"Error: la palabra a cifrar no puede ser nula";
        assert  !cifrada.isEmpty():"Error: la palabra a cifrar no puede ser vacia";

        this.cifrada = cifrada;
    }

    public void cifrado(String palabraClave) {
        assert palabraClave != null : "Error: la palabra clave no puede ser nula";
        assert !palabraClave.isEmpty() : "Error: la palabra clave no puede estar vacia";

        char[] clave = palabraClave.toCharArray();
        StringBuilder cifrado = new StringBuilder();
        int cont=0;

        for (int i = 0; i < aCifrar.length(); i++){
            cifrado.append ((char)(aCifrar.charAt(i) ^ clave[(i) % clave.length] % clave.length));
        }
        setCifrada(cifrado.toString());
    }
    public void cifrado(int n) {

        char[] aux = aCifrar.toCharArray();
        String cifrado ="";

        for (int i = 0; i < aux.length; i++)
            cifrado += (char)(aux[i] ^ n);

        setCifrada(cifrado);
    }
}