import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "abcdaacdfvdvcffbgcdbgfdaaa";
        char c = 'd';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("count is: "+ count);
    }
}
