import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

    private Connection connection;
    private boolean isConnected;
    private boolean operacionRealizada;
    private String user;


    public Database() {

    }


    public void connect(String usuario, String contraseña) {

        PGSimpleDataSource pgds = new PGSimpleDataSource();
        pgds.setUser(usuario);
        pgds.setUrl("jdbc:postgresql://51.75.248.163/postgres");
        pgds.setPassword(contraseña);
        pgds.setApplicationName("zoo");

        try {
            connection = pgds.getConnection();
            isConnected = true;
            setUser(pgds.getUser());

        } catch (SQLException e) {
            isConnected = false;
        }


    }

    public String select() {
        String r = "";
        String aux = "";
        try {

            PreparedStatement pstmt = connection.prepareStatement("select * from public.zoo order by id;");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                r = rs.getString(1)
                        + "\t" + rs.getObject(2)
                        + "\t\t" + rs.getObject(3);
                aux += r + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }


    public boolean insert(int id, String alias, String color) {

        try {
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO public.zoo (id,alias,color) VALUES (?, ?, ?);");

            pstmt.setInt(1, id);
            pstmt.setString(2, alias);
            pstmt.setString(3, color);
            pstmt.executeUpdate();
            operacionRealizada = true;
        } catch (Exception e) {
            operacionRealizada = false;
        }
        return operacionRealizada;
    }

    public boolean update(int id, String alias, String color) {
        try {
            PreparedStatement pstmt = connection.prepareStatement("UPDATE public.zoo SET alias = ?, color = ? WHERE id = ?;");
            pstmt.setString(1, alias);
            pstmt.setString(2, color);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            operacionRealizada = true;
        } catch (Exception e) {
            operacionRealizada = false;
        }
        return operacionRealizada;
    }

    public boolean delete(int id) {
        try {
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM public.zoo WHERE id = ?;");
            pstmt.setInt(1, id);
            pstmt.execute();
            operacionRealizada= true;
        } catch (Exception e) {
        operacionRealizada=false;
        }
        return operacionRealizada;
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }
    }

    public boolean isConnected(String usuario, String contraseña) {
        connect(usuario, contraseña);
        return isConnected;

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }


}
