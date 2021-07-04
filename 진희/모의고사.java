class Solution {
    public int[] solution(int[] answers) {
         int[] ex1 = {1, 2, 3, 4, 5};
    	 int[] ex2 = {2, 1, 2, 3, 2, 4, 2, 5};
    	 int[] ex3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	 int[] supo1 = new int[answers.length];
    	 int[] supo2 = new int[answers.length];
    	 int[] supo3 = new int[answers.length];
    	 int k = 0;
    	 for(int i=0; i<answers.length;i++) {
    		 k = i%ex1.length;
    		 supo1[i]=ex1[k];
    	 }
    	 for(int i=0; i<answers.length;i++) {
    		 k = i%ex2.length;
    		 supo2[i]=ex2[k];
    	 }
    	 for(int i=0; i<answers.length;i++) {
    		 k = i%ex3.length;
    		 supo3[i]=ex3[k];
    	 }
         int count1 =0;
         int count2 =0;
         int count3 =0;
         for(int i=0; i<answers.length;i++) {
        	 if(answers[i] == supo1[i]) {
        		 count1++;
        	 }
        	 if(answers[i] == supo2[i]) {
        		 count2++;
        	 }
        	 if(answers[i] == supo3[i]) {
        		 count3++;
        	 }
         }
        int[] answer;
         if(count1>count2) {
        	 if(count1>count3) {
        		 answer = new int[1];
        		 answer[0] = 1;
        	 } else if(count1==count3) {
        		 answer = new int[2];
        		 answe r[0] =1;
        		 answer[1] =3;
        	 } else {
        		 answer = new int[1];
        		 answer[0] = 3;
        	 }
         } else if(count1==count2) {
        	 if(count1>count3) {
        		 answer = new int[2];
        		 answer[0] =1;
        		 answer[1] =2;
        	 } else if(count1==count3) {
        		 answer = new int[3];
        		 answer[0] =1;
        		 answer[1] =2;
        		 answer[2] =3;
        	 } else {
        		 answer = new int[1];
        		 answer[0] = 3;
        	 }
         } else {
        	 if(count2>count3) {
        		 answer = new int[1];
        		 answer[0] = 2;
        	 } else if(count2==count3) {
        		 answer = new int[2];
        		 answer[0] =2;
        		 answer[1] =3;
        	 } else {
        		 answer = new int[1];
        		 answer[0] = 3;
        	 }
         }
        
        return answer;
    }
}
