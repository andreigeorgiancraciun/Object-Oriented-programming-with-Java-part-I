
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int x = Integer.parseInt(reader.nextLine());
        int y = Integer.parseInt(reader.nextLine());
        double z = (double)x / y; 
        
        System.out.println("Division: " + x + " / " + y + " = " + z);
        
        // Implement your program here. Remember to ask the input from user.
    }
}
