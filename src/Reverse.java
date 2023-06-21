import java.util.Scanner;
//№5
public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Supplier<String> supplier = () -> {
            String reversedString = new StringBuffer(userInput).reverse().toString();
            return reversedString;
        };
        System.out.println(supplier.get());
    }
}
