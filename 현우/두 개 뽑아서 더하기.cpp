#include <string>
#include <vector>
#include <algorithm>
#include <cstring>
using namespace std;
bool check[10001];
vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    for(int i=0;i<numbers.size();i++){
        for(int j=i+1;j<numbers.size();j++){
            int push=numbers[i]+numbers[j];
            if(!check[push]){
                check[push]=true;
                answer.push_back(push);
            }
        }
    }
    sort(answer.begin(),answer.end());
    return answer;
}