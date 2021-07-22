package com.company.ct0722;


import java.util.Scanner;

public class  bj1681 {
    public static void main(String[] args) {
        // static => 메모리 절약하기 위해 사용
        Scanner sc = new Scanner(System.in);

        int totalStudentCount = sc.nextInt();

        String exceptionNumber = sc.next();

        System.out.println(biggiestLabel(totalStudentCount,exceptionNumber));

    }

    private static int biggiestLabel(int totalStudentCount,String exceptionNumber){
        int count = 0;
        int num = 0;

        while (count != totalStudentCount){
            num ++;
            String check = String.valueOf(num);

            if (!check.contains(String.valueOf(exceptionNumber))) {
                count++;
            }

        }
        return num;
    }
}

