public class buyAndSellStock {

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int maxPro = 0,min = prices[0];
        for(int i = 1 ; i<prices.length;i++){
            if(prices[i]-min>maxPro){
                maxPro = prices[i]-min;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return maxPro;
    }
}