#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int n;
vector<pair<int, int>>ar;
#define na 40000
bool compare(pair<int, int>a, pair<int, int>b) {
	if (a.first == 0) {
		return false;
	}
	if (b.first == 0) {
		return true;
	}
	if (a.second == 0 && b.second == 0) {
		return a.first < b.first;
	}
	return a.second*b.first < a.first*b.second;
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a, b;
		cin >> a >> b;
		ar.push_back(make_pair(a, b));
	}
	sort(ar.begin(), ar.end(), compare);
	int idx = 0;
	long long ans = 0;
	while (idx != n) {
		ans += ans * ar[idx].first + ar[idx].second;
		ans %= na;
		idx++;
	}
	cout << ans;
}
