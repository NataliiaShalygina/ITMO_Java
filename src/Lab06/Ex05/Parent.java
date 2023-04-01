package Lab06.Ex05;

import java.util.Scanner;

public class Parent {
    public String Scaner() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        return x;
    }
    public void AgeName() {
        System.out.println("Введите возраст пользователя");
        System.out.println("Возраст пользователя составляет " + Scaner());
    }
}
