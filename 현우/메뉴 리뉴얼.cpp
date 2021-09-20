#include <string>
#include <vector>
#include <queue>
#include <algorithm>
#include <set>
#include <iostream>
using namespace std;
bool check[21][27];
vector<char>v;
int orderSize;
priority_queue<pair<int,string>>s[11];
void func2(int maxNum,vector<char>a){
    int cnt=0;
    sort(a.begin(),a.end());
    for(int i=0;i<orderSize;i++){
        for(int j=0;j<a.size();j++){
            if(!check[i][a[j]-'A']){
                break;
            }
            if(j+1==a.size()){
                cnt++;
            }
        }
    }
    string q="";
    for(int i=0;i<a.size();i++){
                q+=a[i];
    }
    if(!s[maxNum].empty()){
        int now=s[maxNum].top().first;
        if(now<cnt){
            while(!s[maxNum].empty()){
                s[maxNum].pop();
            }
            
            s[maxNum].push(make_pair(cnt,q));
        }else if(now==cnt){
            s[maxNum].push(make_pair(cnt,q));
        }
    }else{
        s[maxNum].push(make_pair(cnt,q));
    }
}
void func1(int start,int num,int maxNum,vector<char>a){
    if(num==maxNum){
        func2(maxNum,a);
        return ;
    }
    for(int i=start;i<v.size();i++){
        a.push_back(v[i]);
        func1(i+1,num+1,maxNum,a);
        a.pop_back();
    }
    return ;
    
}
vector<string> solution(vector<string> orders, vector<int> course) {
    vector<string> answer;
    orderSize=orders.size();
    set<char>t;
    for(int i=0;i<orders.size();i++){
        for(int j=0;j<orders[i].size();j++){
            if(!check[i][orders[i][j]-'A']){
                check[i][orders[i][j]-'A']=true;
                if(t.find(orders[i][j])==t.end()){
                    t.insert(orders[i][j]);
                    v.push_back(orders[i][j]);
                }
            }
            
        }
    }
    for(int i=0;i<course.size();i++){
        vector<char>a;
        func1(0,0,course[i],a);
        while(!s[course[i]].empty()){
            if(s[course[i]].top().first<=1||s[course[i]].top().second==""){
                cout<<s[course[i]].top().first;
                break;
            }
            string ans=s[course[i]].top().second;
            s[course[i]].pop();
            answer.push_back(ans);
        }
    }
    sort(answer.begin(),answer.end());
    return answer;
}
