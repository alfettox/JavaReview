public class Main {

    //It captures just the positive results

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;    //Total profit of the timeframe

        for (int i = 1; i < prices.length; i++) {         //loop from second element
            if (prices[i] > prices[i - 1]) {              //if price curr element > prev
                totalProfit += prices[i] - prices[i - 1]; //update profit with the difference of price
            }
        }

        return totalProfit;
    }

    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int result1 = maxProfit(prices1);
        System.out.println("{7, 1, 5, 3, 6, 4} ->" + result1);

        int[] prices2 = {1, 2, 3, 4, 5};
        int result2 = maxProfit(prices2);
        System.out.println("{1, 2, 3, 4, 5} ->" + result2);

        int[] prices3 = {7, 6, 4, 3, 1};
        int result3 = maxProfit(prices3);
        System.out.println("{7, 6, 4, 3, 1} ->" + result3);
    }
}
