package com.company.ct0722;

import java.util.Arrays;
import java.util.Scanner;

public class  bj1681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String l = sc.next();

        int count = 0;
        int num = 0;
        while (count != n){
            num ++;
            String check = String.valueOf(num);

            if (!check.contains(String.valueOf(l))) {
                count++;
            }

            if (count == n) {
                System.out.println(num);
                return;
            }
        }

    }
}

