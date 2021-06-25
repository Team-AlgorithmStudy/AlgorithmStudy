class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count=0;
        for (int i=0; i< lost.length;i++){
            for(int j=0;j< reserve.length; j++){
                if(i+1< lost.length){
                        if(lost[i+1]==reserve[j]){
                            continue;
                        }
                }
                
                if(Math.abs(lost[i]-reserve[j])<=1){
                    reserve[j]=-1;
                    count++;
                    break;
                }
            }
        }
        answer=n-lost.length+count;
        return answer;
    }
}
