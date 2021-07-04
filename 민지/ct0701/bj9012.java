package com.company.ct0701;

import java.util.Scanner;
import java.util.Stack;

public class bj9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] a = new String[t+1];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextLine();
          /*  System.out.println(a[i]);*/
        }

        for(int i = 1; i < a.length; i++){

            String[] b  = a[i].split("");

            Stack stk = new Stack();

            // 조건
            boolean flag = true;

            for(int j = 0; j < b.length; j++){


                if(b[j].equals("(")){

                    stk.push("(");

                }else if(b[j].equals(")")) {
                    if(!stk.isEmpty()){

                        stk.pop();

                    }else {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
            }

            // flag ture 경우에만
            if(flag){
                if(stk.isEmpty()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }

        }

    }
}
