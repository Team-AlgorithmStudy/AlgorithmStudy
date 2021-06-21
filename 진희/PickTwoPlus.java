package prtc;

import java.util.ArrayList;
import java.util.Collections;

public class PickTwoPlus {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int sum =0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=numbers.length-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				sum=numbers[i]+numbers[j];
				if(!list.contains(sum)) list.add(sum);
			}
		}
		Collections.sort(list);
		int[] answer = list.stream().mapToInt(i->i).toArray();
		for(int k=0;k<answer.length;k++) {
			System.out.println(answer[k]+" ");
		}
	}
	
}
