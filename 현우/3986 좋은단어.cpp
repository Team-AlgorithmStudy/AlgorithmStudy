#include<iostream>
#include<stack>
#include<string>
using namespace std;
int n;
int main() {
	cin >> n;
	int cou = 0;
	for (int i = 0; i < n; i++) {
		string a;
		cin >> a;
		stack<char>s;
		for (int j = 0; j < a.size(); j++) {
			if (!s.empty() && s.top() == a[j]) {
				s.pop();
			}
			else {
				s.push(a[j]);
			}
		}
		if (s.empty()) {
			cou++;
		}
	}
	cout << cou;
}
