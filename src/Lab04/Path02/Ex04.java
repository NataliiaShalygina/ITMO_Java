package Lab04.Path02;
import java.util.Arrays;
public class Ex04 {
    public static void main(String[] args) {
        int[] example = new int[]{1, 1,-9999,3,-9999,3};
        System.out.println(unik(example));
    }

    public static String unik(int[] arr) {
        int a = 0;
        int m = 0;
        String conc;
        for (int i = 0; i < arr.length; i++) {
            int l =0;
            a = arr[i];
            for (int k = 0; k < arr.length; k++) {
                if (a != arr[k]) {
                    l++;
                }
            }
            if (l == arr.length - 1) {
                break;
            } else {
                a = -9999;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -9999) {
                m++;
            }
        }
        if (a==-9999) {
            if (m == 1) {
                conc = "Первое уникальное число равно -9999";
            } else {
                conc = "Уникальных чисел нет";
            }
        } else {conc = "Первое уникальное число равно " + a;}
        return conc;
    }
}