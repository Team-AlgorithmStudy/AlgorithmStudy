package com.company.ct0723;

import java.util.Scanner;

public class bj2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String tmp = "";
        String tmp2 = "";
        for(int i = A.length()-1; i >= 0; i --){
             tmp += A.charAt(i);
             tmp2 += B.charAt(i);
        }
        int answer = 0;
        if(Integer.parseInt(tmp) > Integer.parseInt(tmp2)){
            answer = Integer.parseInt(tmp);
        }else {
            answer  = Integer.parseInt(tmp2);
        }

        System.out.println(answer);
    }
}
