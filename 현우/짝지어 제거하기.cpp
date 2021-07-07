#include <iostream>
#include<string>
#include<stack>
using namespace std;

int solution(string s)
{
    int answer = 0;
	stack<char>ar;
    for(int i=0;i<s.size();i++){
        if(!ar.empty()&&ar.top()==s[i]){
            ar.pop();
        }else{
            ar.push(s[i]);
        }
    }
    if(ar.empty()){
        answer=1;
    }
    return answer;
}
