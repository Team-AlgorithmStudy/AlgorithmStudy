package test0624;

import java.util.Locale;

public class MainProgrammers0624 {
    /**
     * 프로그래머스 키패드 누르기
     * @param args
     */
    public static void main(String[] args) {
//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        String hand = "right";
//        String hand = "left";
        String hand = "right";
        String result = solution(numbers, hand);
        System.out.println(result);

    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int leftValue = 0;
        int leftValueX = 0;
        int leftValueY = 0;

        int rightvalue = 0;
        int rightvalueX = 0;
        int rightvalueY = 0;

        int leftX=3;
        int leftY=0;

        int rightX=3;
        int rightY=2;

        String[][] keypad = {
                {"1","2","3"},
                {"4","5","6"},
                {"7","8","9"},
                {"*","0","#"}
        };
        //00  11

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < keypad.length; j++) {
                for (int k = 0; k < keypad[j].length; k++) {
                    if (keypad[j][k].equals(String.valueOf(numbers[i]))) {
                        if(numbers[i] == 1 || numbers[i] == 4 ||numbers[i] == 7){
                            answer += "l";
                            leftX = j;
                            leftY = k;

                        }else if(numbers[i] == 3 || numbers[i] == 6 ||numbers[i] == 9){
                            answer += "r";
                            rightX = j;
                            rightY = k;
                        }else {
                            //왼손찾기
                            if (leftX > j) {
                                leftValueX = leftX - j;
                            }else {
                                leftValueX = j - leftX;
                            }

                            if (leftY > k) {
                                leftValueY = leftY - k;
                            }else {
                                leftValueY = k - leftY;
                            }
                            leftValue = leftValueX + leftValueY;

                            //오른손찾기
                            if (rightX > j) {
                                rightvalueX = rightX - j;
                            }else {
                                rightvalueX = j - rightX;
                            }

                            if (rightY > k) {
                                rightvalueY = rightY - k;
                            }else {
                                rightvalueY = k - rightY;
                            }
                            rightvalue = rightvalueX + rightvalueY;

                            if (leftValue == rightvalue) {
                                answer += hand.charAt(0);
                                if (hand.equals("right")) {
                                    rightX = j;
                                    rightY = k;
                                }else if (hand.equals("left")) {
                                    leftX = j;
                                    leftY = k;
                                }
                            } else if (leftValue < rightvalue) {
                                answer += "l";
                                leftX = j;
                                leftY = k;
                            }else{
                                answer += "r";
                                rightX = j;
                                rightY = k;
                            }
                        }
                    }
                }
            }

        }
        answer = answer.toUpperCase(Locale.ROOT);
        return answer;
    }
}
