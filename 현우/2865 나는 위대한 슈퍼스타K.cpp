#include<iostream>
#include<algorithm>
#include<vector>
#include<cmath>
using namespace std;
bool check[101];
bool compare(pair<double,int>a,pair<double,int> b) {
	return a.first > b.first;
}
int main() {
	int n, m, k;
	cin >> n >> m >> k;
	vector<pair<double,int>>ar;
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			int num;
			double score;
			cin >> num >> score;
			ar.push_back(make_pair(score, num));
		}
	}
	sort(ar.begin(), ar.end(), compare);
	int cnt = k;
	double ans = 0;
	for (int i = 0; i < ar.size(); i++) {
		if (cnt == 0) {
			break;
		}
		if (!check[ar[i].second]) {
			cnt--;
			check[ar[i].second] = true;
			ans += ar[i].first;
		}
	}
	
	cout << fixed;
	cout.precision(1);
	cout << ans;

}
