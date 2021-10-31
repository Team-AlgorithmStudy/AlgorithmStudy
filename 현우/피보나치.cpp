#include <string>
#include <vector>

using namespace std;
long long fi[100001];
int solution(int n) {
    int answer = 0;
    fi[0]=0;
    fi[1]=1;
    for(int i=2;i<=n;i++){
        fi[i]=fi[i-2]+fi[i-1];
        fi[i]%=1234567;
    }
    answer=fi[n];
    return answer;
}
