#include <string>
#include <vector>
#include <math.h>
using namespace std;

vector<long long> solution(vector<long long> numbers) {
    vector<long long> answer;
    for(int i=0;i<numbers.size();i++){
        if(numbers[i]%2==0){
            answer.push_back(numbers[i]+1);
        }else{
            long long k=numbers[i];
            int cnt=0;
            while(k!=0){
                if(k%2==0)break;
                cnt++;
                k/=2;
            }
            answer.push_back(numbers[i]+pow(2,cnt)-pow(2,cnt-1));
        }
    }
    return answer;
}
