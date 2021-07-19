package com.company.ct0719;

import java.awt.print.Pageable;
import java.util.Scanner;

public class bj2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        int sum = 0;
        int max = 0;
        int tmp = 0;
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
          /*  System.out.println(score[i]);*/
        }


        for(int j = 0; j < score.length; j++){
            sum += score[j];
            if(sum >= 100){
                tmp = sum;
                sum = 0;
                if(tmp > max){
                    max = tmp;

                    if(tmp - 100 < max - 100){
                        max = tmp;
                        break;
                    }
                }
                break;
            }

        }
            System.out.println(max);

    }
}
