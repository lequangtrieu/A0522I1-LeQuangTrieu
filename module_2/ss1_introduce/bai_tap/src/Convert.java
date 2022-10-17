import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        System.out.println("Checking number ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if(num >=0 && num <= 9) {
            switch (num) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
            }
        } else if(num >= 10 && num <= 20) {
            switch (num) {
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    int check = num % 10;

            }
        }
    }
}
