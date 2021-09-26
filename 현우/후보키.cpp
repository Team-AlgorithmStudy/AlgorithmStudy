#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;
vector<vector<string>>relations;
vector<int>v;
vector<vector<int>>candidate;
int answer = 0;
bool check1(){
    vector<string>s;
    for(int i=0;i<relations.size();i++){
        string re="";
        for(int j=0;j<v.size();j++){
            int k=v[j];
            re+=relations[i][k];
        }
        if(find(s.begin(),s.end(),re)!=s.end())return false;
        else s.push_back(re);
    }
    return true;
}
bool check2(){
    if(v.size()==1)return true;
    
    for(int i=0;i<candidate.size();i++){
        bool c=false;
        for(int j=0;j<candidate[i].size();j++){
            int re=candidate[i][j];
            if(find(v.begin(),v.end(),re)==v.end()){
                c=true;
                break;
            }
        }
        if(c==false)return false;
    }
    return true;
}
bool check(){
    if(check1()&&check2()){
        candidate.push_back(v);
        for(int i=0;i<v.size();i++){
            cout<<v[i];
        }
        cout<<"\n";
        return true;
    }
    return false;
}
void combi(int cnt,int totalCnt,int start){
    if(cnt==totalCnt){
        if(check()){
            answer++;
        }
        return ;
    
    }
    for(int i=start;i<relations[0].size();i++){
        v.push_back(i);
        combi(cnt+1,totalCnt,i+1);
        v.pop_back();
    }
    
}
int solution(vector<vector<string>> relation) {
    
    relations=relation;
    for(int i=1;i<=relation.size();i++){
        combi(0,i,0);
    }
    return answer;
}
