package ss16_File.Example1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("D:\\CODEGYM\\module_2\\module_2\\src\\ss16_File\\Example\\text.txt");
        System.out.println(file1.exists());
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
