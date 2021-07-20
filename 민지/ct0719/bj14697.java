package com.company.ct0719;

import java.util.Scanner;

public class bj14697 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] room = new int[3];
        for(int i = 0; i < 3; i++){
            room[i] = sc.nextInt();
           /* System.out.println(room[i]);*/
        }

        int student = sc.nextInt();

        boolean check = false;

        for(int i = 0; i <= 50; i++) {
            for(int j = 0; j <= 50; j++){
                for(int k =0; k <= 50; k++){
                    if(((i * room[0]) + (j * room[1]) + (k * room[2])) == student){
                        check = true;
                    }
                }
            }
        }

        if(check == true){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
