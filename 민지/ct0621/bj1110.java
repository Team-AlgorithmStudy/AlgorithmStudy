package com.company.ct0621;

import java.util.Scanner;

public class bj1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력 숫자
        int putNum = sc.nextInt();

        // 문제 테스트 변수
        int newNum = putNum;
       /* System.out.println(newNum);*/
        // 테스트 횟수
        int count = 0;

        do{
            count++;

            // 1의자리
            int fnum = newNum /10;
            /*System.out.println(fnum);*/
            // 10의자리
            int lnum =  newNum %=10;

            // 각 자리의 숫자를 더한다
            newNum = fnum + lnum;

            // 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.
            newNum = lnum * 10 + newNum%10;

        } while (putNum != newNum);

            // N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램
            System.out.println(count);
    }
}
