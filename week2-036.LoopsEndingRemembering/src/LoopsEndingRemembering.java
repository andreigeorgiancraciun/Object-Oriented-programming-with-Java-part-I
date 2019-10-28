
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");

        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (number != -1) {
            if (number % 2 == 0) {
                even++;
            } else if (number % 2 == 1) {
                odd++;
            }
            sum = sum + number;
            numberOfNumbers++;
            average = (double) sum / (numberOfNumbers);
            number = Integer.parseInt(reader.nextLine());

        }

        if (sum != 0) {
            System.out.println("The sum is :" + sum);
            System.out.println("How many numbers: " + numberOfNumbers);
            System.out.println("Average: " + average);
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
            System.out.println("Thank you and see you later!");
        } else {
            System.out.println("Thank you and see you later!");
            
        }

    }

}
