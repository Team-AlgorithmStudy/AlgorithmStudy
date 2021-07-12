package com.company.ct0712;

import java.util.Scanner;
import java.util.Stack;

public class bj3986 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i = 0; i < n; i++){
           String str = sc.next();

            for(int j = 0; j < str.length(); j++ ){

                if(stack.isEmpty()){
                    stack.push(str.charAt(j));

                }else if (stack.peek().equals(str.charAt(j))){
                    stack.pop();
                }else {
                    stack.push(str.charAt(j));
                }

            }
            if(stack.isEmpty()){
                count++;
            }
            System.out.println("stack = " + stack);
            // 스택을 비워준다 -> 다음줄 돌리기위해서
            stack.clear();

        } System.out.println(count);

    }
}
