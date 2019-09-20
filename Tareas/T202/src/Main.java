import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) throws IOException {
        String flowersFeed = "http://services.hanselandpetal.com/feeds/flowers.xml";
        InputStream stream = null;
        BufferedInputStream buf = null;
        Path destino = Paths.get("destino.txt");


        try {
            URL url = new URL(flowersFeed);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            Files.copy(buf,destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
            buf.close();

        }
    }

}
