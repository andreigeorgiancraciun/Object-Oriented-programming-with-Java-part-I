
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int length = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + word.substring(0,length));
    }
}
