package com.company.ct0706;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2161 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] answer = new int[n];

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            queue.offer(i);

        }
        /*System.out.println(queue);*/

        for(int i = 0; i < answer.length; i++){
            if(queue.isEmpty()){
                break;
            }else{
                answer[i] = queue.poll();
                queue.offer(queue.poll());
                System.out.printf("%d ",answer[i]);

            }
        }
    }
}
