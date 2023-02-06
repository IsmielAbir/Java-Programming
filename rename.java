import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class rename {
    public static void main(String [] args) throws IOException{
        Path path = Path.of("textFileRename.txt");
        Path newFile = Path.of("file.txt");
        Path m = Files.move(path, newFile);
        System.out.println(m);
    }
}
