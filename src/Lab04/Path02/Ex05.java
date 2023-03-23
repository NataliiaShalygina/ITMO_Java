package Lab04.Path02;
import java.util.Arrays;
public class Ex05 {

    public static void main(String[] args) {
        int [] example = generate(1,45,5);
        System.out.println(Arrays.toString(example));
        System.out.println(Arrays.toString(sort(example)));
    }
    public static int[] generate (int min, int max, int length){
        int [] arr = new int [length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random()*((max - min)+1) + min);
        }
    return arr;
    }
    public static int[] sort (int[] arr){
        for (int i =0; i<arr.length; i ++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i]>arr[j]){
                    int ai = arr[i];
                    int aj = arr[j];
                    arr[j] = ai;
                    arr[i] = aj;
                }
            }
        }
        return arr;
    }
}
