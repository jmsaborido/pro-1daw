public class FalsoString {
    private String alias;

    public FalsoString(String alias) {
        this.alias = alias;
    }

    public String add( String a) throws UnsupportedOperationException, NullPointerException{
        if (a!=null)
            throw  new UnsupportedOperationException("Eso no se puede hacer en un String");
        else
            throw new NullPointerException("No puedes pasar un elemento nulo");


    }
}
