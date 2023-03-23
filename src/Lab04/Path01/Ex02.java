package Lab04.Path01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] ar3 = new int[33];
        int[] ar5 = new int[19];
        int[] ar15 = new int[6];
        int k = 0;
        for (int i = 0; i < ar3.length; i++) {
            k = k + 3;
            ar3[i] = k;
        }
        k = 0;
        for (int i = 0; i < ar5.length; i++) {
            k = k + 5;
            ar5[i] = k;
        }
        k = 0;
        for (int i = 0; i < ar15.length; i++) {
            k = k + 15;
            ar15[i] = k;
        }
        System.out.println("Делятся на 3:" + " " + Arrays.toString(ar3));
        System.out.println("Делятся на 5:" + " " + Arrays.toString(ar5));
        System.out.println("Делятся на 3 и на 5:" + " " + Arrays.toString(ar15));
    }
}
