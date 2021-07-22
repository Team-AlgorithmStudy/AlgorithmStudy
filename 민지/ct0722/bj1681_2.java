package com.company.ct0722;

import java.util.Scanner;

public class bj1681_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        char l = sc.next().charAt(0);

        int count = 0;
        int start = 1;

        while(true) {

            String check = String.valueOf(start);

            boolean c = true;

            for (int j = 0; j < check.length(); j++) {

                if(check.charAt(j) == l){
                    c = false;
                    break;
                }
            }
            if(c){
                count++;
            }
            if(count == n){
                System.out.println(start);
                return ;
            }
            start++;
        }
    }


}

