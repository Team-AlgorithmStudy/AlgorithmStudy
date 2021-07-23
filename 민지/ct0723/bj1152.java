package com.company.ct0723;

import java.util.Arrays;
import java.util.Scanner;

public class bj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();
        String[] word = input.split(" ");

        if(input.isEmpty()){
            System.out.println(0);
        }else {

            System.out.println(word.length);
        }

    }
}
