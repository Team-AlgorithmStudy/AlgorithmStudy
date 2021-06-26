package com.company.ct0628;

import java.util.Scanner;

public class bj5622 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        String dial =sc.nextLine();

        // 입력값 배열에 나누어 저장
        String[] di = dial.split("");

        // 걸린시간
        int time = 0;

        // 총시간
        int sum = 0;


        for(int i = 0; i<di.length; i++){

        /*    System.out.println("di = " + di[i]);*/

            if(di[i].equals("1")){

                time = 2;
                sum += time;

            }else if(di[i].equals("A") || di[i].equals("B") || di[i].equals("C")){

                time = 3;
                sum += time;
            }else if (di[i].equals("D")  || di[i].equals("E") || di[i].equals("F")){

                time = 4;
                sum += time;

            }else if(di[i].equals("G") ||di[i].equals("H") ||di[i].equals("I")){

                time = 5;
                sum += time;

            }else if(di[i].equals("J") ||di[i].equals("K") ||di[i].equals("L") ){

                time = 6;
                sum += time;

            }else if (di[i].equals("M") ||di[i].equals("N") ||di[i].equals("O")){

                time = 7;
                sum += time;

            }else if (di[i].equals("P") ||di[i].equals("Q") ||di[i].equals("R")|| di[i].equals("S")){

                time = 8;
                sum += time;

            }else if(di[i].equals("T") ||di[i].equals("U") ||di[i].equals("V")){

                time = 9;
                sum += time;

            }else if (di[i].equals("W") ||di[i].equals("X") ||di[i].equals("Y") ||di[i].equals("Z")){

                time = 10;
                sum += time;

            }else if (di[i].equals("0")){

                time = 11;
                sum += time;

            }

        }System.out.println(sum);

    }
}
