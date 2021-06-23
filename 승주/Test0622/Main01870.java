package test0622;

import java.util.Scanner;

public class Main10870 {
    /**
     * 피보나치 수
     * 0 1 1 2 3 5 8 13 ...
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;

        int N = scanner.nextInt();
        if(N == 0){
            sum = firstNum;
        } else if(N ==1){
            sum = secondNum;
        } else if(N >= 2){
                for (int i = 1; i <= N-1; i++) {
                System.out.println("firstNum = " + firstNum);
                System.out.println("secondNum = " + secondNum);

                    sum = firstNum + secondNum;
                    firstNum = secondNum;
                    secondNum = sum;

                System.out.println("sum = " + sum);
                System.out.println();
                }
        }

        System.out.println(sum);


    }
}
