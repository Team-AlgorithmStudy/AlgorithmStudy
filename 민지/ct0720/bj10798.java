package com.company.ct0720;

import java.util.Scanner;

public class bj10798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] word = new String[5];

        String answer = "";

        for(int i = 0; i < 5; i++){
            word[i] = sc.nextLine();
           /* System.out.println(word[i]);*/
        }

        int tall = 0;
        for(int i = 0; i < 5; i++){
            if(word[i].length() > tall){
                tall = word[i].length();
            }
        }
        String[][] tmp = new String[5][tall];

        for(int i = 0; i < 5; i++){
            String[] a = word[i].split("");
            for(int j = 0; j < a.length; j++){
                tmp[i][j] = a[j];
            }
        }

        // 배열을 6*5로 뒤집어서 가져오기
        for(int i = 0; i < tall; i++){
            for(int j =0; j < 5; j++){
                if(tmp[j][i] != null){
                    answer += tmp[j][i];
                }
            }
        }
        System.out.println(answer);
    }
}
