#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
int n;
//봉지 개수
int number[5001];
int main() {
	cin >> n;
  //봉지를 -1로 초기화
	memset(number, -1, sizeof(number));
	number[3] = 1, number[5] = 1;
	for (int i = 6; i <= n; i++) {
		if (number[i - 3] != -1) {
			number[i] = number[i - 3] + 1;
		}
		if (number[i - 5] != -1) {
			if (number[i] == -1) {
				number[i] = number[i - 5] + 1;
			}
			else {
				number[i] = min(number[i], number[i - 5] + 1);
			}
		}
	}
	cout << number[n];
}
