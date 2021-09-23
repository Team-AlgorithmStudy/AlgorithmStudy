#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
#include<math.h>
using namespace std;
string order[6] = { "*+-","*-+","-+*","-+*","+*-","+-*" };
long long calc(long long a, long long b, char c) {
	if (c == '*') {
		return a * b;
	}
	if (c == '+') {
		return a + b;
	}
	if (c == '-') {
		return a - b;
	}
	return 0;
}
long long solution(string expression) {
	long long answer = 0;
	vector<long long>num;
	vector<char>cal;
	string n;
	for (int i = 0; i < expression.size(); i++) {
		if (expression[i] >= '0' && expression[i] <= '9') {
			n += expression[i];
		}
		else {
			cal.push_back(expression[i]);
			num.push_back(stol(n));
			n = "";
		}
		if (i == expression.size() - 1) {
			num.push_back(stol(n));
		}
	}
	vector<long long>v = num;
	vector<char>c = cal;
	for (int i = 0; i < 6; i++) {
		int cnt = 0;
		num = v;
		cal = c;
		while (cnt != 3) {
			
			for (int j = 0; j < cal.size(); j++) {
				if (cal[j] == order[i][cnt]) {
					long long k = calc(num[j], num[j + 1], cal[j]);
					num[j] = k;
					num.erase(num.begin() + j + 1);
					cal.erase(cal.begin() + j);
					j--;
				}
			}
			cnt++;
		}
		answer = max(answer, abs(num[0]));

	}
	return answer;
}
int main() {
	cout<<solution("50*6-3*2");
}
