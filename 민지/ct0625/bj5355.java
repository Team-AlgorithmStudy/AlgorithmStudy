package com.company.ct0625;

import java.util.Scanner;

public class bj5355 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* int t = sc.nextInt(); // 테스트 케이스 갯수*/

        String t = sc.nextLine(); // 문자열로 입력받는다
        int tt = Integer.parseInt(t); // 입력받은 문자열을 int형태로 변환

        String[] h = new String[tt]; // 입력받은 숫자 만큼 배열생성

        double num = 0; // double타입 변수 선언
        for(int i = 0; i < tt; i++){ // 반복문 : i는 0부터 입력받은 숫자 만큼 1씩 증가하면서 반복

            h[i] = sc.nextLine(); // 입력받은 문자열을 배열에 저장
           String[] ac = h[i].split(" "); // 문자열배열 생성 해서 입력받은 문자열을 공백을 기준으로 나누어 저장한다
     /*       System.out.println(h[i]);
            System.out.println("ac0 =" + ac[0]);
            System.out.println("ac1 =" + ac[1]);
            System.out.println("ac2 =" + ac[2]);*/

            num = Double.parseDouble(ac[0]); // double타입 변수 num에 ac배열의 0번 인텍스에 있는 문자열 값을 double타입으로 변환하여 저장한다
           /* System.out.println("num = " + num);*/
            for(int j = 1; j <ac.length; j++){ // 반복문 : j는 1부터 ac 배열의 길이만큼 1씩증가하면서 반복

                if(ac[j].equals("@")){ // ac배열의 인덱스 값이 @ 이면 num 값에 *3
                    num *=3;
                }else if(ac[j].equals("%")){ // ac배열의 인덱스 값이 % 이면 num 값에 +5
                    num +=5;
                }else if(ac[j].equals("#")){ // ac배열의 인덱스 값이 # 이면 num 값에 -7
                    num -=7;
                }
            }
            System.out.printf("%.2f",num); // 소수자리 2까지 값을 출력한다
            System.out.println();
        }

    }
}
