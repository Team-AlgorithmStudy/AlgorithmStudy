package com.company.ct0706;

import java.util.Scanner;
import java.util.Stack;

public class bj17608 {
    public static void main(String[] args) {

        // 틀림
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++ ){
            stack.add(sc.nextInt());
         /*   System.out.println("stack = " + stack);*/
        }

        int[] answer = new int[stack.size()];
        int count = 1;
        for(int i = 0; i < n; i++){
            answer[i] = stack.pop();
          /*  System.out.println("answer[i] = " + answer[i]);
*/
              if(answer[0] < answer[i] ){
                  count++;
              }
              if(answer[0] > answer[i] && answer[0] == answer[i]){
                  continue;

          }

        }/* System.out.println("count = " + count);*/
        System.out.print(count);
    }
}
