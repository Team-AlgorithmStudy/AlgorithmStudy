package com.company.ct0702;

import java.util.Scanner;

public class bj2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sug = sc.nextInt();

        int count = 0;

        // 5로 나눈 몫
        int five = sug / 5;

        // 5로 나눈 나머지 값
        int num = sug % 5;
        
        int three = 0;

        // 5로 나눈 몫이 0보다 크거나 같을 떄
        while (five >= 0){
            // 5로 나눈 나머지 값을 3으로 나눴을 때 나머지가 0 이면
            if(num % 3 == 0 ){

                // 나머지값을 3으로 나눠서 몫을 대입 -> 3으로 나눈 값
                three = num /3;

                // 5로 나눈 나머지 값을 3으로 나눈 나머지 값을 대입
                num %= 3;
                break;

            // 5로 나눈 나머지 값을 3으로 나눴을 때 나머지가 0이 아닐때
            }else {

                // five 에서 1 감소
                five--;
                // 나머지 값에 5를 더한다
                num +=5;
            }

        }
        if(num == 0){
            System.out.println(five + three);
        }else {
            System.out.println(-1);
        }
    }
}
