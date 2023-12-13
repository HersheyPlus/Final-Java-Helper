package binarySearch;
import java.io.*;

public class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(T[] arr, T elem) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            int compareResult = arr[middle].compareTo(elem);

            if (compareResult == 0)
                return middle;

            if (compareResult < 0)
                left = middle + 1;

            else
                right = middle - 1;
        }

        return -1;
    }

}
