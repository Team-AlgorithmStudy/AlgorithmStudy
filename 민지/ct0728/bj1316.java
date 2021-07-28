package com.company.ct0728;

import java.util.Scanner;

public class bj1316 {
    public static void main(String[] args) {
        // 다시 풀기
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] word = new String[num];
        for(int i = 0; i < num; i++){
            word[i] = sc.next().trim();
        }
        int count = 0;
        for (int i = 0; i < word.length; i++){
           String[] tmp = word[i].split("");
           for(int j = 0; j < tmp.length; j++){
               if(j == tmp.length-1){
                   break;
               }else if(tmp[j].equals(tmp[j+1])){
                   count++;
               }else {
                   break;
               }
           }
        }
        System.out.println(count);
    }
}
