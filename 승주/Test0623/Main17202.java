package test0623;

import java.util.Scanner;

public class Main17202 {
    /**
     * 핸드폰 번호 궁합
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.next();
        String secondNum = scanner.next();

        String[] testNumFirst = firstNum.split("");
        String[] testNumSecond = secondNum.split("");

        int[] total = new int[testNumFirst.length + testNumSecond.length];

        for (int i = 0; i < 8; i++) {
            total[2*i] = Integer.parseInt(testNumFirst[i]);
            total[(2*i) + 1] = Integer.parseInt(testNumSecond[i]);
        }

        for (int i :
                total) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < total.length; i++) {
            System.out.print(i + " ");
        }

        for (int i = total.length; i > 2; i--) {
            int[] changeNum = new int[total.length-1];
            for (int j = 0; j < changeNum.length; j++) {
                changeNum[j] = (total[j] + total[j + 1]) % 10;
            }
            total = changeNum;
            for (int k :
                    total) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        int answer = (total[0] * 10) + total[1];

        System.out.printf("%02d", answer);

    }
}
