package com.company.ct0724;

import java.util.Locale;
import java.util.Scanner;

public class bj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().strip();
        char[] arr = word.toUpperCase(Locale.ROOT).toCharArray();

        int[] cha = new int[26];

        char answer = ' ';
        int num = 0;
        int max = 0;
        for(char i = 'A'; i <='Z'; i++){

            for (int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    cha[num]++;
                    if(cha[num] > max){
                        max = cha[num];
                        answer = i;
                    }else if(cha[num] == max){
                        answer = '?';
                    }
                }
            }num++;

        }
        System.out.println(answer);


    }
}
