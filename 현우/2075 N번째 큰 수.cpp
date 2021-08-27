#include<iostream>
#include<queue>
using namespace std;
int n;
int main() {
	cin >> n;
	int last = 0;
	int cnt = 0;
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	priority_queue<int>q;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			int a;
			cin >> a;
			a *= -1;
			if (cnt >= n) {
				int first = q.top();
				if (first > a) {
					q.pop();
					q.push(a);
				}
			}
			else {
				cnt++;
				q.push(a);
			}
		}
	}
	while (q.size() != n) {
		q.pop();
	}
	cout << q.top()*-1;
	
	

}
