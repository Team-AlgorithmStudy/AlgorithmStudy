package com.company.ct0720;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
      int count = 0;
      int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        /*    int[][] ex1 = new int[5][5];
        for(int i = 0; i <num.length; i++){
            for (int j = 0; j < i+1 ; j++){
                if(count != num.length){
                    ex1[i][j] = num[count];
                    count ++;
                    System.out.print(ex1[i][j] + " ");
                }
            }
            System.out.println();
        }*/

        // 1
        // 3 2
        // 6 5 4
        // 10 9 8 7
        // 15 14 13 12 11
/*        int[][] ex2 = new int[5][5];
        for(int i = 0; i < num.length; i++){
            for(int j = i; j >=0 ; j--){
                if(count != num.length){
                    ex2[i][j] = num[count];
                    count++;

                }
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(ex2[i][j] !=0){
                    System.out.print(ex2[i][j] + " ");
                }
            }System.out.println();

        }*/

        //              1
        //            2 3
        //          4 5 6
        //       7 8 9 10
        // 11 12 13 14 15

/*
        int[][] ex3 = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j =0; j<4-i; j++){
                ex3[i][j] = 0;
            }
            for(int k = 4-i; k<=4; k++){
                if(k > 5){
                    break;
                }else{
                    if(count != num.length){
                        ex3[i][k] = num[count];
                        count++;
                    }
                }
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(ex3[i][j] !=0){
                    System.out.printf("%3d",ex3[i][j]);
                }else if(ex3[i][j] == 0) {
                    System.out.print("   ");
                }
            }System.out.println();
        }*/

        //              1
        //            3 2
        //          6 5 4
        //       10 9 8 7
        // 15 14 13 12 11

        int[][] ex4 = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j<4-i; j++){
                ex4[i][j] = 0;
            }
            for(int k = 4; k>=4-i; k-- ){
                if(count != num.length){
                    ex4[i][k] = num[count];
                    count++;
                }
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(ex4[i][j] !=0){
                    System.out.printf("%3d",ex4[i][j]);
                }else if(ex4[i][j] == 0) {
                    System.out.print("   ");
                }
            }System.out.println();
        }

    }

}
