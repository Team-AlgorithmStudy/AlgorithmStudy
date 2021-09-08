#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
bool compare(int a, int b) {
	return a > b;
}
int main() {
	int n,m;
	cin >> n >> m;
	static long long threenum[250001];
	static long long fivenum[250001];
	vector<int>three, five;
	for (int i = 0; i < n; i++) {
		int num, cost;
		cin >> num >> cost;
		if (num == 3) {
			three.push_back(cost);
		}
		else {
			five.push_back(cost);
		}
	}
	sort(three.begin(), three.end(), compare);
	sort(five.begin(), five.end(), compare);
	if (three.size() != 0) {
		threenum[0] = three[0];
	}
	if (five.size() != 0) {
		fivenum[0] = five[0];
	}
	
	
	for (int i = 1; i < three.size(); i++) {
		threenum[i] = threenum[i-1] + three[i];
	}
	for (int j = 1; j < five.size(); j++) {
		fivenum[j] = fivenum[j -1] + five[j];
	}
	int cnt = 0;
	long long ans = 0;
	while (cnt <= five.size()) {
		long long cost = 0;
		int k = m;
		k -= cnt * 5;
		if (k < 0) {
			break;
		}
		if (cnt > 0) {
			cost += fivenum[cnt-1];
		}
		int thcnt = k / 3;
		if (thcnt > 0) {
			if (thcnt >= three.size()) {
				cost += threenum[three.size() - 1];
			}
			else {
				cost += threenum[thcnt - 1];
			}
			
		}
		ans = max(ans, cost);
		cnt++;
	}
	cout << ans;
}
