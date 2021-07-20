package com.company.ct0720;

import java.util.Arrays;
import java.util.Scanner;

public class bj10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] tmp = s.split("");

        int[] al = new int[26];

        for(int i = 0; i < al.length; i++){
            al[i] = -1;
        }

        for(int i = 0; i < tmp.length; i++){
            char k = tmp[i].charAt(0);
            if(al[k - 'a'] == -1){
                al[k - 'a'] = i;
            }
        }

        for(int i = 0; i < al.length; i++){
            System.out.print(al[i] + " ");
        }
    }
}
