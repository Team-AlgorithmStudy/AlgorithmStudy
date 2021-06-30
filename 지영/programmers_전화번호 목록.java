package test;

import java.util.HashMap;

//프로그래머스 전화번호목록
public class Test9 {
	public static void main(String[] args) {
		
		String[] phone_book = { "119", "97674223", "1195524421" };
		boolean answer = true;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		
		for(int i = 0; i < phone_book.length; i++) {
			for(int j = 0; j < phone_book[i].length(); j++) {
				if( map.containsKey(phone_book[i].substring(0,j)) ){
					answer = false;
				}
			}
		}
		
		System.out.println(answer);
		
		 //"시간초과"
/*		String[] phone_book = { "119", "97674223", "1195524421" };
		boolean answer = true;
		
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if (i == j) {
					continue;
				}
				if (phone_book[j].startsWith(phone_book[i])) {
					answer = false;
					break;
				}
				
			}
		}

		System.out.println(answer);
*/
	}
}
