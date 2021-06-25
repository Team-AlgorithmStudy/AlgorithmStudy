#include <string>
#include <vector>
#include <cstring>
#include <algorithm>
using namespace std;
bool check[31];
int ma=0;
int q;
void func(vector<int> reserve,int num,int count){
    if(num==reserve.size()){
        ma=max(ma,count);
        return ;
    }
    if(reserve[num]-1>0&&!check[reserve[num]-1]){
        check[reserve[num]-1]=true;
        func(reserve,num+1,count+1);
        check[reserve[num]-1]=false;
    }
    if(reserve[num]+1<=q&&!check[reserve[num]+1]){
        check[reserve[num]+1]=true;
        func(reserve,num+1,count+1);
        check[reserve[num]+1]=false;
    }
    func(reserve,num+1,count);
    return ;
}
int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    q=n;
    vector<int>real;
    memset(check,true,sizeof(check));
    for(int i=0;i<lost.size();i++){
        check[lost[i]]=false;
    }
    for(int i=0;i<reserve.size();i++){
        if(!check[reserve[i]]){
            check[reserve[i]]=true;
        }
        else{
            real.push_back(reserve[i]);
        }
    }
    func(real,0,0);
    answer=n-lost.size()+reserve.size()-real.size()+ma;
    return answer;
}
