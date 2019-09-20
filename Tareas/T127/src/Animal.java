public class Animal {
    private String alias;

    public Animal(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return alias;
    }
}
