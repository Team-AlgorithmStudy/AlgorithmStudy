package test;
//주식가격
public class Test17 {
	public static void main(String[] args) {
		int[] prices= {1,2,3,2,3};
		int[] answer = new int[prices.length];
		
		for(int i = 0; i < prices.length; i++) {
			for(int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if(prices[i] > prices[j]) {
					break;
				}
			}
		}
		for(int i = 0; i<prices.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
