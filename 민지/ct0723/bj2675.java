package com.company.ct0723;


import java.util.Scanner;

public class bj2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();

        for(int i = 0; i < testNum; i++){
            int num = sc.nextInt();
            String[] s = sc.next().split("");

            for(int j = 0; j < s.length; j++){
                for(int k = 0; k < num; k++){
                    System.out.print(s[j]);
                }
            }System.out.println();
        }
    }
}

