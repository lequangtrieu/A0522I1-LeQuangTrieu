package ss16_File.Example2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ExampleRead2 {
    public static void main(String[] args) {
        File f = new File("D:\\CODEGYM\\module_2\\module_2\\src\\ss16_File\\Example2\\file.txt");
        try {
            List<String> allText = Files.readAllLines(f.toPath());
            for (String string :
                    allText) {
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
