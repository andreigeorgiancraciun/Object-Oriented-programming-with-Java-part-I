
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        
        int x = Integer.parseInt(reader.nextLine());
        
        if (x > 0){
            if (x < 30){
                System.out.println("Grade: failed");}}
        if (x >= 30){
            if (x <= 34){
                System.out.println("Grade: 1");}}
        if (x >= 35){
            if (x <= 39){
                System.out.println("Grade: 2");}}
        if (x >= 40){
            if (x <= 44){
                System.out.println("Grade: 3");}}
        if (x >= 45){
            if (x <= 49){
                System.out.println("Grade: 4");}}
        if (x >= 50){
            if (x <= 60){
                System.out.println("Grade: 5");}}
        
    }
}
