package Lab04.Path01;

import java.util.Scanner;

public class Ex04 {
    public static boolean comprasion(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber < secondNumber && secondNumber < thirdNumber);
    }

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        System.out.println("Введите первое число:" + " " + firstNumber);
        System.out.println("Введите второе число:" + " " + secondNumber);
        System.out.println("Введите третье число:" + " " + thirdNumber);
        System.out.println("Результат:" + " " + comprasion(firstNumber, secondNumber, thirdNumber));

//Ввод через консоль
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumberCon = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumberCon = scanner.nextInt();
        System.out.println("Введите третье число:");
        int thirdNumberCon = scanner.nextInt();
        System.out.println("Результат:" + " " + comprasion(firstNumberCon, secondNumberCon, thirdNumberCon));
    }
}

