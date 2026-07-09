
public class Stocks {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit is :" + buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks(int[] arr) {
        int maxProfit = 0;
        int buyingPrice = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int profit = Integer.MIN_VALUE;
            int sellPrice = arr[i];
            if (buyingPrice < sellPrice) {
                profit = sellPrice - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyingPrice = sellPrice;
            }
        }
        return maxProfit;
    }
}
