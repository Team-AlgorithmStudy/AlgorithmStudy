package com.company.ct0705;

import java.util.Stack;

public class pro_주식가격 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        // prices 길이만큼 배열생성
        int[] answer = new int[prices.length];

/*        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){

                // i가 j보다 작거나 같으면
                if(prices[i] <= prices[j]){
                    answer[i]++;
                }
                // i가 j보다 크다면(가격이 떨어지면)
                if(prices[i] > prices[j]){
                    answer[i]++;
                    break;
                }

            }System.out.print(answer[i]);
        }*/

        Stack<Integer> beginIdxs = new Stack<>();

        int[] terms = new int[prices.length];
        int i = 0;

        // 스택에 0 넣기
        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            // 스택이 엠티가 아니고 배열의 i가 배열의 스택 peek(스택의 가장위에있는 값 반환)보다 작을 때
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                // beginIdx변수에 스택 pop(스택의 가장위에있는 값 제거)을 대입
                int beginIdx = beginIdxs.pop();
                // 배열에 i - beginIdx(제거된 스택의 가장위에있는 값) 값을 대입
                terms[beginIdx] = i - beginIdx;
            }
            // i 스택에 푸쉬
            beginIdxs.push(i);
        }
        // 스택이 비어있지 않는동안
        while (!beginIdxs.empty()) {
            // beginIdx변수에 스택 pop(스택의 가장위에있는 값 제거)을 대입
            int beginIdx = beginIdxs.pop();
            // 배열에  i - beginIdx(제거된 스택의 가장위에있는 값) - 1 값을 대입
            terms[beginIdx] = i - beginIdx - 1;
        }

        for(int j = 0; j < terms.length; j++){
            System.out.print(terms[j]);
        }

    }
}
