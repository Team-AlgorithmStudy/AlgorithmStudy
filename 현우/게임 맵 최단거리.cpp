#include<vector>
#include<cstring>
#include<algorithm>
#include<iostream>
#include<queue>
using namespace std;
bool map[101][101];
int cnt[101][101]={0,};
int n,m;
int xGo[4]={1,-1,0,0};
int yGo[4]={0,0,1,-1};
vector<vector<int> >ex;
void init(){
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cnt[i][j]=987654321;
        }
    }
}
void func(int y,int x){
    queue<pair<int,int>>q;
    q.push(make_pair(y,x));
    map[y][x]=true;
    while(!q.empty()){
        int nowY=q.front().first;
        int nowX=q.front().second;
        q.pop();
        if(nowY==0&&nowX==0){
            break;
        }
        for(int i=0;i<4;i++){
            int nextX=nowX+xGo[i];
            int nextY=nowY+yGo[i];
            if(!map[nextY][nextX]&&ex[nextY][nextX]!=0&&nextX>=0&&nextX<m&&nextY>=0&&nextY<n){
                map[nextY][nextX]=true;
                q.push(make_pair(nextY,nextX));
                cnt[nextY][nextX]=min(cnt[nowY][nowX]+1,cnt[nextY][nextX]);
            }
        }
    }
    
}
int solution(vector<vector<int> > maps)
{
    int answer = 0;
    ex=maps;
    n=maps.size();
    m=maps[0].size();
    memset(map,false,sizeof(map));
    init();
    cnt[n-1][m-1]=1;
     func(n-1,m-1);
    if(answer==987654321){
        answer=-1;
    }
    return answer;
}
