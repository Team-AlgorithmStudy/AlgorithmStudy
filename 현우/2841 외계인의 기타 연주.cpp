#include<iostream>
#include<queue>
using namespace std;
int n, f;
int main() {
	cin >> n >> f;
	static priority_queue<int>q[500001];
	int answer = 0;
	for (int i = 0; i < n; i++) {
		int qnum, qf;
		cin >> qnum >> qf;
		while (!q[qnum].empty()) {
			if (q[qnum].top() >qf) {
				answer++;
				q[qnum].pop();
				continue;
			}
			else if(q[qnum].top()==qf) {
				break;
			}
			else {
				answer++;
				q[qnum].push(qf);
				break;
			}
		}
		if (q[qnum].empty()) {
			answer++;
			q[qnum].push(qf);
		}
	}
	cout << answer;
}
