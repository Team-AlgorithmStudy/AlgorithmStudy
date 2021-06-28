package test;

public class Test3 {
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false,true};
		int result = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i]) {
				result = result + absolutes[i];
			}
			else
				result = result -absolutes[i];
			
		}
		System.out.println(result);
	}
}
