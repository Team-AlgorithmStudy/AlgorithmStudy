package test0622;

import java.util.*;

public class MainProgrammers0622 {
    /**
     * 실패율 구하기
     * 스테이지 개수 N => 1~500 자연수
     * 스테이지 길이 => 1~200,000
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //스테이지 개수 : for문의 횟수?
        int N = scanner.nextInt();

//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages = {4,4,4,4,4};

        int[] result = solution(N, stages);

        //
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        int[] value = new int[N];

        Map<Integer, Float> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int count=0;
            int countPass = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    count++;
                }
                if (stages[j] == i) {
                    countPass++;
                }

            }
            map.put(i, (float)countPass / count);
        }
        for (int i = 0; i < map.size(); i++) {
            float max = map.get(i+1);
            for (int j = 0; j < map.size(); j++) {
                if (max < map.get(j+1)) {
                    max = map.get(j+1);
                }
            }

            for (Integer key : map.keySet()) {
                if (map.get(key).equals(max)) {
                    System.out.println("max = " + key);
                    value[i] = key;
                    map.put(key, -1.0f);
                    break;
                }
            }

//            total[i] = max;
        }
        answer = value;


        return answer;
    }
}
