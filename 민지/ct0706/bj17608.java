package com.company.ct0706;

import java.util.Scanner;
import java.util.Stack;

public class bj17608 {
    public static void main(String[] args) {

        // 틀림 -> 확인
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<n; i++){
            stack.push(sc.nextInt());
        }

        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++){

            int k = stack.pop();
            if(k > max){
                count++;
                max = k;
            }

        }/* System.out.println("count = " + count);*/
        System.out.print(count);
    }
}
