package com.company.ct0720;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bj9506 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0 ;

        while (true){

            n = sc.nextInt();
            if(n == -1){
                break;
            }
            int sum = 0;
            List<Integer> list = new LinkedList<>();

            for(int i = 1; i < n; i++){
                if((n % i) == 0 ){
                    list.add(i);
                    sum += i;
                }
            }
            if(sum == n){
                System.out.print(n + " = " );

                for(int j = 0; j < list.size(); j++){
                    System.out.print(list.get(j));
                    if(j != list.size()-1){
                        System.out.print(" + ");
                    }
                }

            }else {
                System.out.print(n + " is NOT perfect.");
            }

            System.out.println();
        }

    }
}
