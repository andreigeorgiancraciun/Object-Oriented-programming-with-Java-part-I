
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        Scanner read = new Scanner(System.in);
      
        System.out.println("Type numbers: ");
        while (true) {
            int yourNumber = Integer.parseInt(read.nextLine());
            if (yourNumber != -1) {
                if(yourNumber % 2 == 0){
                    even.addNumber(yourNumber);
                }
                else {
                    odd.addNumber(yourNumber);
                }
                stats.addNumber(yourNumber);
            } else {
                break;
            }

        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odds: " + odd.sum());
    }
}
