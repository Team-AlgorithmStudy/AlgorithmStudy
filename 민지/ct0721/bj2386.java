package com.company.ct0721;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class bj2386 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s ="";

        List<Integer> list = new LinkedList<>();
        List<String> answer = new LinkedList<>();

        while (true){
            s = sc.next();
            int count = 0;
            if(s.equals("#")){
                break;
            }

            String comparison = sc.nextLine();

            String[] arr = comparison.toLowerCase(Locale.ROOT).split("");

            for(int i = 0; i < arr.length; i++){
                if(arr[i].equals(s)){
                    count++;
               }
            }list.add(count);
            answer.add(s);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.printf("%s %d \n",answer.get(i),list.get(i));
        }


    }
}
