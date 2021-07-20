package com.company.ct0720;

import java.util.Scanner;

public class bj6131 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1<=B<=A<=500 -> A*A > B*B N만큼크다
        int count =0;
        for(int a = 1; a <= 500; a++){
            for(int b = 1;b <= 500; b++){
                if(a * a > b * b && a * a == (b * b) + n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
