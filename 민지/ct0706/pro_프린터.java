package com.company.ct0706;

import java.util.*;

public class pro_프린터 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int pri : priorities){
            queue.add(pri);
        }

        //우선순위를 비교하기 위해 오름 차순 정렬
        // 1,1,1,1,1,9
        Arrays.sort(priorities);

        //오름차순 한 마지막 요소가 가장 큰 수
        // len = 5
        int len = priorities.length-1;

        while (!queue.isEmpty()){
            // poll() : 큐에서 데이터를 꺼내온다 -> 큐가 비어있으면 null반환
            // current = 1 , 1 , 9 , 1 , 1 , 1 , 1
            int current = queue.poll();

            //우선순위가 가장 높은 수 == 현재 큐에 담긴 (프린트 순서)가 같으면
            // 1 == [5-0]9 -> X  else 로
            // 1 == [5-0]9 -> X  else 로
            // 9 == [5-0]9 -> if조건 성립
            // 1 == [5-1]1 -> if조건 성립
            // 1 == [5-2]1 -> if조건 성립
            // 1 == [5-3]1 -> if조건 성립
            // 1 == [5-4]1 -> if조건 성립
            if(current == priorities[len - answer]){
                // poll이 된 갯수 카운트
                // answer = 1
                // answer = 2
                // answer = 3
                // answer = 4
                // answer = 5
                answer++;
                // location = 3
                // location = 2
                // location = 1
                // location = 0
                // location = -1
                location--;
                if(location<0){
                    break;
                }
            }else {
                //처음에 que.poll을 했던 수를 add 함으로써 맨 뒤로 밀림
                // queue.add(1)
                // queue.add(1)
                queue.add(current);

                // location = -1
                // location = 4
                location--;
                if(location<0){
                    // location = 5
                    location = queue.size()-1;
                }
            }
        }

        System.out.println(answer);


       /* int tmp = priorities[location];*/

/*
        int[] num = new int[priorities.length];
    */
/*    System.out.println(tmp);*//*


        int count = 0;
        Arrays.sort(priorities);
        for(int i = priorities.length-1; i >=0; i--) {
            num[i] = priorities[i];
            System.out.println(num[i]);
        }
*/

/*
            queue.add(priorities[i]);

            System.out.println(queue);
            if(tmp == num[i] ){
                count++;
                System.out.println(num[count]+1);
            }
        }

        if (tmp == queue.peek()){
            System.out.println(queue.);
        }*/
    }


}



