#include <string>
#include <vector>
#include<iostream>
using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int magicNum=0;
    int correctNum=0;
    for(int i=0;i<lottos.size();i++){
         if(lottos[i]==0){
                magicNum++;
                continue;
            }
        for(int j=0;j<win_nums.size();j++){
            if(lottos[i]==win_nums[j]){
                correctNum++;
                break;
            }
        }
    }
    if(correctNum+magicNum==0){
        answer.push_back(6);
    }
    else{
        answer.push_back(7-(correctNum+magicNum));
    }
    if(correctNum==0){
        answer.push_back(6);
    }
    else{
        answer.push_back(7-correctNum);
    }
    
    return answer;
}
