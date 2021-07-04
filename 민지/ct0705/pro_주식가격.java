package com.company.ct0705;

public class pro_주식가격 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3, 3, 1};

        // prices 길이만큼 배열생성
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){

                if(prices[i] <= prices[j]){
                    answer[i]++;
                }
                if(prices[i] > prices[j]){
                    answer[i]++;
                    break;
                }

            }System.out.print(answer[i]);
        }

    }
}
