package test;
//1차 비밀지도
public class Test7 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9,20,28,18,11};     //지도 1
		int[] arr2 = {30,1,21,17,28};     //지도 2
		int[][] arr11 = new int[n][n];    //지도 1을 2진수로 변환해서 담은 배열
		int[][] arr22 = new int[n][n];    //지도 2를 2진수로 변환해서 담은 배열
		String[] answer = new String[n];
		
		for(int i = 0 ; i < n; i++) {
			for(int j = n-1; j >= 0; j--) {
				//arr11[][]을 구하는 배열
				arr11[i][j] = arr1[i] % 2;
				arr1[i] = arr1[i] / 2;
				
				//arr22[][]을 구하는 배열
				arr22[i][j] = arr2[i] % 2;
				arr2[i] = arr2[i] / 2;
				
			}
		}
		
		//결과값을 담을 answer
		for(int i = 0 ; i < n; i++) {
			answer[i] = "";
			for(int j = 0; j < n; j++) {
				if(arr11[i][j] == 0 && arr22[i][j] == 0) {
					answer[i] += " ";
				} else {
					answer[i] += "#";
				}
			}
		}
		
		/////////////값 확인////////////////
		
		System.out.println("arr11[5][5]의 배열--------------");
		for(int i = 0; i < n ; i++) { 
			for(int j = 0 ; j <n ; j++) {
				System.out.print(arr11[i][j]);
			}
			System.out.println();
		}
		System.out.println("arr22[5][5]의 배열--------------");
		for(int i = 0; i < n ; i++) { 
			for(int j = 0 ; j <n ; j++) {
				System.out.print(arr22[i][j]);
			}
			System.out.println();
		}
		System.out.println("result[5][5]의 배열--------------");
		for(int i = 0; i < n ; i++) { 
				System.out.print(answer[i]);
				System.out.println();
		}
	}
}