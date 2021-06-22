#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;
vector<pair<double,int>>ar;
int check[200001]={0,};
bool compare(pair<double,int>a,pair<double,int>b){
    if(a.first>b.first){
        return true;
    }
    if(a.first<b.first){
        return false;
    }
    if(a.first==b.first){
        return a.second<b.second;
    }
}
vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    int total=stages.size();
    for(int i=0;i<stages.size();i++){
        check[stages[i]]++;
    }
    for(int i=1;i<=N;i++){
        ar.push_back(make_pair(check[i]/(total*1.0),i));
        total-=check[i];
        
    }
    sort(ar.begin(),ar.end(),compare);
    for(int i=0;i<N;i++){
        answer.push_back(ar[i].second);
    }
    
    return answer;
}