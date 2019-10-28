
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int sumEuros = this.euros + added.euros;
        int sumCents = this.cents + added.cents;

        Money sumMoney = new Money(sumEuros, sumCents);

        return sumMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {

        if (new Money(this.euros, this.cents).less(decremented)) {
            return new Money(0, 0);
        }

        int minusEuros = this.euros - decremented.euros;
        int minusCents = this.cents - decremented.cents;

        if (minusCents < 0) {
            minusEuros--;
            minusCents = 100 - decremented.cents;
        }

        Money minMoney = new Money(minusEuros, minusCents);

        return minMoney;
    }

}
