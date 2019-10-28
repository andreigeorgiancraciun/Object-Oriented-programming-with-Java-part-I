
import java.io.PrintStream;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int stars;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            int j = random.nextInt(100);

            if (j >= this.density * 100) {
                System.out.print(" ");
            } else {
                this.stars++;
                System.out.print("*");
                
            }
        }
        System.out.println("");

    }

    public void print() {

        this.stars = 0;

        for (int i = 0; i < height; i++) {
            printLine();

        }

    }

    public int starsInLastPrint() {
        return this.stars;
    }
}
