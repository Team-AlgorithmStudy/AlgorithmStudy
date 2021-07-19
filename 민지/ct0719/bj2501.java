package com.company.ct0719;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bj2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new LinkedList<>();

        for(int i = 1; i <= p; i++){
            if(p % i == 0){
                list.add(i);
            }

        }
        if(list.size() < k){
            System.out.println(0);
        }else if(list.size() >= k){
            System.out.println(list.get(k-1));
        }

    }
}
