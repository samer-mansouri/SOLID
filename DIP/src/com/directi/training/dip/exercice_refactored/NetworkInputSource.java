import com.directi.training.dip.exercise_refactored.InputSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;



public class NetworkInputSource implements InputSource {
    private final String protocol;
    private final String host;
    private final String path;

    public NetworkInputSource(String protocol, String host, String path) {
        this.protocol = protocol;
        this.host = host;
        this.path = path;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL(protocol, host, path);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        return content.toString();
    }
}
