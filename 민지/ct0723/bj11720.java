package com.company.ct0723;

import java.util.Scanner;

public class bj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] sum = sc.next().split("");

        int answer = 0;

        for(int i = 0; i < num; i++){

            answer += Integer.parseInt(sum[i]);

        }
        System.out.println(answer);

    }
}
