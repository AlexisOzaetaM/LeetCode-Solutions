package javasolutions;

// Best Time to Buy and Sell Stock II
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    // Solution
    public static int maxProfit(int[] prices) {
        int profit = 0, buyDay = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[buyDay] < prices[i]) {
                profit += prices[i] - prices[buyDay];
            }
            buyDay++;
            if (i == prices.length - 1) i = buyDay + 1;
        }

        return profit;
    }
}
