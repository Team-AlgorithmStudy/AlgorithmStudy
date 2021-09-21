#include <string>
#include <map>
#include <vector>
#include <set>
#include <algorithm>
#include <iostream>
using namespace std;
vector<string>v;
set<string>se;
map<string,int>check(string str){
    map<string,int>m;
    for(int i=0;i<str.size()-1;i++){
       string s="";
        if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')){
            if(str[i]>='a'&&str[i]<='z'){
                s+=toupper(str[i]);
                
            }else{
                 s+=str[i];
            }
           
        }else{
            continue;
        }
        
        if((str[i+1]>='a'&&str[i+1]<='z')||(str[i+1]>='A'&&str[i+1]<='Z')){
           if(str[i+1]>='a'&&str[i+1]<='z'){
                s+=toupper(str[i+1]);
                
            }else{
                 s+=str[i+1];
            }
            if(m.find(s)==m.end()){
                m.insert(make_pair(s,1));
                if(se.find(s)==se.end()){
                    se.insert(s);
                    v.push_back(s);
                }
                
            }else{
                m[s]++;
                
            } 
        }else{
            continue;
        }
    }
    return m;
}
int solution(string str1, string str2) {
    int answer = 0;
    map<string,int>m1=check(str1);
    map<string,int>m2=check(str2);
    int cnt=0;
    int sum=0;
    for(int i=0;i<v.size();i++){
        if(m1.find(v[i])!=m1.end()&&m2.find(v[i])!=m2.end()){
            cnt+=max(m1[v[i]],m2[v[i]]);
            sum+=min(m1[v[i]],m2[v[i]]);
            continue;
        }
        if(m1.find(v[i])!=m1.end()){
            cnt+=m1[v[i]];
            continue;
        }
        if(m2.find(v[i])!=m2.end()){
            cnt+=m2[v[i]];
        }
    }
    if(v.size()==0){
        return 65536;
    }
    float ans=sum/(cnt*1.0);
    answer=(ans*65536);
    
    return answer;
}
