package co.develhope.introduction;

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
