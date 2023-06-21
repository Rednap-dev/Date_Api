import java.util.Scanner;
//№3
public class Usd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int xs = scanner.nextInt();
        Function<Double, String> convert = x-> String.valueOf(xs/2.5) + " USD";
        System.out.println(convert.apply(xs/2.5));
    }
}
