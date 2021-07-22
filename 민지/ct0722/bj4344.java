package com.company.ct0722;

import java.util.Scanner;

public class bj4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int i = 0 ; i < c ; i++) {

            int n = sc.nextInt();	//학생 수

            int[] arr = new int[n];

            double sum = 0;	// 성적 누적 합 변수

            // 성적 입력부분
            for(int j = 0 ; j < n ; j++) {
                int grade = sc.nextInt();	// 성적 입력

                arr[j] = grade;
                sum += grade;	// 성적 누적 합

            }

            double mean = (sum / n) ;
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for(int j = 0 ; j < n ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/n)*100);


        }

    }
}
