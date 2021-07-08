package com.company.ct0707;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }
      /*  System.out.println(queue);*/

        while (queue.size() != 1){

            queue.poll();
            queue.offer(queue.poll());

        } System.out.println(queue.peek());

    }
}
