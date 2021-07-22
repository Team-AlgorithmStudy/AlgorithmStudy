package com.company.ct0721;

import java.util.Arrays;
import java.util.Scanner;

public class bj1681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int l = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= 99999999; i++) {
            String check = String.valueOf(i);

            if (!check.contains(String.valueOf(l))) {
                count++;
            }
            if (count == n) {
                System.out.println(i);
                return;
            }
        }
    }
}
