#include <string>
#include <vector>
#include <algorithm>
using namespace std;
vector<int>infos[3][2][2][2];
vector<string>q;
void init(string s){
    string ex="";
    vector<int>v;
    for(int i=0;i<s.size();i++){
        if(s[i]==' '){
            if(ex=="cpp"||ex=="backend"||ex=="junior"||ex=="chicken")v.push_back(0);
            else if(ex=="java"||ex=="frontend"||ex=="senior"||ex=="pizza")v.push_back(1);
            else v.push_back(2);
            ex="";
        }else{
            ex+=s[i];
        }
    }
    infos[v[0]][v[1]][v[2]][v[3]].push_back(stoi(ex));
}
vector<string> queryCheck(string query){
    string s="";
    vector<string>v;
    for(int i=0;i<query.size();i++){
        if(query[i]==' '){
            if(s=="and"){
                s="";
                continue;
            }
            v.push_back(s);
            s="";
        }else{
        s+=query[i];
        }
    }
    v.push_back(s);
    return v;
}
vector<int> solution(vector<string> info, vector<string> query) {
    vector<int> answer;
    for(int i=0;i<info.size();i++){
        init(info[i]);
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                for(int l=0;l<2;l++){
                    sort(infos[i][j][k][l].begin(),infos[i][j][k][l].end());
                }
            }
        }
    }
    for(int i=0;i<query.size();i++){
        vector<string>v=queryCheck(query[i]);
        int si,ei,sj,ej,sk,ek,sl,el;
        if(v[0]=="cpp")si=0,ei=0;
        else if(v[0]=="java")si=1,ei=1;
        else if(v[0]=="python")si=2,ei=2;
        else si=0,ei=2;
        
        if(v[1]=="backend")sj=0,ej=0;
        else if(v[1]=="frontend")sj=1,ej=1;
        else sj=0,ej=1;
        
        if(v[2]=="junior")sk=0,ek=0;
        else if(v[2]=="senior")sk=1,ek=1;
        else sk=0,ek=1;
        
        if(v[3]=="chicken")sl=0,el=0;
        else if(v[3]=="pizza")sl=1,el=1;
        else sl=0,el=1;
        int num=0;
        for(int i=si;i<=ei;i++){
            for(int j=sj;j<=ej;j++){
                for(int k=sk;k<=ek;k++){
                    for(int l=sl;l<=el;l++){
                        if(infos[i][j][k][l].size()==0){
                            continue;
                        }
                        auto iter=lower_bound(infos[i][j][k][l].begin(),infos[i][j][k][l].end(),stoi(v[4]));
                        if(iter==infos[i][j][k][l].end()){
                            continue;
                        }
                        num+=infos[i][j][k][l].size()-(iter-infos[i][j][k][l].begin());
                    }
                }
            }
        }
        answer.push_back(num);
    }
    
    return answer;
}
