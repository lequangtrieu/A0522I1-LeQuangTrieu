//package ss20_code_fpt.Week_4.Utils;
//
//import java.io.IOException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class RegexEmployee {
//    private static Scanner input = new Scanner(System.in);
//
//    private static final String REGEX_NAME = "(^[A-Za-z]{3,16})([ ]{0,1})([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})";
//    private static final String REGEX_ID = "[0-9]{3}";
//
//    public static LocalDate inputBirthday() {
//        LocalDate birthday;
//        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        while (true) {
//            try {
//            System.out.println("enter day of birth: ");
//            birthday =LocalDate.parse(input.nextLine(), dateFormat);
//            LocalDate now = LocalDate.now();
//            if (now.getYear() - birthday.getYear() < 18 || now.getYear() - birthday.getYear() > 100) {
//                throw new IOException("Your age must be over 18 years-old and less than 100 years-old");
//            }
//            } catch (NumberFormatException | DateTimeParseException) {
//
//            }
//        }
//    }
//
//}
