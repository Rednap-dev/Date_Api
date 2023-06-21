import java.time.LocalDate;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
//        №1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате 'год-месяц-день': ");
        String b = scanner.nextLine();
        LocalDate in = LocalDate.parse(b);
        LocalDate h = in.plusYears(100);
        System.out.println("Дата вашего рождения - " + in);
        System.out.println("Дата вашего 100-ого дня рождения - " + h);
//        №2
//        PredicateNeg.java
//        №3
//        Usd.java
//        №5
//        Reverse.java
    }
}
