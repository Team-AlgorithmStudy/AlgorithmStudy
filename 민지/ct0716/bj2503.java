package com.company.ct0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        int[] strike = new int[n];
        int[] ball = new int[n];

        for (int i = 0; i < n; i++){
            String st[] = br.readLine().split(" ");
            // 예선참가자
            num[i] = Integer.parseInt(st[0]);
            // 장르
            strike[i] = Integer.parseInt(st[1]);
            // 본선진출
            ball[i] = Integer.parseInt(st[2]);

            System.out.println("num = " + num[i]);
            System.out.println("strike = " + strike[i]);
            System.out.println("ball = " + ball[i]);
        }
    }
}
