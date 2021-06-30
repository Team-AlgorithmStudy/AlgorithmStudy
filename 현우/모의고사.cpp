#include <string>
#include <vector>
#include <cstring>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int a[5]={1,2,3,4,5};
    int b[8]={2,1,2,3,2,4,2,5};
    int c[10]={3,3,1,1,2,2,4,4,5,5};
    int count[4];
    memset(count,0,sizeof(count));
    for(int i=0;i<answers.size();i++){
        int k=i%5;
        int q=i%8;
        int w=i%10;
        if(a[k]==answers[i]){
            count[1]++;
        }
        if(b[q]==answers[i]){
            count[2]++;
        }
        if(c[w]==answers[i]){
            count[3]++;
        }
        
    }
    int ma=count[1];
    for(int i=2;i<=3;i++){
        ma=max(ma,count[i]);
    }
    for(int i=1;i<=3;i++){
        if(ma==count[i]){
        answer.push_back(i);
        }
    }
    return answer;
}
