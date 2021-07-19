package com.company.ct0719;

import java.util.Scanner;

public class bj13410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] num = new int[k +1];

        for(int i = 1; i <= k; i++){
            num[i] = n * i;
           /* System.out.println(num[i]);*/
        }

        int[] reverse = new int[num.length];

        for(int i = 1; i <=k; i++ ){
            while (num[i] != 0){
                int digit = num[i] % 10;
                reverse[i] = reverse[i] * 10 + digit;
                num[i] /= 10;
            }
           /* System.out.println(reverse[i]);*/
        }
        int max = 0;
        for(int i = 0; i < reverse.length; i++){
            if(reverse[i] > max){
                max = reverse[i];
            }
        }
        System.out.println(max);
    }
}

