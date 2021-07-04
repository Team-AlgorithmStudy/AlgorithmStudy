#include <vector>
#include <iostream>
using namespace std;
bool check[3000];
//소수 체크
void func(){
    for(int i=2;i<3000;i++){
        if(!check[i]){
            int k=i;
            while(1){
                if(i+k>=3000){
                    break;
                }
                check[i+k]=true;
                k+=i;
            }
        }
    }
}
int solution(vector<int> nums) {
    int answer = 0;
    func();
    vector<int>number;
    for(int i=0;i<nums.size();i++){
        for(int j=i+1;j<nums.size();j++){
            for(int k=j+1;k<nums.size();k++){
                int sum=nums[i]+nums[j]+nums[k];
                if(!check[sum]){
                    answer++;
                }
            }
        }
    }
    
   

    return answer;
}
