
import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int smallestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = index;

        for (int i = smallest; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temporar = array[index1];
        array[index1] = array[index2];
        array[index2] = temporar;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }

    }

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

}
