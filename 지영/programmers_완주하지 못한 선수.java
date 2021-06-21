package test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden", "jj","zz"};
		String[] completion = { "kiki", "leo","eden", "jj"};
		
		String answer= "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < participant.length; i++) {
			if(i >= completion.length) {
				answer = participant[i];
				System.out.println("2 : " + answer);
				break;
			}
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				System.out.println("1 : " + answer);
				break;
			} 
		}
		
		//코드는 맞으나, 프로그래머스 에서 시간초과 뜬 코드..
		/*
		String[] participant = { "leo", "kiki", "eden", "jj","jj"};
		String[] completion = { "kiki", "leo","eden", "jj"};

		String answer = "";
		
		ArrayList<String> al = new ArrayList<>();

		for (int i = 0; i < completion.length; i++) {
			al.add(completion[i]);
		}

		for (int j = 0; j < participant.length; j++) {
			if (al.contains(participant[j])) {
				al.remove(participant[j]);
				continue;
			}
			answer = participant[j];
			System.out.println(answer);
		}
		*/
		
	}
}