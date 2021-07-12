package com.company.ct0712;

import java.util.Scanner;
import java.util.Stack;

public class bj10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k; i++){

            int n = sc.nextInt();
            if(!stack.isEmpty() && n == 0){
                stack.pop();
                System.out.println("after pop stack = " + stack);
            }else {
                stack.push(n);
                System.out.println("stack = " + stack);
            }
        }

        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
