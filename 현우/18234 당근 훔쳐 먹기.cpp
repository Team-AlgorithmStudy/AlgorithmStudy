#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, t;
vector<pair<long long, long long>>ar;
int main() {
	cin >> n >> t;
	for (int i = 0; i < n; i++) {
		long long a, b;
		cin >> a >> b;
		ar.push_back(make_pair(b, a));
	}
	sort(ar.begin(), ar.end());
	long long ans = 0;
	for (int i = 0; i < n; i++) {
		ans += ar[i].second + ar[i].first*(t - n+i);
	}
	cout << ans;
}
