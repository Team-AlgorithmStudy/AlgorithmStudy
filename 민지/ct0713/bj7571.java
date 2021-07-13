package com.company.ct0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj7571 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1[] = br.readLine().split(" ");

        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);

        int dotX[] = new int[n];
        int dotY[] = new int[m];

        for (int i = 0; i < m; i++) {
            String str2[] = br.readLine().split(" ");
            int x = Integer.parseInt(str2[0]);
            int y = Integer.parseInt(str2[1]);
            dotX[i] = x;
            dotY[i] = y;
  /*          System.out.println("X = " + dotX[i]);
            System.out.println("Y = " + dotY[i]);*/

        }
        int xSum = 0;
        int ySum = 0;

        for(int i = 0; i <m ; i++){
            xSum += dotX[i];
            ySum += dotY[i];
        }

        int center = xSum/2 + ySum/2;
        System.out.println(center);

    }
}
