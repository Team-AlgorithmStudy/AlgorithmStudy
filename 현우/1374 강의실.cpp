#include<iostream>
#include<vector>
#include<algorithm>
#include<queue>

using namespace std;
int n;
vector<pair<int,int>>ar;
priority_queue<int>q;
int main() {
	cin >> n;
	int maxTime = 0;
	for (int i = 0; i < n; i++) {
		int a, start, end;
		cin >> a >> start >> end;
		ar.push_back(make_pair(start, end));
		maxTime = max(maxTime, end);
	}
	sort(ar.begin(), ar.end());
	int cnt = 0;
	int ans = 0;
	for (int i = 1; i <= maxTime; i++) {
		while (1) {
			if (!q.empty() && q.top()*-1 <= i) {
				q.pop();
				continue;
			}
			if (cnt < n&&ar[cnt].first == i) {
				q.push(ar[cnt].second*-1);
				cnt++;
				continue;
			}
			break;
		}
		int k = q.size();
		ans = max(ans, k);
		
	}
	cout << ans;
	
}
