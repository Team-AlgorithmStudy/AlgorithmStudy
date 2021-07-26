#include<iostream>
#include<string>
#include<stack>
using namespace std;
int n;
int main() {
	cin >> n;
	stack<int>ar;
	for (int i = 0; i < n; i++) {
		string a;
		cin >> a;
		if (a == "push") {
			int k;
			cin >> k;
			ar.push(k);
		}
		else if (a == "pop") {
			if (ar.empty()) {
				cout << "-1" << "\n";
				continue;
			}
			cout << ar.top()<<"\n";
			ar.pop();
		}
		else if (a == "size") {
			cout << ar.size() << "\n";
		}
		else if (a=="empty") {
			cout << ar.empty() << "\n";
		}
		else if (a == "top") {
			if (ar.empty()) {
				cout << "-1" << "\n";
				continue;
			}
			cout << ar.top() << "\n";
		}
	}
}
