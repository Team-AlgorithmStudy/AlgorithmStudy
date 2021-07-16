package com.company.ct0716;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class bj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        List<String> list = new LinkedList<>();

        int start = 0;

        // 입력값까지 push한 이력이 없을경우 stack에 입력받은 값 까지 push 한 후 마지막 원소를 pop
        for(int i = 0; i <n; i++ ){
            
            int v = sc.nextInt();

            // 입력값이 0보다 크면
            if(v > start){
                // 1 부터 입력받은 값까지 
                for( int k = start + 1; k <= v; k++){
                    // push
                    stack.push(k);
                    // push 했을경우 + 리스트에 삽입
                    list.add("+");

                }
                // 다음 push 할때의 오름차순을 유지 하기위해 변수 초기화
                start = v ;

            // stack의 top과 입력받은 값이 같지 않으면
            } else if(stack.peek() != v){
                // NO출력
                System.out.println("NO");
                return;
            }
            // pop
            stack.pop();
            // pop 했을경우 - 리스트에 삽입
            list.add("-");
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
