#include <string>
#include <vector>
#include <cstdlib>
using namespace std;
vector<pair<int,int>>left;
vector<pair<int,int>>right;
string solution(vector<int> numbers, string hand) {
    string answer = "";
    left.push_back(make_pair(3,0));
    right.push_back(make_pair(3,2));
    for(int i=0;i<numbers.size();i++){
        int placey=(numbers[i]-1)/3;
        int placex=(numbers[i]-1)%3;
        if(numbers[i]==0){
            placey=3;
            placex=1;
        }
        int leftdi=abs(placey-left[0].first)+abs(placex-left[0].second);
        int rightdi=abs(placey-right[0].first)+abs(placex-right[0].second);
        if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
            answer+="L";
            left.pop_back();
            left.push_back(make_pair(placey,placex));
        }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
            answer+="R";
            right.pop_back();
            right.push_back(make_pair(placey,placex));
        }else{
            if(leftdi<rightdi){
                answer+="L";
                left.pop_back();
                left.push_back(make_pair(placey,placex));
            }else if(leftdi>rightdi){
                answer+="R";
                right.pop_back();
                right.push_back(make_pair(placey,placex));
            }else{
                 if(hand=="left"){
                    answer+="L";
                    left.pop_back();
                    left.push_back(make_pair(placey,placex));
                }else{
                    answer+="R";
                    right.pop_back();
                    right.push_back(make_pair(placey,placex));
            }
            }
           
        }
    }
    return answer;
}
