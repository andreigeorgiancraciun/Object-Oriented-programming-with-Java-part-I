
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            String yourWord = reader.nextLine();
            if (words.contains(yourWord)) {
                System.out.println("You gave twice the word " + yourWord);
                break;
            } else {
                words.add(yourWord);

            }
        }

    }

}
