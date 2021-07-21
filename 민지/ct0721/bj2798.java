package com.company.ct0721;

import java.util.Scanner;

public class bj2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] card = new int[n];

        for(int i = 0; i < n; i++){
            card[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < n-2; i++){
            int num1 = card[i];
            for(int j = i+1; j < n-1; j++){
                int num2 = card[j];
                for(int k = j+1; k < n; k++){
                    int num3 = card[k];

                    if(sum < m) {
                        sum = num1 + num2 + num3;
                    }
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
