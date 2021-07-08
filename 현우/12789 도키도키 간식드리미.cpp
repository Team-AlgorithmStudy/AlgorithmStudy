#include<iostream>
#include<stack>
#include<queue>
using namespace std;
int n;
int main() {
	cin >> n;
	queue<int>ar;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push(a);
	}
	int start = 1;
	stack<int>br;
	while (start<=n&&!ar.empty()) {
		if (!ar.empty() && start == ar.front()) {
			ar.pop();
			start++;
		}else if (!br.empty() && start == br.top()) {
			br.pop();
			start++;
		}
		else {
			br.push(ar.front());
			ar.pop();
		}
	}
	while (!br.empty()) {
		if (br.top() == start) {
			br.pop();
			start++;
		}
		else {
			break;
		}
	}
	if (ar.empty() && br.empty()) {
		cout << "Nice";
	}
	else {
		cout << "Sad";
	}
	
}
