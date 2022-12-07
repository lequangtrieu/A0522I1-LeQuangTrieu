package ss16_File.Example2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExampleWrite {
    private static PrintWriter printWriter;
    public static void main(String[] args) {

        {
            try {
                printWriter = new PrintWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss16_File\\Example2\\file.txt");
                printWriter.println("abcxyz");
                printWriter.println("123456");
                printWriter.println("123456");
                printWriter.println("123456");
                printWriter.println("123456");
                printWriter.println("123456");
                printWriter.println("123456");

                Student student = new Student(15, "hung");
                printWriter.println(student);

                printWriter.flush();
                printWriter.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
