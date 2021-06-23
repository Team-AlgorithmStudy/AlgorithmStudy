class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
		int countZero = 0;
		int rankMax;
		int rankMin;
		for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
				countZero+=1;
                continue;
			}
			for(int j=0; j<lottos.length; j++) {
				if(lottos[i] == win_nums[j]) {
					count+=1;
                    break;
				}
			}
			
		}
		
		
        rankMax=7-(count+countZero);
        rankMin=7-(count);
		
        if(rankMin == 7){
            rankMin = 6;
        }
        if(rankMax == 7){
            rankMax = 6;
        }
        int[] answer = {rankMax, rankMin};
        
        return answer;
    }
}
