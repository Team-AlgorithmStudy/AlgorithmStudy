package com.company.ct0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj3273 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
/*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();*/
        int[] num = new int[n];
        String[] a = br.readLine().split(" ");
        int count = 0;
        for(int i = 0; i < n; i++){

            num[i] = Integer.parseInt(a[i]);
            /*num[i] =  sc.nextInt();*/
           /* System.out.println(num[i]);*/
        }
        Arrays.sort(num);

       /* int x = sc.nextInt();*/
        int x =Integer.parseInt(br.readLine());
        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] + num[j] == x){
                    count++;
                    break;
                    // x 보다 큰값이 나오면 브레이크
                }else if(num[i] + num[j] > x){
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
