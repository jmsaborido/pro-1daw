import java.util.HashSet;

private class Utility {
    public static <T> boolean pertenencia(HashSet<T> conjunto1, HashSet<T> conjunto2) {
        assert conjunto1!=null:"Error: el conjunto 1 no puede ser nulo";
        assert conjunto2!=null:"Error: el conjunto 2 no puede ser nulo";

        return conjunto1.containsAll(conjunto2);
    }

    public static <T> boolean inclusion(HashSet<T> conjunto1, HashSet<T> conjunto2) {
        assert conjunto1!=null:"Error: el conjunto 1 no puede ser nulo";
        assert conjunto2!=null:"Error: el conjunto 2 no puede ser nulo";

        return conjunto2.containsAll(conjunto1);
    }

    public static <T> HashSet<T> union(HashSet<T> conjunto1, HashSet<T> conjunto2) {
        assert conjunto1!=null:"Error: el conjunto 1 no puede ser nulo";
        assert conjunto2!=null:"Error: el conjunto 2 no puede ser nulo";

        HashSet<T> aux = new HashSet<T>(conjunto1);
        aux.addAll(conjunto2);
        return aux;
    }

    public static <T> HashSet<T> diferencia(HashSet<T> conjunto1, HashSet<T> conjunto2) {
        assert conjunto1!=null:"Error: el conjunto 1 no puede ser nulo";
        assert conjunto2!=null:"Error: el conjunto 2 no puede ser nulo";

        HashSet<T> aux = new HashSet<T>(conjunto1);
        aux.removeAll(conjunto2);
        return aux;
    }

    public static <T> HashSet<T> interseccion(HashSet<T> conjunto1, HashSet<T> conjunto2) {
        assert conjunto1!=null:"Error: el conjunto 1 no puede ser nulo";
        assert conjunto2!=null:"Error: el conjunto 2 no puede ser nulo";

        HashSet<T> aux = new HashSet<T>();
        for (T x : conjunto1)
            if (conjunto2.contains(x))
                aux.add(x);
        return aux;
    }

}
