#include <string>
#include <vector>

using namespace std;
int check(vector<string>a){
    for(int i=0;i<a.size();i++){
        for(int j=0;j<a[i].size();j++){
            if(a[i][j]=='P'){
                if(j+1<a[i].size()){
                    if(a[i][j+1]=='P'||(j+2<a[i].size()&&a[i][j+1]!='X'&&a[i][j+2]=='P')){
                        return 0;
                    }
                }
                if(i+1<a.size()){
                    if(a[i+1][j]=='P'||(i+2<a.size()&&a[i+1][j]!='X'&&a[i+2][j]=='P')){
                        return 0;
                    }
                }
                if(i+1<a.size()&&j+1<a[i].size()){
                    if(a[i+1][j+1]=='P'&&(a[i+1][j]!='X'||a[i][j+1]!='X')){
                        return 0;
                    }
                }
                if(i+1<a.size()&&j-1>=0){
                    if(a[i+1][j-1]=='P'&&(a[i+1][j]!='X'||a[i][j-1]!='X')){
                        return 0;
                    }
                }
            }
        }
    }
    return 1;
}

vector<int> solution(vector<vector<string>> places) {
    vector<int> answer;
    for(int i=0;i<places.size();i++){
        int k=check(places[i]);
        answer.push_back(k);
    }
    return answer;
}
