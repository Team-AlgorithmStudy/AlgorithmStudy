package com.company.ct0720;

import java.util.Scanner;

public class bj2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] card = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++){
            card[i] = sc.nextInt();
        }

        for(int i =0; i < card.length-2; i++) {
            int num1 = card[i];
            for(int j = i+1; j < card.length -1; j++){
                int num2 = card[j];
                for(int k = j+1; k < card.length; k++){
                    int num3 = card[k];
                    if(k == card.length-1){
                        break;
                    }else if(sum < m){
                        sum = num1 + num2 + num3;
                        if(sum > m){

                        }
                    }

                }
            }
        }
        System.out.println(sum);
    }
}
