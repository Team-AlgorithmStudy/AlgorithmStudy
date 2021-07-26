#include<iostream>
#include<stack>
#include<algorithm>
#include<vector>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<int>ar;
	int m = 987654321;
	stack<int>s;
	stack<int>ans;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	for (int i = n - 1; i >= 0; i--) {
		while (!s.empty() && s.top() <= ar[i]) {
			s.pop();
		}
		if (s.empty())ans.push(-1);
		else {
			ans.push(s.top());
		}
		s.push(ar[i]);
	}
	while (!ans.empty()) {
		cout << ans.top() << " ";
		ans.pop();
	}
}
