/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CraciunA2
 */
public class Counter {

    private int number;
    private boolean cond;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.cond = check;

    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.number = this.number + increaseAmount;
        }

    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            
            this.number = this.number - decreaseAmount;
            
            if (this.cond == true && (this.number - decreaseAmount) < 0) {
                this.number = 0;
            }

        }
    }

}
