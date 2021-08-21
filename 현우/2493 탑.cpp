#include<iostream>
#include<stack>
#include<queue>
using namespace std;
int n;
stack<int>billding;
priority_queue<pair<int, int>>pq;
int answer[500001] = { 0, };
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int height;
		cin >> height;
		billding.push(height);
	}
	int  standard = billding.top();
	int standardindex = billding.size() - 1;
	billding.pop();
	int indexnum = billding.size() - 1;
	while (!billding.empty()) {
		int left = billding.top();
		billding.pop();
		if (left >= standard) {
			answer[standardindex] = indexnum+1;
			standardindex = indexnum;
			standard = left;
			while (!pq.empty()) {
				int index=pq.top().second;
				pq.pop();
				answer[index] = indexnum + 1;
			}
		}
		else {
			while (!pq.empty()) {
				if (pq.top().first*-1 <= left) {
					answer[pq.top().second] = indexnum+1;
					pq.pop();
				}
				else {
					break;
				}
			}
			pq.push(make_pair(-left, indexnum));
		}
		indexnum--;
	}
	for (int i = 0; i < n; i++) {
		cout << answer[i] << " ";
	}
}
