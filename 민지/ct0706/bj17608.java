package com.company.ct0706;

import java.util.Scanner;
import java.util.Stack;

public class bj17608 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++ ){
            stack.add(sc.nextInt());
            System.out.println("stack = " + stack);
        }
/*        while (!stack.isEmpty()){
            int k = stack.pop();

        }*/
        int[] answer = new int[stack.size()];
        int count = 1;
        for(int i = 0; i < stack.size(); i++){
            while (!stack.isEmpty()){
                answer[i] = stack.pop();
                System.out.println("answer[i] = " + answer[i]);
            }
            System.out.println("answer[0] = " + answer[0]);
            if(answer[0] > answer[i] ){
                count++;
            }
            if(answer[0] < answer[i] && answer[0] == answer[i]){
                continue;
            }

        } System.out.println("count = " + count);
    }
}
