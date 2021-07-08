#include<iostream>
#include<queue>
#include<string>
using namespace std;
int main() {
	queue<int>ar;
	string n;
	string end = "고무오리 디버깅 끝";
	getline(cin, n);
	while (1) {
		string text;
		getline(cin, text);
		if (text == end) {
			break;
		}
		if (text == "문제") {
			ar.push(1);
			continue;
		}
		if (text == "고무오리") {
			if (ar.empty()) {
				ar.push(1);
				ar.push(1);
			}
			else {
				ar.pop();
			}
		}
	}
	if (ar.empty()) {
		cout << "고무오리야 사랑해";
	}
	else {
		cout << "힝구";
	}
}
