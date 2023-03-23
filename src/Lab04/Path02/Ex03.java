package Lab04.Path02;
import java.util.Arrays;
public class Ex03 {
    public static void main(String[] args) {
        int[] example = new int[]{1, 5, 7, 9, 15};
        System.out.println("Array 1:" + Arrays.toString(example));
        System.out.println("Array 2:" + Arrays.toString(arrayTwo(example)));
    }
        public static int[] arrayTwo (int[] arrayOne){
        int firstNumber = arrayOne[0];
        int lastNumber = arrayOne[arrayOne.length-1];
        arrayOne[0] = lastNumber;
        arrayOne[arrayOne.length-1] = firstNumber;
        return arrayOne;
    }
}
