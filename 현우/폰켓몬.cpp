#include <vector>
#include <map>
#include <algorithm>
using namespace std;

int solution(vector<int> nums)
{
    int answer = 0;
    map<int,int>ans;
    for(int i=0;i<nums.size();i++){
        ans[nums[i]]+=1;
    }
    int k=nums.size()/2;
    int j=ans.size();
    if(k>j){
        answer=j;
    }
    else{
        answer=k;
    }
    return answer;
}
