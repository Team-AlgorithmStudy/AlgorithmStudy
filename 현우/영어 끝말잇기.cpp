#include <string>
#include <vector>
#include <iostream>
#include <set>
using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer; 
    set<string>s;
    int num=-1;
    for(int i=0;i<words.size();i++){
        string word=words[i];
        if(i>=1){
            if(words[i-1][words[i-1].size()-1]!=word[0]){
                num=i+1;
                break;
            }
        }
        if(s.find(word)==s.end()){
            s.insert(word);
        }
        else{
            num=i+1;
            break;
        }
    }
    if(num==-1){
        answer.push_back(0);
        answer.push_back(0);
    }else{
        if(num%n==0){
            answer.push_back(n);
            answer.push_back(num/n);            
        }else{
            answer.push_back(num%n);
            int k=0;
            while(num>0){
                k++;
                num-=n;
            }
            answer.push_back(k);
        }
        
    }
    
    return answer;
}
