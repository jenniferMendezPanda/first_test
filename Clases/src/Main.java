import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String args[]) {
        byte[] bytes = { 0x48, 0x65, 0x6c, 0x6c, 0x6f };

        try(FileOutputStream stream = new FileOutputStream("Hello world.txt")) {
            stream.write(bytes);
        } catch (IOException ioe) {
            // Handle I/O Exception
            ioe.printStackTrace();
        }
    }
}


