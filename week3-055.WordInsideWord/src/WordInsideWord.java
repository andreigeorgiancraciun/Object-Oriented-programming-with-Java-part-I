
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word1 = reader.nextLine();
        String word2 = reader.nextLine();
        
        if ( word1.indexOf(word2) >= 0){
            System.out.println("The word '" + word2 + "' is found in the word " + word1 + ".");
        }
        else {
            System.out.println("The word '" + word2 + "' is not found in the word " + word1 + ".");
        }
    }
}
