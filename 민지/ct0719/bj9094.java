package com.company.ct0719;

import java.util.Scanner;

public class bj9094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int[] answer = new int[k];

        for(int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;
            for (int a = 1; a < n-1; a++) {
                for (int b = a + 1; b < n; b++) {
                    if ((((a * a) + (b * b) + m) % (a * b)) == 0) {
                        count++;
                    }
                }
            }
            answer[i] = count;
        }

        for(int i = 0; i < k; i++){
            System.out.println(answer[i]);
        }

    }
}
