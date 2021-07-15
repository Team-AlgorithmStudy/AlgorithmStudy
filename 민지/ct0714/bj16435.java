package com.company.ct0714;

import java.util.Arrays;
import java.util.Scanner;

public class bj16435 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int h = sc.nextInt();

        int[] tall = new int[n];
        for(int i = 0; i < n; i++ ){
            tall[i] = sc.nextInt();
        }
        Arrays.sort(tall);

        for(int i = 0; i < tall.length; i++){
            if(tall[i] <= h){
                h += 1;
            }else{
                break;
            }
        }
        System.out.println(h);
    }
}
