package com.company.ct0722;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bj2588 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String b = sc.next().trim();
        String[] k = b.split("");
        List<Integer> list = new LinkedList<>();

        for (int i = k.length - 1; i >= 0; i--) {

            int sum = 0;

            sum += n * Integer.parseInt(k[i]);

            list.add(sum);

            if (list.size() == k.length) {
                for (int j = 0; j < 1; j++) {
                    list.add(n * Integer.parseInt(b));
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
