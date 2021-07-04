package com.company.ct0705;

import java.util.Scanner;

public class bj11726 {
    static long[] tile;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
      /*  // Top-Down 방식-> 재귀호출 이용
        // 큰문제를 작은문제로 나누고 작은 문제를 이요해 큰 문제를 푸는방식
        // n 문제를 푸는것이 목표 -> func(n)을 호출
        // func(n)안에서는 재귀호출을 하고, 만약 n=바닥(ex:1)인 경우에는 특정 값을 return 한다
        // func(n)을 호출해 func(바닥)까지 가서 값을 알아내기 때문에 Top-Down이다.

        int n = sc.nextInt();
        tile = new long[n+1];

        tile[1] = 1;
        if(n > 1) tile[2] = 2;
        System.out.println(goTo(n));
    }

    private static long goTo(int n) {

        if (n==1) return 1;
        if (n==2) return 2;

        long a = tile[n-1] > 0 ? tile[n-1] : goTo(n-1);
        long b = tile[n-2] > 0 ? tile[n-2] : goTo(n-2) ;
        tile[n] = (a+b) % 1007;

        return tile[n];
    }*/

        // Bottom-up 방식 -> 미리 저장해 둔 값을 이용해 이후 문제를 푼다
        // 작은 문제부터 큰 문제까지 차례대로 푸는 방식. 주로 for문을 사용해 푼다.
        // 바닥 부터 시작해 n의 값을 알아내기 때문에 Bottom-Up이다.

        int n = sc.nextInt();
        tile = new long[n+1];

        tile[1] = 1;

        if (n > 1) {
            tile[2] = 2;
        }

        for(int i = 3; i <= n; i++) {

          tile[i] = (tile[i-2] + tile[i-1]) % 10007;
          
        }
        System.out.println(tile[n]);

    }
}
