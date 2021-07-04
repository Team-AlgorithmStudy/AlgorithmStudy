#include <string>
#include <vector>
#include <queue>
#include <iostream>
using namespace std;

vector<int> solution(vector<int> prices) {
    vector<int> answer;
    vector<int>ex[100001];
    priority_queue<pair<int,int>>q;
    q.push(make_pair(prices[0],0));
    for(int i=1;i<prices.size();i++){
       while(!q.empty()){
            int num=q.top().first;
            if(num>prices[i]){
                ex[q.top().second].push_back(i-q.top().second);
                q.pop();
            }else{
                break;
            }
       }
         q.push(make_pair(prices[i],i));
            
            
    }
    while(!q.empty()){
        int index=q.top().second;
        ex[index].push_back(prices.size()-1-index);
        q.pop();
    }
    for(int i=0;i<prices.size();i++){
        answer.push_back(ex[i].back());
    }

    return answer;
}
