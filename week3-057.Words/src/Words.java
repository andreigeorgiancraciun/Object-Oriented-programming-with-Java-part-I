import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String yourWord = reader.nextLine();
        
        while(yourWord.isEmpty() != true){
            words.add(yourWord);
            yourWord = reader.nextLine();    
        }
        
        for(String text : words){
            System.out.println(text);
        }
    }
}
