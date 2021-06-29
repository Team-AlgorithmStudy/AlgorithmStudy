#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;
vector<string>ar1,ar2;
int num;
void func1(vector<int>a){
    for(int i=0;i<a.size();i++){
        int k=a[i];
        string q;
         for(int j=0;j<num;j++){
             int next=k%2;
              k/=2;
              q+=next+'0';
         }
        reverse(q.begin(),q.end());
        ar1.push_back(q);
    }
}
void func2(vector<int>a){
    for(int i=0;i<a.size();i++){
        int k=a[i];
        string q;
         for(int j=0;j<num;j++){
             int next=k%2;
              k/=2;
              q+=next+'0';
         }
        reverse(q.begin(),q.end());
        ar2.push_back(q);
    }
}

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    num=n;
    func1(arr1);
   func2(arr2);
    for(int i=0;i<n;i++){
        string q;
        for(int j=0;j<n;j++){
            if(ar1[i][j]=='1'||ar2[i][j]=='1'){
                q+="#";
            }else{
                q+=" ";
            }
        }
        answer.push_back(q);
    }
    return answer;
}
