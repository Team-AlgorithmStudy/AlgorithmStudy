#include<iostream>
#include<queue>
using namespace std;
int n, k;
int main() {
	cin >> n >> k;
	queue<int>q;
	for (int i = 1; i <= n; i++) {
		q.push(i);
	}
	int cnt = 0;
	cout << "<";
	while (!q.empty()) {
		cnt++;
		int j = q.front();
		q.pop();
		if (cnt == k&&!q.empty()) {
			cout << j << ", ";
			cnt = 0;
			continue;
		}
		if (cnt == k) {
			cout << j << ">";
			break;
		}
		q.push(j);
	}
}
