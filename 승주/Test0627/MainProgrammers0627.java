package test0627;

public class MainProgrammers0627 {
    /**
     * 프로그래머스 다트 게임
     * @param args
     */
    public static void main(String[] args) {
        String dartResult1 = "1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1D2S0T";
        String dartResult4 = "1S*2T*3S";
        String dartResult5 = "1D#2S*3S";
        String dartResult6 = "1T2D3D#";
        String dartResult7 = "1D2S3T*";

        int result1 = solution(dartResult1);
        int result2 = solution(dartResult2);
        int result3 = solution(dartResult3);
        int result4 = solution(dartResult4);
        int result5 = solution(dartResult5);
        int result6 = solution(dartResult6);
        int result7 = solution(dartResult7);

        System.out.println("dartResult1 = "+ result1);
        System.out.println("dartResult2 = "+ result2);
        System.out.println("dartResult3 = "+ result3);
        System.out.println("dartResult4 = "+ result4);
        System.out.println("dartResult5 = "+ result5);
        System.out.println("dartResult6 = "+ result6);
        System.out.println("dartResult7 = "+ result7);
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int count = 0;
        String number = "";
        int[] sum = new int[3];

        String[] test = dartResult.split("");

        for (String s : test) {
            if (s.equals("S") || s.equals("D") || s.equals("T")) {
                switch (s) {
                    case "S":
                        sum[count] = (int) Math.pow(Integer.parseInt(number), 1);
                        count++;
                        break;
                    case "D":
                        sum[count] = (int) Math.pow(Integer.parseInt(number), 2);
                        count++;
                        break;
                    case "T":
                        sum[count] = (int) Math.pow(Integer.parseInt(number), 3);
                        count++;
                        break;
                }
                number = "";

            } else if (s.equals("*") || s.equals("#")) {
                if (s.equals("*")) {
                    if (count == 1) {
                        sum[count-1] *= 2;
                    }else {
                        sum[count - 2] *= 2;
                        sum[count - 1] *= 2;
                    }
                }else {
                    sum[count-1] *= -1;
                }

            }else {
                number += s;
            }
        }
        for (int i :
                sum) {
            answer+= i;
        }

        return answer;
    }
}
