package com.company.ct0705;


import java.util.LinkedList;
import java.util.Queue;

public class pro_기능개발 {
    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] sum = new int[progresses.length];
        int[] count = new int[progresses.length];

        Queue<Integer> queue = new LinkedList<>();


        for (int i = 0; i < progresses.length; i++){

            while (progresses[i] < 100){
                 progresses[i] += speeds[i];
                 count[i]++;
                if(progresses[i] >100){
                    break;
                }
            }
        }

        for(int i = 0; i < count.length; i++){
            queue.offer(count[i]);
            System.out.println(queue);

        }
    }
}
