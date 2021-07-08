package com.company.ct0708;

import java.util.*;

public class pro_짝지어제거하기 {
    public static void main(String[] args) {

        String s = "cdcd";

        int answer = 0;

        String[] s2 = s.split("");
        ArrayList<String> s3 = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();

    /*    Stack<String> stack = new Stack<>();*/
      /*  List<String> list = new LinkedList<>();*/


        for(int i = 0; i < s2.length; i++){
            /*s3.add(s2[i]);*/
           /* System.out.println(s3);*/
           /* stack.add(s2[i]);*/
            queue.offer(s2[i]);
        }
        System.out.println(queue);


/*
        for(int i = 0; i < s.length(); i++){
            if(!queue.isEmpty() && queue.peek().equals(s2[i]) ){
                queue.poll();
            }else {
                queue.add(s2[i]);
            }
            if(queue.isEmpty()){
                answer = 1;
            }
        }
        System.out.println(answer);
*/

        char current;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            current = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == current) stack.pop();
            else stack.push(current);
        }
        System.out.println(stack.isEmpty() ? 1 : 0);

   /*     for(int i = 0; i < s2.length; i++) {
           *//* queue.offer(s2[i]);*//*
            list.add(s2[i]);
        }*/
       /*System.out.println(queue);*/
        /*System.out.println(list);*/

        /*System.out.println(queue.peek());*/

/*        System.out.println(queue.remove("a"));
        System.out.println(queue);
        System.out.println(queue.remove("a"));
        System.out.println(queue);*/
       /* for (int i = 0; i < list.size(); i++){

            if(list.indexOf(i)== list.indexOf(i+1)){
                list.remove(i);
                list.remove(i+1);
            }
            if(list.size() == 0){
                answer = 1;
            }
        }
        System.out.println(answer);*/

/*        while (s3.isEmpty()){
            if(s3.get(0).equals(s3.get(1))){
                s3.remove(0);
                s3.remove(1);
            }
        }*/



/*        System.out.println(answer);*/


    }
}
