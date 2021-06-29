package com.company.ct0629;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class bj2869 {
    public static void main(String[] args) throws IOException{

  /*      Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        sc.close();*/

        // 시간초과 해결
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr = str.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);

        int num = v - b;
        int num2 = a - b;
        int tmp = num / num2;
        if(num % num2 !=0) tmp++;
        System.out.print(tmp);



/*        // 시간초과
        // (올라가야할 길이 - 내려오는 높이) / 하루에 올라갈 수 있는 높이
        int tmp = (v - b) / (a - b);

        if((v - b) % (a - b) !=0){
            tmp++;
        }
        System.out.println(tmp);*/


/*       시간초과 ㅠ

        // 마지막 날 올라간상태
        int last = v - a;

        int tmp = last / (a-b);

        if(last % (a-b) !=0){
            tmp++;
        }
        // 마지막날 올라간 상태를 빼줬기 때문에 한번더 ++
        tmp++;

        System.out.println(tmp);*/

/*

        int tmp = a-b; // 4
        int count = 1;

        while (tmp < v){

            tmp += a; // 9
            tmp -= b; //
            count++;

        }
        System.out.println(count);

*/


    }
}
