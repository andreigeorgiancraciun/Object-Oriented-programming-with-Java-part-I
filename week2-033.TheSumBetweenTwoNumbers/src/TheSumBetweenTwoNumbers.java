
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first = Integer.parseInt(reader.nextLine());
        int last = Integer.parseInt(reader.nextLine());
        int i = first;
        int sum = 0;
        while (i >= first && i <= last) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
