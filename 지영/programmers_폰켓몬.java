package test;

import java.util.HashSet;
//폰켓몬
public class Test5 {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		int x = nums.length / 2;  //고를수 있는 포켓몬의 수
		int result = 0;           //선택할 수 있는 폰켓몬 종류의 개수의 최댓값
		
		//중복제거
		HashSet<Integer> pickNums = new HashSet<Integer>();  //고른 폰켓몬을 담은 배열

		for(int i = 0; i < nums.length; i++) {
			pickNums.add(nums[i]);
			//System.out.println(i+"번째 반복문 nums[i] : " + nums[i] );
		}
		
		for(int i = 0; i < pickNums.size(); i++) {
			result++;
			
			if(result == nums.length / 2) { //3
				break;
			}
		}
		
		System.out.println(result);
		
	}
}
