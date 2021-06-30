package com.company.ct0630;

import java.util.Scanner;

public class bj1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] book = new int[n+1];
        int [] num = {0,1,2,3,4,5,6,7,8,9};
        int count = 0;

        for(int i = 0; i <= n; i++){

            book[i] = i;
            System.out.println(book[i]);
            if(book[i]==num[i]){
                count++;
            }

        }
    }
}
