#include<iostream>
#include<vector>
#include<algorithm>
#include<queue>
using namespace std;
int n;
vector<pair<int, int>>ar;
priority_queue<int>q;
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> n;
	for (int i = 0; i < n; i++) {
		int  start, end;
		cin >> start >> end;
		ar.push_back(make_pair(start, end));
	}
	sort(ar.begin(), ar.end());
	int cnt = 1;
	int ans = 1;
	q.push(-ar[0].second);
	while (cnt!=n) {
		if (q.empty()) {
			q.push(-ar[cnt].second);
			cnt++;
			continue;
		}
		int time = -q.top();
		if (time <= ar[cnt].first) {
			q.pop();
			continue;
		}
		q.push(-ar[cnt].second);
		cnt++;
		int k = q.size();
		ans = max(ans,k);
	}
	cout << ans;

}
