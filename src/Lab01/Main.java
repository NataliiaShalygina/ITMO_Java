package Lab01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        double k1 = (46 + 10) * (10 / 3.0);
        System.out.println(k1);
        short k2 = 29 * 4 * (-15);
        System.out.println(k2);

        int number = 100500;
        double result = (number / 10.0) / 10;
        System.out.println(result);

        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result1 = a * b * c;
        System.out.println(result1);

        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        int b3 = scanner.nextInt();
        if (b3 % 2 == 0 && b3 < 100) {
            System.out.println("Чётное");
        } else if (b3 % 2 != 0) {
            System.out.println("Нечётное");
        } else {
            System.out.println("Выход за пределы диапозона");
        }
    }
}
