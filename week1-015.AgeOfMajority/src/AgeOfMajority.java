
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you? ");
        int x = Integer.parseInt(reader.nextLine());

        if (x >= 18) {
            System.out.println("You have reached the age of majority!");
            // Type your program here 
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
