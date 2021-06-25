package com.company.ct0621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class programmers_두개뽑아서더하기 {
    public static void main(String[] args) {
        int numbers[] = {}; // 주어진 정수배열

        // Integer형의 리스트형태의 배열 생성
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int result = numbers[i] + numbers[j];

                // contains()는 리스트 안에 어떤 객체가 있는지 확인하는데 사용하는 메소드
                // al에 result값이 있다면
                if (al.contains(result)) {
                    // 계속하고
                    continue;
                }
                // 아니면 al에 i +j 값을 더한다
                al.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[al.size()];
        int size = 0;
        for (int temp : al) {
            answer[size++] = temp;
        }
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }

    }
}
