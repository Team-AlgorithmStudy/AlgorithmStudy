package code;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double arr[] = new double[sc.nextInt()];

		double max = 0;
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			max = arr[0];
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] / max * 100;
		}

		System.out.println(sum / arr.length);

//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i] / arr[arr.length - 1] * 100;
//		}
//		
//		System.out.println(sum / arr.length);
	}
}
