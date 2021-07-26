#include<iostream>
#include<deque>
#include<queue>
using namespace std;
int n, m;
int main() {
	cin >> n >> m;
	deque<int>de;
	queue<int>q;
	for (int i = 1; i <= n; i++) {
		de.push_back(i);
	}
	for (int i = 0; i < m; i++) {
		int a;
		cin >> a;
		q.push(a);
	}
	int ans = 0;
	while (!q.empty()) {
		int find = q.front();
		q.pop();
		int a1 = 0;
		for (int i = 0; i < de.size(); i++) {
			if (find == de[i]) {
				a1 = i;
				break;
			}
		}
		int a2 = de.size() - 1 - a1;
		if (a1 <= a2) {
			while (1) {
				if (de.front() == find) {
					de.pop_front();
					break;
				}
				ans++;
				int j = de.front();
				de.pop_front();
				de.push_back(j);
			}
		}
		else {
			while (1) {
				int j = de.back();
				de.pop_back();
				de.push_front(j);
				ans++;
				if (de.front() == find) {
					de.pop_front();
					break;
				}
			}
		}
	}
	cout << ans;
}
