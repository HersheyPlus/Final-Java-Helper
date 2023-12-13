package learnArr;
import binarySearch.BinarySearch;
import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        int[] intArr = {543,63467,227,273,2743,217,22,753735};
        String[] stringArr = {"A","B","C","D","E"};
        int[] copyArr = Arrays.copyOf(intArr, intArr.length + 5);
        String[] copyArr2 = Arrays.copyOf(stringArr, stringArr.length + 5);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(copyArr));
        System.out.println(Arrays.toString(copyArr2));
    }
}
