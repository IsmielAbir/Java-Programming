import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class deleteFile {
    public static void main(String [] args) throws IOException {
        Path path = Path.of("file.txt");
        Files.delete(path);
        
    }
}
