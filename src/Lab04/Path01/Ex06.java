package Lab04.Path01;

import java.util.Arrays;

public class Ex06 {
    static boolean array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3 || arr[i] == 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] example = new int[]{8, 5, 1};
        System.out.println("array =" + " " + Arrays.toString(example));
        System.out.println(array(example));
    }
}

