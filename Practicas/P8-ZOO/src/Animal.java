import java.util.EventObject;

public class Animal extends EventObject {
    int id; // UNIQUE , SERIAL PRIMARY KEY
    String alias;
    String color;

    public Animal(Object source,int id, String alias, String color) {
        super(source);
        this.id = id;
        this.alias = alias;
        this.color = color;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
