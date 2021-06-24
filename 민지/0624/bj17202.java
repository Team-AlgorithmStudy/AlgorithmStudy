package com.company.ct0624;

import java.util.Scanner;

public class bj17202 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String an = ""; // 출력할 값
        String em = "";

        for (int i = 0; i < 8; i++) { // a,b에 있는 문자를 하나씩 순서대로 가져온다
            an += a.charAt(i);
            an += b.charAt(i);
        }
        /*System.out.println(an);*/

        for (int i = an.length(); i > 2; i--) { // an의 길이만큼 반복 1씩 감소하면서 2보다 클 때까지 반복

            em = ""; // 초기화

            for (int j = 0; j < i - 1; j++) { // 0부터 an의 -1값 까지 1씩 증가하면서 반복

                em += ((an.charAt(j) - '0') + (an.charAt(j + 1) - '0')) % 10;
                // em 변수에 j 자리의 수와 j+1 자리의 수를 더한후 1의 자리로 만들어준 값을 대입

                /* System.out.println(em);*/

            }

            an = em; // an에 em 값을 대입입
        }
        System.out.println(an);
    }
}

