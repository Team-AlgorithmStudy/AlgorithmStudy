package test;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		int d[] = {1,3,2,5,4};   //신청금액
		int budget = 9;          //예산
		int sum = 0;             //예산과 비교하기 위한 신청금액의 sum 값
		int answer = 0;          //지원해줄 수 있는 부서의 수
		Arrays.sort(d);          //오름차순으로바꿔주기 (작은 값부터 더해주기 위해)
		
		for(int i = 0 ; i < d.length; i++) {
			sum = sum + d[i];    //두번째부터 sum에 값을 더해가면서, budget 범위와 비교하였음..
			if(sum <= budget) {
				answer++;
			}
			if(sum > budget) {
				break;
			}
		}
		System.out.println(answer);
		
	}
}
