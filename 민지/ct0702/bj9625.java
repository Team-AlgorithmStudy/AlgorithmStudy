package com.company.ct0702;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj9625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String [] ab = {"A","B"};

        List<String> list = new ArrayList<>();

        int a = 0;
        int b = 0;
        for(int i = 0; i < k; i++){

            list.add("B");
            if(i % 2 == 0){
                list.add("BA");
            }
            System.out.println("list = " + list);
        }
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).equals("A") ){
                a++;
            }else if (list.get(i).equals("B")){
                b++;
            }
        }
        System.out.printf("%d %d",a,b);
    }
}
