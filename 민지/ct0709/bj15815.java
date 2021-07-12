package com.company.ct0709;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bj15815 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = sc.nextLine();

        String[] split = answer.split("");
        Stack<Integer> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
       /* System.out.println(num);*/
        for(int i = 0; i < split.length; i++){

            if(Arrays.asList(num).contains(split[i])){
                stack.push(Integer.parseInt(split[i]));
            }else {
                queue.offer(split[i]);
            }
        }

        int num1 = 0;
        int num2 = 0;
            while (!stack.isEmpty()){
                if(stack.isEmpty() && queue.isEmpty()){
                    break;
                }
                if(!stack.isEmpty()){
                    num1 = stack.pop();

                }
                if(!stack.isEmpty() &&!queue.isEmpty() && queue.peek().equals("*")){
                    num2 = stack.pop();
                    queue.poll();
                    stack.push(num2 * num1);

                }
                else if(!stack.isEmpty() &&!queue.isEmpty() && queue.peek().equals("/")){
                    num2 = stack.pop();
                    queue.poll();
                    stack.push(num2 / num1);
                }
                else if(!stack.isEmpty() &&!queue.isEmpty() && queue.peek().equals("+")){
                    num2 = stack.pop();
                    queue.poll();
                    stack.push(num2 + num1);
                }
                else if(!stack.isEmpty() &&!queue.isEmpty() && queue.peek().equals("-")){
                    num2 = stack.pop();
                    queue.poll();
                    stack.push(num2 - num1);
                }

            }
        System.out.println(num1);

/*

        int total = stackNumber.pop();

        while (!stackNumber.isEmpty()) {
            int num = stackNumber.pop();
            String t = stack.poll();
            if (t.equals("+")) {
                total =num + total;
            }
            if (t.equals("-")) {
                total =num - total;
            }
            if (t.equals("*")) {
                total =num * total;
            }
            if (t.equals("/")) {
                total =num / total;
            }

        }

        System.out.println(total);
    }
}
*/

    }
}
