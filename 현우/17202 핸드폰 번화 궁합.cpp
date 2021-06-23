#include<iostream>
#include<string>
using namespace std;
int main() {
	string first, second,answer;
	cin >> first >> second;
	for (int i = 0; i < first.size(); i++) {
		answer += first[i];
		answer += second[i];
	}
	while (answer.size() != 2) {
		for (int i = 0; i < answer.size()-1; i++) {
			int k = answer[i]-'0' + (int)answer[i + 1]-'0';
			k %= 10;
			answer[i] =k+'0';
		}
		answer.erase(answer.size()-1,1);
	}
	cout << answer;
}
