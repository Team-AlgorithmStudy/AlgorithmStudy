#include <string>
#include <cmath>
#include <iostream>
using namespace std;
//다트 점수보관
int ar[3]={0,};
int solution(string dartResult) {
    int answer = 0;
    //다트 인덱스
    int index=0;
    //점수
    int num=-987654321;
    //10인지 아닌지 판별
    bool check=false;
    for(int i=0;i<dartResult.size();i++){
        if(dartResult[i]>='0'&&dartResult[i]<='9'){
            //앞자리도 숫자니깐 num은10
            if(check){
                num=10;
                continue;
            }
            //숫자를 배열에 입력
            if(num!=-987654321){
                ar[index]=num;
                index++;
            }
            check=true;
            num=dartResult[i]-'0';
            continue;
        }
        //D,T처리
        if(dartResult[i]=='D'){
            num=pow(num,2);
        }else if(dartResult[i]=='T'){
            num=pow(num,3);
        }
        check=false;
        //*,#처리
        if(dartResult[i]=='*'){
            if(index!=0){
                ar[index-1]*=2;
            }
            num*=2;    
        }else if(dartResult[i]=='#'){
            num*=-1;
        }
        if(dartResult.size()-1==i){
            ar[index]=num;
        }
    }
    //ar저장된점수 answer더하기
    for(int i=0;i<3;i++){
        answer+=ar[i];
    }
    return answer;
}
