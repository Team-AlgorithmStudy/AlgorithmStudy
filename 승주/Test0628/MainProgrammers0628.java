package test0628;

public class MainProgrammers0628 {
    /**
     * 음양 더하기
     * @param args
     */
    public static void main(String[] args) {
//        int[] absolutes = {4, 7, 12};
//        boolean[] signs = {true, false, true};

        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};

        int result = solution(absolutes, signs);
        System.out.println(result);
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                sum -= absolutes[i];
            }else {
                sum += absolutes[i];
            }
        }

        answer = sum;

        return answer;
    }
}
