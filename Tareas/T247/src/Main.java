import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://51.75.248.163:3306/swingtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Conexion a1 = null;
        try {
            Connection c1 = DriverManager.getConnection(url, "prueba", "eclipseEslom3jor%");
            a1 = new Conexion(c1);
            a1.connect();
            a1.load();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


//        try {
//            Connection c2 = DriverManager.getConnection(url, "admin", "FaberCastell0%");
//            a1 = new Conexion(c2);
//            a1.connect();
//            a1.load();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        a1.disconnect();



    }
}
