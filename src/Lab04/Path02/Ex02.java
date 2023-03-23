package Lab04.Path02;
import java.util.Arrays;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int i = scanner.nextInt();
        int[] example = new int [i];
        System.out.println("Numbers of array:");
        for (i = 0; i < example.length; i++){
            example[i] = scanner.nextInt();
        }
        System.out.println("Result:" + Arrays.toString(example));
    }
}
