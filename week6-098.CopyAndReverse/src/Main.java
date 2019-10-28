
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] copy(int[] array) {

        int[] copied = new int[array.length];
        for (int i = 0; i < copied.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array) {

        int[] reverse = new int[array.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = array[reverse.length - 1 - i];
        }
        return reverse;

    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

}
