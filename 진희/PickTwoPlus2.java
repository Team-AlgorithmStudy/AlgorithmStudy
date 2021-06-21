package prtc;

import java.util.HashSet;
import java.util.Set;

public class PickTwoPlus2 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		Set<Integer> set = new HashSet<>();
		  
	        for(int i=0; i<numbers.length; i++) {
	            for(int j=i+1; j<numbers.length; j++) {
	                set.add(numbers[i] + numbers[j]);
	            }
	        }
	 
	        System.out.println(set.stream().sorted().mapToInt(Integer::intValue).toArray()); 

	}

}
