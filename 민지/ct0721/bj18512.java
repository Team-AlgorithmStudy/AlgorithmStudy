package com.company.ct0721;

import java.util.Scanner;

public class bj18512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] run = new int[4];

        for (int i = 0; i < 4; i++) {
            run[i] = sc.nextInt();
            /* System.out.println(run[i]);*/
        }
        int sum = 0;

        int x = run[2];
        int y = run[3];
        int xSum = 0;
        int ySum = 0;

        for (int i = 0; i < 100; i++) {
            if (sum != 0) {
                break;
            }
            xSum = x + run[0] * i;

            for (int j = 0; j < 100; j++) {
                ySum = y + run[1] * j;

                if (xSum == ySum) {
                    sum = xSum;
                    break;
                } else if (xSum < ySum) {
                    break;
                }

            } // for

        } // for 


        // 출력
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println(-1);
        }

    }
}
