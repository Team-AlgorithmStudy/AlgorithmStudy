#include <iostream>
#include <math.h>
using namespace std;
int func(int a){
    int start=2;
    int cnt=1;
    while(1){
        if(a/start==1){
            break;
        }
        start*=2;
        cnt++;
    }
    return cnt;
}

int solution(int n, int a, int b)
{
    int answer = 0;
    int swap;
    if(a>b){
        swap=a;
        a=b;
        b=swap;
    }
    while(1){
        int nextN=n/2;
        if(a<=nextN&&b>nextN){
            answer=func(n);
            
            break;
        }
        if(a<=nextN&&b<=nextN){
            n=nextN;
            continue;
        }
        if(a>nextN&&b>nextN){
            n=nextN;
            a-=nextN;
            b-=nextN;
        }
        
        
    }
    

    return answer;
}
