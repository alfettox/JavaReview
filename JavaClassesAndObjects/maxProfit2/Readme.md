## Stock Profit Calculator
This Java program calculates the maximum profit that can be obtained by buying and selling a stock on different days. The solution is implemented in the Main class, with the maxProfit method responsible for computing the maximum profit.

#### Code Explanation
The maxProfit method iterates through the given array of stock prices and accumulates the profit whenever there is a price increase from one day to the next. The logic is as follows:



    public static int maxProfit(int[] prices) {
    int totalProfit = 0;
    
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
    
        return totalProfit;
    }


- totalProfit: Accumulator variable to store the total profit.
The loop starts from the second day (i = 1) and checks if the current day's price is greater than the previous day's price.
If the condition is true, the profit for that day is calculated by subtracting the previous day's price from the current day's price, and it is added to totalProfit.

#### Example Usage
The main method contains three test cases demonstrating the usage of the maxProfit method with different arrays of stock prices:

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
Each test case initializes an array of stock prices, calls the maxProfit method, and prints the input array along with the calculated maximum profit. The output illustrates how the algorithm performs on different scenarios.