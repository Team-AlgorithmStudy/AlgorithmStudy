package com.company.ct0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj1157 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] word = str.toUpperCase(Locale.ROOT).split("");

        int[] check = new int[word.length];

        for(int i = 0; i <  word.length; i++){

            for(int j = i+1; j < word.length; j++){
                if(word[i].equals(word[j])){
                    check[i]++;
                }
            }
        }

    }
}
