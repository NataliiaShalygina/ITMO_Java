package Lab04.Path02;
import java.util.Arrays;
public class Ex01 {
    public static void main(String[] args) {
        int[] example = new int[]{15,17,25,41,41};
        System.out.println(checkArrays(example));
    }

    static String checkArrays (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return "Please, try again";
            }
        }
                return "OK";
    }
}
