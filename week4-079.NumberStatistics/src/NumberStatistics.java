
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        sum = sum + number;
    }

    public int amountOfNumbers() {
        // code here
        
        return amountOfNumbers;
    }
    
    public int sum() {
        // code here
        return sum;
    }

    public double average() {
        // code here
        if(sum != 0){
            return (double) sum / this.amountOfNumbers;
        }else {
            return 0; 
        }
        
    }
}

