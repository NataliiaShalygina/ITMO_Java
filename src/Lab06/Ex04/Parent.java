package Lab06.Ex04;

import java.util.Scanner;

public class Parent {
    Integer number;

    public int NewParent() {
        System.out.println("Введите целое чило");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        return number;
    }
}
