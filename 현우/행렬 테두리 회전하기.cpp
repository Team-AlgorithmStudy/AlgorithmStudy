#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;
int map[101][101];
void init(int row,int column){
    int cnt=1;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=column;j++){
            map[i][j]=cnt;
            cnt++;
        }
    }
}
int change(int starty,int startx,int endy,int endx){
    int next=map[starty][startx];
    int k;
    int ans=next;
    for(int i=startx+1;i<=endx;i++){
        k=map[starty][i];
        ans=min(ans,k);
        map[starty][i]=next;
        next=k;
    }
    for(int i=starty+1;i<=endy;i++){
        k=map[i][endx];
        ans=min(ans,k);
        map[i][endx]=next;
        next=k;
    }
    for(int i=endx-1;i>=startx;i--){
        k=map[endy][i];
        ans=min(ans,k);
        map[endy][i]=next;
        next=k;
    }
    for(int i=endy-1;i>=starty;i--){
         k=map[i][startx];
        ans=min(ans,k);
        map[i][startx]=next;
        next=k;
    }
    return ans;
}

vector<int> solution(int rows, int columns, vector<vector<int>> queries) {
    vector<int> answer;
    init(rows,columns);
  
    for(int i=0;i<queries.size();i++){
        int ans=change(queries[i][0],queries[i][1],queries[i][2],queries[i][3]);
        answer.push_back(ans);
    }
    return answer;
}
