package co.develhope.introduction;

/**
 * While Loop
 * Write a while loop for our trading bot!
 *
 * The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
 * It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
 * It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
 * On days where it sells, it can only sell 1000 pounds for euros.
 * Write a while loop
 * Use the calculation for exchange rate below
 * 1 + (Math.random() * 0.2);
 * To recalculate our rate every day (once per loop)
 * Print the number of days it takes for our bot to sell its pounds
 */
public class WhileLoop {
    public static void main(String[] args)
    {
        int moneyInHolding = 10000;
        int poundsToSell = 1000;
        int days = 0;
        double exchangeRate = 0;

        while (moneyInHolding> 0){

            if (exchangeRate > 1.15)  moneyInHolding -= poundsToSell;
            days++;
            exchangeRate = 1 + (Math.random() * 0.2);
//            System.out.println(moneyInHolding);
        }

        System.out.println("Number of days it takes for our bot to sell its pounds: " + days);
    }
}
