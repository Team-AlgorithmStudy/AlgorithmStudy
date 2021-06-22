package test;

public class Test11 {

	/**
	 * 
	 * 로또의 최고순위와 최저순위
	 * 
	 * <풀이과정>
	 * 구매한 로또번호와 당첨번호를 비교했을 때, 찢긴부분이 모두 불일치, 나머지 숫자부분에서 일치한 갯수를 파악하여 최저순위로 나타냄
	 * 구매한 로또번호와 당첨번호를 비교했을 때, 찢긴부분 전부 일치한다고 가정하고, 나머지 숫자부분에서 일치한 갯수를 파악하여 최고순위 나타냄 
	 * 
	 */
	public static void main(String[] args) {
		int lottos[] = { 44, 1, 0, 0, 31, 25 };    // 구매한 로또 번호를 담은 배열 (찢긴곳은 0으로 표시)
		int win_nums[] = { 31, 10, 45, 1, 6, 19 }; // 당첨번호를 담은 배열
		int count = 0;  // 당첨번호와 맞는 갯수
		int count0 = 0; // 0의개수

		for (int i = 0; i < 6; i++) {// 로또의 개수는 6개
			if (lottos[i] == 0) {
				count0++; // 찢긴 0의 갯수 
			}
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					count++;  //찢긴부분을 제외하고 나머지 숫자부분에서 일치한 갯수를 파악
				}
			}
		}
		System.out.println("count : " + count);
		System.out.println("count0 : " + count0);
		
		
		//1등: count=6, 2등 : count=5, 3등 : count=4, 4등 : count=3, 5등 : count=2, 6등 : 그외
		//최고순위 x 
		int x = 7 - (count + count0) > 6 ? 6 : 7 - (count + count0);
		//최저순위 y
		int y = 7 - count > 6 ? 6 : 7 - count;
		int answer[] = {x, y};
		for(int k : answer) {
			System.out.print(k + " ");
		}

	}

}
