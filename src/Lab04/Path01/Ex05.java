package Lab04.Path01;

import java.util.Arrays;

public class Ex05 {
    static boolean arrays(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        if (arr[0] == 3 || arr[arr.length - 1] == 3) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3};
        System.out.println("array =" + " " + Arrays.toString(arr));
        System.out.println(arrays(arr));
    }
}
