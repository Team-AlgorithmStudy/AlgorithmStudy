package com.company.ct0624;

import java.util.Arrays;

public class pro_예산 {

    public static void main(String[] args) {

        int[] d = {2,2,3,3}; // 각 부서 필요ㅛ산 입력
        int budget = 10; // 예산
        int result = 0;

        int count = 0;
        Arrays.sort(d); // 예산 오름차순 정렬
 /*      for (int i= 0; i<d.length; i++){
           System.out.println(d[i]);
       }*/

       for(int i=0; i<d.length; i++){
           result += d[i]; // result 에 예산을 순서대로 더한값을 대입

           System.out.println("result = " + result);
           System.out.println("budget = " + budget);

           if(budget-result < 0 ){ // 만약에 budget - result 값이 0보다 작으면 브레이크
               break;
           }
           count++; // 횟수 카운트
       }
        System.out.println(count);
    }
}
