
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        
        int maxOfFirst2 = Math.max(number1, number2);
        int maxOfFirst3 = Math.max(maxOfFirst2, number3);
        return maxOfFirst3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
