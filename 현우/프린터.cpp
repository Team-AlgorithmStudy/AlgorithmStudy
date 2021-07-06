#include <string>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;
bool compare(int a,int b){
    return a>b;
}

int solution(vector<int> priorities, int location) {
    int answer = 0;
    queue<pair<int,int>>ans;
    for(int i=0;i<priorities.size();i++){
        if(location==i){
            ans.push(make_pair(priorities[i],1));
        }
        else{
             ans.push(make_pair(priorities[i],0));
        }
    }
    sort(priorities.begin(),priorities.end(),compare);
    int k=0;
    int time=0;
    while(1){
        if(ans.front().second==1&&ans.front().first==priorities[k]){
            break;
        }
        if(ans.front().first==priorities[k]){
            ans.pop();
            k++;
            time++;
        }
        else{
            ans.push(make_pair(ans.front().first,ans.front().second));
            ans.pop();
        }
    }
    answer=time+1;
    return answer;
}
