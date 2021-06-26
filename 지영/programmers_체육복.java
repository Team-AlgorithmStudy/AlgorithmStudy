package test;

public class Test13 {
	public static void main(String[] args) {
		
		int n = 5;               //전체학생 수
		int[] lost = {2,4};      //체육복을 도난당한 학생들의 번호가 담긴 배열
		int[] reserve = {1,2,5}; // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		
		int answer = 0;          //체육수업을 들을 수 있는 학생의 최댓값
		
		//여벌 체육복을 가져온 학생이 도난당한 경우
		for(int i = 0; i < lost.length; i++) {
			for(int j=0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					answer ++;
					lost[i] = -1;      //더이상 빌려줄 수 없는 사람은 -1로 만들어버려서 중복을 막음.
					reserve[j] = -1;
					break;
				}
			}
		}
		
		for(int i = 0; i < lost.length; i++) { 
			for(int j = 0; j < reserve.length; j++) {
				
				int 조건1 = reserve[j] - 1 ;
				int 조건2 = reserve[j] + 1;
				
				if(lost[i] == 조건1 || lost[i] == 조건2) { 
					answer++;
					reserve[j] = -1;  //더이상 빌려줄 수 없는 사람은 -1로 만들어버려서 중복을 막음.
					break;
				}
			
			}
		}
		
		System.out.println(n - lost.length + answer );
		
	}
}
