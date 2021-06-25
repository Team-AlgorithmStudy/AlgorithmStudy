package com.company.ct0625;

public class pro_체육복 {

    public static void main(String[] args) {

        int n = 5; // 전체 학생의수
        int[] lost = {1,2}; // 도난당한 학생
        int[] reserve = {2,3}; // 여벌의 체육복

        int answer = 0; // 수업을 들을수 있는 학생의 수

        answer = n; // answer 에 전체 학생수 대입

        // 도난당한 학생의 수(배열의길이)만큼 반복
        for(int i = 0; i < lost.length; i++){

            // 체육복 여분 여부 false로 설정
            boolean yn= false;
            int j = 0;

            // yn이 false일 경우
            while (!yn){
                System.out.println("처음조건 " + yn);
                // 여벌의 체육복을 가진 학생의 수만큼 while문이 돌면 break
                if(j == reserve.length){
                    break;
                }
                if(i+1< lost.length){
                    if(lost[i+1]==reserve[j]){
                        j++;
                        continue;
                    }
                }
                // 도난당한 학생의번호와 여벌의 체육복이 있는 학생의 번호가 같으면
                if(lost[i] == reserve[j]){
                    // 여벌의체육복이 있는 학생의 번호의 자리에 -1을 대입하고
                    reserve[j] = -1;
                    // 체육복 여분 여부를 true(여분있음)로 변경한다
                    yn = true;
        /*            System.out.println("도난,여벌 학생 reserve[j] =  " + reserve[j]);
                    System.out.println("i = " + lost[i]);
                    System.out.println("j = " + reserve[j]);*/

                    // 도난당한 학생의 번호 - 여분의 체육복이 있는 학생의 번호의 값이 1인경우
                }else if (lost[i] - reserve[j] == 1){
                    // 여벌의체육복이 있는 학생의 번호의 자리에 -1을 대입하고
                    reserve[j] = -1;
                    // 체육복 여분 여부를 true(여분있음)로 변경한다
                    yn = true;

                    System.out.println("도난 - 여벌 = 1 reserve[j] =  " + reserve[j]);

                    // 도난당한 학생의 번호 - 여분의 체육복이 있는 학생의 번호의 값이 -1인경우
                } else if (lost[i] - reserve[j] == -1){
                    // 여벌의체육복이 있는 학생의 번호의 자리에 -1을 대입하고
                    reserve[j] = -1;
                    // 체육복 여분 여부를 true(여분있음)로 변경한다
                    yn = true;
                    System.out.println("도난 - 여벌 = -1 reserve[j] =  " + reserve[j]);

                } else {
                    // 위의 경우가 아니면 j의값을 1씩 더해준다
                    j++;
                }

            }
            // while문이 돌고난후 yn(체육복 여분 여부 체크 내용)이 false라면
            if(!yn){
                System.out.println("나중조건 " + yn);
                // 수업을 들을 수 잇는 학생 수에서 1씩 감소시킨다
                answer--;
            }
        }System.out.println(answer);

    }
}
