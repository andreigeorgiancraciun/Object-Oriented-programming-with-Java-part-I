
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        int i = name.length() - 1;
        System.out.print("In reverse order: ");
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
        System.out.println("");
    }
}
