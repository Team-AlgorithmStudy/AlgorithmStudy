package com.company.ct0713;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class bj10775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gate = sc.nextInt();

        int plane = sc.nextInt();

        int[] line = new int[plane];
        for (int i = 0; i < plane; i++){
            line[i] = sc.nextInt();
           /* System.out.println(line[i]);*/
        }
        Arrays.sort(line);
        int count = 1;
        int[] parking = new int[gate-1];

        for(int i = 0; i < line.length;i++){

            for(int j = i+1; j < line.length;j++){
                if(line[i] == line[j]){
                    break;
                }else {
                    count++;
                    break;
                }
            }

        }

        System.out.println(count);
    }
}
