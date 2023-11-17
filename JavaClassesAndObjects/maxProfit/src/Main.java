public class Main {
    public static int maxProfit(int[] prices) {

        // Edge case
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        //Loop
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            minPrice = Math.min(minPrice, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] closingPrices = {10,20,13,24,9};
        int result = maxProfit(closingPrices);
        System.out.println("Maximum Profit: " + result);
    }
}