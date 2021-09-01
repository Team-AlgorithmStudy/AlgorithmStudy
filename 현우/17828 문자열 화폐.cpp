#include<iostream>
#include<stack>
using namespace std;
int n, x;
int main() {
	cin >> n >> x;
	double avg = x / (n*1.0);
	stack<int>ar;
	if (avg > 26||n>x) {
		cout << "!";
	}
	else {
		for (int i = n; i >= 1; i--) {
			if (x - 26 > i - 1) {
				ar.push(26);
				x -= 26;
			}
			else {
				int k = x - i + 1;
				ar.push(k);
				x -= k;
			}
		}
	}
	while (!ar.empty()) {
		int num = ar.top() - 1;
		char alpa = 'A' + num;
		ar.pop();
		cout << alpa;
	}
}
