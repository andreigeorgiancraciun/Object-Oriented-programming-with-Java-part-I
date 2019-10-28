
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;

    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = length;
        String pass = "";
        while (i > 0) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            pass = pass + symbol;
            i--;
        }
        return pass;
    }
}
