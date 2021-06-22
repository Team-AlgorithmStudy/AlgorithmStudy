package test0620;

import java.util.*;

/**
 * 프로그래머스 두 개 뽑아서 더하기 문제
 *
 */
public class Main1110 {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 4, 1};

        int[] answer = solution(array);


    }

    /**
     * numbers => 입력받은 정수 배열
     * set => 합을 구하는 경우에서 중복 방지용으로 선언
     *
     * set.stream().sorted().mapToInt(Integer::intValue).toArray();
     * HashSet을 스트림으로 변환 후 정렬, 가지고있는 Integer값을 intValue로 변환후 배열로 변환
     * @param numbers
     * @return
     */
    public static int[] solution(int[] numbers) {

        HashSet<Integer> set = new HashSet<>();
        int[] answer = {};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
