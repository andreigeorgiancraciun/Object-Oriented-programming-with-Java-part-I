
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;
    private int upperLimit;
    private int lowerLimit;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;

        while (this.upperLimit != this.lowerLimit) {
            if (isGreaterThan(average(this.lowerLimit, this.upperLimit))) {
                this.lowerLimit = average(this.lowerLimit, this.upperLimit) + 1;
                
            } else {
                this.upperLimit = average(this.lowerLimit, this.upperLimit);
                
            }

        }
        
        System.out.println("The number you're thinking of is " + this.upperLimit);

    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String yourAnswer = reader.nextLine();

        while ((!"y".equals(yourAnswer)) && (!"n".equals(yourAnswer))) {
            System.out.println("Please enter just letters 'y' or 'n'");
            yourAnswer = reader.nextLine();
        }
        if (yourAnswer.equals("y")) {
            return true;

        } else if (yourAnswer.equals("n")) {
            return false;
        }

        return false;
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    // implement here the methods isGreaterThan and average
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
