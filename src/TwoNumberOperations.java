import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumberOperations {
    public static void main(String[] args) {
        try {
            System.out.println("Введите а");

            // Создаем экземпляр сканера для получения данных пользователя из консоли
            Scanner scanner = new Scanner(System.in);
            // Ожидание ввода числа через консоль
            int a = scanner.nextInt();

            System.out.println("Вы ввели a: " + a);

            System.out.println("Введите b");
            int b = scanner.nextInt();

            System.out.println("Вы ввели b: " + b);

            compareTwoNumbers(a, b);

            addTwoNumbers(a, b);

            subTwoNumbers(a, b);

            divTwoNumbers(a, b);

            mulTwoNumbers(a, b);

            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        }
    }

    public static void compareTwoNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a = b");
        }  else {
            System.out.println("a < b");
        }
    }

    public static void addTwoNumbers(int a, int b) {
        int result = a + b;
        System.out.println("a + b = " + result);
    }

    public static void subTwoNumbers(int a, int b) {
        int result = a - b;
        System.out.println("a - b = " + result);
    }

    public static void divTwoNumbers(int a, int b) {
        int result = a / b;
        System.out.println("a / b = " + result);
    }

    public static void mulTwoNumbers(int a, int b) {
        int result = a * b;
        System.out.println("a * b = " + result);
    }
}
