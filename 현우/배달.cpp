#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;
#define big 987654321;
int city[51][51]={0,};
int charge[51];
void init(int n){
    for(int i=1;i<=n;i++){
        charge[i]=big;
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            city[i][j]=big;
        }
    }
}
void dy(int n){
    priority_queue<pair<int,int>>q;
    charge[1]=0;
    q.push(make_pair(0,1));
    while(!q.empty()){
        int dis=-q.top().first;
        int next=q.top().second;
        q.pop();
        for(int i=1;i<=n;i++){
            if(i==next){
                continue;
            }
            if(city[next][i]+dis<charge[i]){
                charge[i]=city[next][i]+dis;
                q.push(make_pair(-city[next][i]-dis,i));
            }
        }
    }
    
}
int solution(int N, vector<vector<int> > road, int K) {
    int answer = 0;
      init(N);
    for(int i=0;i<road.size();i++){
        for(int j=0;j<road[i].size();j++){
            int city1=road[i][0];
            int city2=road[i][1];
            int cost=road[i][2];
            city[city1][city2]=min(city[city1][city2],cost);
            city[city2][city1]=min(city[city2][city1],cost);
        }
    }
  
    dy(N);
    for(int i=1;i<=N;i++){
        if(K>=charge[i]){
            answer++;
        }
    }
    

    return answer;
}
