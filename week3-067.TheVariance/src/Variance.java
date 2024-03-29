
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum = sum + number;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double) sum(list) / list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double squareSUM = sum(list) * average(list); // sum * sum / list size
        int sumOfSquares = 0;
        for (Integer number : list) {
            sumOfSquares = sumOfSquares + number * number;
        }
        double substract = sumOfSquares - squareSUM;
        double finalAnswer = substract / (list.size() - 1);

        return finalAnswer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
