package com.company.ct0721;

import java.awt.print.Pageable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bj4641 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;


        List<Integer> answer = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        while (true){

            n = sc.nextInt();
            int count = 0;
            if(n == -1){
                break;
            }
            if(n != 0){
                list.add(n);
            }else if(n == 0){
                for(int i = 0; i < list.size()-1; i++){
                    for(int j = i+1; j < list.size(); j++){
                        if(list.get(i) > list.get(j)){
                            if(list.get(i) == list.get(j) * 2 ){
                                count++;
                            }
                        }else {
                            if(list.get(i) * 2 == list.get(j)  ){
                                count++;
                            }
                        }

                    }
                }answer.add(count);
                list.clear();
            }


        }
        for(int i = 0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }

    }
}
