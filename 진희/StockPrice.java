import java.util.Arrays;

public class StockPrice {

    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
        int[] answer = new int[prices.length];
        int count;
        for (int j = 0; j < prices.length; j++) {
            count = 0;
            for (int i = j+1; i < prices.length; i++) {
                count++;
                if(prices[i]<prices[j]){
                    break;
                }
            }
            answer[j]=count;
        }

        System.out.println(Arrays.toString(answer));
    }
}
