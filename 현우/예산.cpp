#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> d, int budget) {
    int answer = 0;
    sort(d.begin(),d.end());
    for(int i=0;i<d.size();i++){
      //예산초과할때
        if(budget-d[i]<0){
            break;
        }
        budget-=d[i];
        answer++;
    }
    return answer;
}
