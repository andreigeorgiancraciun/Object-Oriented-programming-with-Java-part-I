
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");
        int y = Integer.parseInt(reader.nextLine());

        int z = Math.max(x, y);

        if (x == y) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number: " + z);
        }

    }
}
