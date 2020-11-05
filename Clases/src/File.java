import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
    public void test()
    {
        Path path = Paths.get("my_text.txt");
        try {
            byte[] data = Files.readAllBytes(path);
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
