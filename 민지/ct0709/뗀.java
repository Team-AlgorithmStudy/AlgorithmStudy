package com.company.ct0709;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


public class 뗀 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = sc.nextLine();
        String[] split = answer.split("");
        Stack<String> stack = new Stack<>();
        // 숫자 판단 -> 잘못된것
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        int a = 0;
        int b = 0;

        for(int i = split.length-1; i >= 0; i--){
            stack.push(split[i]);
           /* System.out.println("stack = "+stack);*/
            while (stack.size() >= 3 && isNumber(stack.peek())){
                /*System.out.println("stack = " + stack);*/
                if(isNumber(stack.peek())){
                    a = Integer.parseInt(stack.pop());
                    if(isNumber(stack.peek())){
                        b = Integer.parseInt(stack.pop());
                        if(stack.peek().equals("*")){
                            stack.pop();
                            stack.push(String.valueOf(a*b));
                            /*System.out.print(stack.pop());*/
                        } else if (stack.peek().equals("/")){
                            stack.pop();
                            stack.push(String.valueOf(a/b));
                    /*        System.out.println("a = " +a);
                            System.out.println("b = " + b);*/

                        } else if (stack.peek().equals("+")){
                            stack.pop();
                            stack.push(String.valueOf(a+b));

                        }else if (stack.peek().equals("-")){
                            stack.pop();
                            stack.push(String.valueOf(a-b));
                        }else {
                            break;
                        }
                    }else {
                        stack.push(String.valueOf(a));
                        break;
                    }
                }else{
                    break;
                }
            }
           } System.out.println(stack.peek());

    }
    // 숫자를 판단하는 함수!
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
