#include<iostream>
#include<string>
using namespace std;
//알파벳에 맞는 숫자
int check[26] = { 2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9 };
int main() {
	string input;
	cin >> input;
	int answer = 0;
	for (int i = 0; i < input.size(); i++) {
		answer += check[input[i] - 'A'] + 1;
	}
	cout << answer;
}
