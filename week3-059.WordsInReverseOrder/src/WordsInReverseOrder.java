
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            String yourWord = reader.nextLine();
            if (yourWord.isEmpty()) {
                break;
            } else {
                words.add(yourWord);
            }
        }
        Collections.reverse(words);
        for (String text : words) {
            System.out.println(text);
        }
    }
}
