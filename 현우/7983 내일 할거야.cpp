#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n;
bool compare(pair<int, int>a, pair<int, int>b) {
	return a.first >= b.first;
}
int main() {
	cin >> n;
	vector<pair<int, int>>ar;
	for (int i = 0; i < n; i++) {
		int num, last;
		cin >> num >> last;
		ar.push_back(make_pair(last, num));
	}
	sort(ar.begin(), ar.end(), compare);
	int start = ar[0].first;
	for (int i = 0; i < n; i++) {
		if (start < ar[i].first) {
			start -= ar[i].second;
		}
		else {
			start = ar[i].first - ar[i].second;
		}
	}
	cout << start;


}
