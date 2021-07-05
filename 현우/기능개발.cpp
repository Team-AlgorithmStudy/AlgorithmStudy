#include <string>
#include <vector>
#include <queue>
using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    queue<int>q;
    for(int i=0;i<progresses.size();i++){
        int k=100-progresses[i];
        int num=k/speeds[i];
        if(k%speeds[i]!=0){
            num++;
        }
        q.push(num);
    }
    int index=q.front();
    q.pop();
    int re=1;
    while(!q.empty()){
        int time=q.front();
        q.pop();
        if(time>index){
            index=time;
            answer.push_back(re);
            re=1;
        }else{
            re++;
        }
        if(q.empty()){
                answer.push_back(re);
            }
        
    }
    return answer;
}
