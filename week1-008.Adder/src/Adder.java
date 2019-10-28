
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int x = Integer.parseInt(reader.nextLine());
        int y = Integer.parseInt(reader.nextLine());
        
        System.out.println("Sum of the numbers: " + (x + y));
        // Implement your program here. Remember to ask the input from user
    }
}
