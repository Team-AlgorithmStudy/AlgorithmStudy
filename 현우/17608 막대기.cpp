#include<iostream>
#include<stack>
#include<algorithm>
using namespace std;
int n;
stack<int>ar;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push(a);
	}
	int ma = 0;
	int answer = 0;
	while (!ar.empty()) {
		int height = ar.top();
		ar.pop();
		if (height > ma) {
			answer++;
			ma = height;
		}
	}
	cout << answer;
}
