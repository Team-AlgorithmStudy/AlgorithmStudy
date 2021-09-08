#include<iostream>
#include<queue>
using namespace std;
int n;
priority_queue<pair<int, int>>q;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int cost, dead;
		cin >> cost >> dead;
		q.push(make_pair(dead, cost));
	}
	int start = q.top().first;
	start -= q.top().second;
	q.pop();
	while (!q.empty()) {
		int dead = q.top().first;
		int cost = q.top().second;
		q.pop();
		if (start > dead) {
			start = dead;
			start -= cost;
		}
		else {
			start -= cost;
		}
	}
	if (start < 0) {
		cout << -1;
	}
	else {
		cout << start;
	}
}
