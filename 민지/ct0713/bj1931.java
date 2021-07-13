package com.company.ct0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj1931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
  /*      String str1[] = br.readLine().split(" ");

        int s = Integer.parseInt(str1[0]);
        int e = Integer.parseInt(str1[1]);*/

        int[][] time = new int[n][2];

        StringTokenizer st;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            // 시작시간
            time[i][0] = Integer.parseInt(st.nextToken());
            // 종료시간
            time[i][1] = Integer.parseInt(st.nextToken());
            System.out.println("start = " + time[i][0] );
            System.out.println("end = " + time[i][1]);
        }

        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {

            @Override
            // compare => 1차원 빼기!
            public int compare(int[] o1, int[] o2) {

                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

       /* // compare 사용한 내림차순  정렬
            int k = 3;
            Integer[] arr = new Integer[k];
            for(int i = 0; i < k; i++){
                arr[i] = i;
            }
            Arrays.sort(arr,new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }

            });
        for(int i = 0; i < k; i++){
            System.out.println(arr[i]);
        }
*/

            int count = 0;
            int prev_end_time = 0;

		for(int i = 0; i < n; i++) {

                // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
                if(prev_end_time <= time[i][0]) {
                    prev_end_time = time[i][1];
                    count++;
                }
            }
        System.out.println(count);
		
		// 시간초과
/*         int start[] = new int[n];
        int end[] = new int[n];

        for (int i = 0; i < n; i++) {

            String str2[] = br.readLine().split(" ");
            start[i] = Integer.parseInt(str2[0]);
            end[i] = Integer.parseInt(str2[1]);

            System.out.println("start = " + start[i]);
            System.out.println("end = " + end[i]);

        }

       int count = 1;
        for(int i = 0; i < n; i++){

            for(int j = 1; j < start.length; j++){

                if(end[i] < start[j] || end[i] == start[j]){
                    count++;
                    i = j-1;
                    break;
                }
            }
            if(start[i] == start.length -1 ){
                break;
            }
        }
        System.out.println(count);*/
    }
}
