package ss16_File.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private static List arr = new ArrayList<>();
    public static void main(String[] args) {
        String file = "D:\\CODEGYM\\module_2\\module_2\\src\\ss16_File\\Test\\test.csv";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
