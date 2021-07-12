package com.company.ct0712;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj16466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;
        int[] sort = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        // 배열에 넣기
        for (int i = 0; i < n; i++){
           sort[i] = sc.nextInt();
        }
        // 정렬
        Arrays.sort(sort);

        // 큐에넣기
        for (int i = 0; i < n; i++){
            queue.offer(sort[i]);
        }
        System.out.println("queue = " + queue);

        while (!queue.isEmpty()){

            // 맨 위에값이 k보다 크면 k출력
            if(queue.peek() > k){
                break;
            // 맨위에값이 k와 같으면 
            }else if(queue.peek() == k){
                // k 1증가
                k++;
                // queue 삭제
                queue.poll();
            }

        }System.out.println(k);
    }
}
