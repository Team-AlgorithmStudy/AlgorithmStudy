#include<iostream>
using namespace std;
//중복체크
bool check[100];
int main() {
	//시작번호이자 다음번호
	int startnum;
	cin >> startnum;
	//정답
	int answer = 1;
	//시작부분을 true체크
	check[startnum] = true;
	while (1) {
		//첫번째 숫자
		int first = startnum / 10;
		//두번째 숫자
		int second = startnum % 10;
		//다음숫자
		startnum = second * 10 + (first + second) % 10;
		//이미 체크된번호면 중단
		if (check[startnum]) {
			break;
		}
		//아니면 체크
		else {
			check[startnum] = true;
			answer++;
		}
	}
	cout << answer;

	
}