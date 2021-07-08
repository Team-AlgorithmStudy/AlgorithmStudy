package com.company.ct0708;

import java.util.*;

public class bj1158 {
    // 틀림 -> 확인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }
        /*System.out.println(queue);*/
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()){

            // 1부터 k전까지는 뒤로보낸다
            for(int i = 1; i < k; i++){
                queue.offer(queue.poll());
            }

            list.add(queue.poll());
        }
        System.out.println(list);
        /*System.out.println(list.toString().substring(1,list.toString().length()-1));*/
        System.out.printf("<%s>",list.toString().substring(1,list.toString().length()-1));
    }
}
