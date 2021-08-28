#include<iostream>
#include<queue>
using namespace std;
int t , k;
int main() {
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> k;
		priority_queue<long long>q;
		long long ans = 0;
		for (int j = 0; j < k; j++) {
			int a;
			cin >> a;
			q.push(a*(-1));
		}
		while (q.size() != 1) {
			long long first = -q.top();
			q.pop();
			long long second = -q.top();
			q.pop();
			ans += first + second;
			q.push(-(first + second));
		}
		cout << ans << "\n";

	}
}
