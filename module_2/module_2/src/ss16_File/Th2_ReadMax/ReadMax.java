package ss16_File.Th2_ReadMax;

import ss16_File.Th1_SumFile.ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadMax {

    public static final String FILE_PATH = "D:\\CODEGYM\\module_2\\module_2\\src\\ss16_File\\Th2_ReadMax\\numbers.csv";

    public List<Integer> readFile(String path) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";

        while ((line = bufferedReader.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }
        bufferedReader.close();
        return numbers;
    }

    public void writeFile(String path, int max) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("The max is: " + max);
        bufferedWriter.close();
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadMax readMax = new ReadMax();
        List<Integer> numbers = readMax.readFile(FILE_PATH);
        int maxValue = findMax(numbers);
        readMax.writeFile("D:\\CODEGYM\\module_2\\module_2\\src\\ss16_File\\Th2_ReadMax\\result.csv", maxValue);
    }

}
