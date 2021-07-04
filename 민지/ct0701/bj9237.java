package com.company.ct0701;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bj9237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];

        int num = 0;

        for(int i = 0; i < n; i++){
            t[i] = sc.nextInt();
           /* System.out.println(t[i]);*/
        }

        Arrays.sort(t);

        int max = 0;
        // 역순정렬
        for(int i = t.length-1; i >= 0; i--){
            // ** (t.length -1 - i) => 지난 시간
            // t[i] => 나무가 자라는 시간
            // +2 => 심는날짜 1, 다 자란다음날 1
            num = t[i] + 2 + (t.length -1 - i);
            // 제일 오래걸리는 나무
            if(num > max){
                max = num;
            }

        }System.out.println(max);
    }
}
