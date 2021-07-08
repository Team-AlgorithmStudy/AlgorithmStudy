package com.company.ct0709;

import java.awt.print.Pageable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bj12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i = 0; i < n; i++){
            queue.offer(sc.nextInt());
        }
        System.out.println(queue);

        int k = 1;
        // queue & stack이 안비어있는동안
        while (!queue.isEmpty() || !stack.isEmpty()){
            // queue 제일 위에 값이 k일때
            if(!queue.isEmpty() && queue.peek() == k){
                // queue 비우기
                queue.remove();
                // k 1증가
                k++;
            // k가 stack 제일 위에 값일 경우
            }else if(!stack.isEmpty() && k == stack.peek()){
                // stack에서 삭제
                stack.pop();
                // k 1증가
                k++;
            }else {
                // 위의 두경우가 아니면 스텍에 queue 값을 넣어준다
                stack.add(queue.poll());
            }
            // queue가 비어있으면
            if(queue.isEmpty()){
                // k와 stack 맨위의 값이 같으면
                if(k == stack.peek()){
                    // stack 에서 삭제
                    stack.pop();
                    // k 1증가
                    k++;
                }else {
                    // 멈추기
                    break;
                }
            }
        }
        if(stack.isEmpty() && queue.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}
