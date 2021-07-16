package com.company.ct0716;

import java.util.*;

public class bj2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] h = new int[9];
        for(int i = 0; i < 9; i++){
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        // 9명 전부 더하고 -> 2명을 선택해서 뺀상태에서 100으로
        // 이중 for -> 0번째,1번째,,,
        // 뺀 값 체크 -> 뺀 값 빼고 출력
        int sum = 0;
        for(int i = 0; i < 9; i++){

            if(sum >= 100){
                break;
            }else {
                sum += h[i];
                System.out.println(h[i]);
            }
        }
     /*   List<Integer> list = new LinkedList<>();
        int sum = 0;
        for(int i = 0; i < 9; i++){

            for(int j = 0; j < 9; j++){
                sum = 0;
                if(sum == 100){
                    for(int k = 0; k < 9; k++){
                        list.add(h[j]);
                        break;
                    }

                }else {
                    sum += h[j];
                    System.out.println(h[j]);
                    System.out.println("sum = " + sum);
                }
            }

        }
        Collections.sort(list);
        System.out.println("list = " + list);*/
    }
}
