public class Constructor {
    private int a;

    public Constructor(int a){
        setConstructor(a);

    }
    public void setConstructor (int a ){
        this.a=a;
    }

    @Override
    public String toString() {
        return "" + a ;
    }
}
