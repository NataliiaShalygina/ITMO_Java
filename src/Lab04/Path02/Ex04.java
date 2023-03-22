package Lab04.Path02;
import java.util.Arrays;
public class Ex04 {
    public static void main(String[] args) {
        int[] example = new int[]{1,2,5,2,1};
        System.out.println(unik(example));
    }
    public static String unik(int[] arr) {
        String conc = "Уникальных значений нет";
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] != arr[k] && i != k) {
                    l++;
                }
            }
            if (l == arr.length-1) {
                conc = "Первое уникальное значение равно " + arr[i];
                break;
            }
        }
        return conc;
    }
}