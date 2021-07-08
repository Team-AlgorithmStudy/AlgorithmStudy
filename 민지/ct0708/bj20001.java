package com.company.ct0708;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class bj20001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String start = "고무오리 디버깅 시작";
        String end = "고무오리 디버깅 끝";

        Stack<String> stack = new Stack<>();

        String x = sc.nextLine();
        int pro = 0;
        if(x.equals(start)){

            while (true){
                x = sc.nextLine();
                stack.add(x);
              if(x.equals(end)){
                    break;
                }else{
                  if(x.equals("문제")){
                      stack.add(x);
                      pro++;
                  }else if(x.equals("고무오리"))
                    if(stack.peek().equals("문제")){
                        pro--;
                    }else {
                        pro +=2;
                    }
                      
                }
            }
        }
        if(pro == 0){
            System.out.println("고무오리야 사랑해");
        }else {
            System.out.println("힝구");
        }


    }
}
