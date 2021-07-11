#include<iostream>
#include<queue>
using namespace std;
int n;
priority_queue<int>q;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		a *= -1;
		q.push(a);
	}
	int start = 1;
	while (!q.empty()) {
		int num = -q.top();
		if (start == num) {
			start++;
			q.pop();
			continue;
		}
		break;
	}
	cout << start;
}
