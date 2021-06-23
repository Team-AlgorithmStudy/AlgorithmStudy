package com.company;

import java.util.Scanner;

public class bj10870 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int fnum = 0;
        int snum =1;
        int sum =0;

        int n = sc.nextInt();

        // 입력된수 n 이 0이면
        if(n ==0){
            // 합계는 0
            sum = fnum;

        // 입력된 수가 1이면
        }else if(n == 1){
            // 합계는 1
            sum = snum;
        // 입력된 수가 2보다 크거나 같으면
        } else if(n>=2){
            // i는 1부터 입력된수 -1값까지 1씩 증가하면서 반복한다
            for(int i = 1; i <= n-1; i++){
                System.out.println("fnum = " + fnum);
                System.out.println("snum = " + snum);

                // 합계 = 첫번째수 + 두번쨰 수
                sum = fnum + snum;

                // 첫번째 수 = 두번쨰수
                fnum = snum;

                // 두번째 수 = 합계
                snum = sum;

                System.out.println("sum = " + sum);
                System.out.println();
            }
        }
        System.out.println(sum);
    }
}
