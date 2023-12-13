package practice;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Orange", "Banana");

        String joinedString = String.join(" + ", words);
        System.out.println(joinedString); // Output: Apple, Orange, Banana
    }

    public static int[] sortNumeric(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static String[] sortString(String[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static double sumOfDouble(double[] arr){
        double sum = 0;
        for (double elem : arr) {
            sum += elem;
        }
        return sum;
    }
    public static int sumOfInt(int[] arr){
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static double averageDouble(double[] arr){
        double sum = 0;
        for (double elem : arr) {
            sum += elem;
        }
        return sum / arr.length;
    }

    public static int averageInt(int[] arr){
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum / arr.length;
    }

    public static <T> Boolean findSpecific(T[] arr, T value){
        for (T elem: arr){
            if (elem == value) return true;
        }
        return false;
    }
    public static <T> int findIndex(T[] arr, T value){
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == value) return i;
        }
        throw new RuntimeException("Index not found");
    }

    public static <T> T[] removeSpecific(T[] arr, T value){
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == value) {
                int currentIndex;
                arr[i] = null;
                currentIndex = i;
                for (int j = currentIndex; j < arr.length;j++){
                    arr[j] = arr[j + 1];
                }
                return arr;
            }
        }
        return arr;
    }

    public static <T> T[] copyArray(T[] arr){
        return Arrays.copyOf(arr, arr.length);
    }

    public static double findMaximum(double[] arr) {
        double maximum = 0;
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i] > maximum) maximum = arr[i];
        }
        return maximum;
    }
    public static double findMinimum(double[] arr) {
        double minimum = 99999999.0;
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i] < minimum) minimum = arr[i];
        }
        return minimum;
    }

    public static double findSecondSmallest(double[] arr){
        double result = findMinimum(arr);
        double minimum = 99999999.0;
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i] < minimum && arr[i] != result) minimum = arr[i];
        }
        return minimum;
    }
    public static double findSecondLargest(double[] arr){
        double result = findMaximum(arr);
        double maximum = 0;
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i] < maximum && arr[i] != result) maximum = arr[i];
        }
        return maximum;
    }

    public static Boolean check65And77isContain(int[] arr){
        boolean isContain65 = false;
        boolean isContain77 = false;
        for (int elem:arr){
            if (elem == 65) isContain65 = true;
            else if ( elem == 77) isContain77 = true;
        }
        return isContain65 && isContain77;
    }
    public static Boolean checkIsWithoutNegativeOneAndZero(int[] arr){
        boolean isWithoutNegativeOne = false;
        boolean isWithoutOne = false;

        for (int elem:arr){
            if (elem == 0) isWithoutOne = true;
            else if ( elem == -1) isWithoutNegativeOne = true;
        }
        return isWithoutNegativeOne && isWithoutOne;
    }

    public static boolean sumIsEqual30(int[] arr){
        int sum = 0;
        for (int elem:arr){
            sum += elem;
        }
        if (sum == 30) {
            return true;
        }
        return false;
    }

}
