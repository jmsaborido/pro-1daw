import java.util.EventListener;
import java.util.EventObject;

public class Usuario extends EventObject implements EventListener {


    private String usuario;
    private String password;


    public Usuario(Object source, String usuario, String password) {
        super(source);
        setUsuario(usuario);
        setPassword(password);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
