#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int n;
int main() {
	cin >> n;
	vector<pair<int,int>>ar;
	long long length = 0;
	for (int i = 0; i < n; i++) {
		int point, people;
		cin >> point >> people;
		length += people;
		ar.push_back(make_pair(point, people));
	}
	sort(ar.begin(), ar.end());
	long long cnt1 = 0;
	long long cnt2 = 0;
	if (length%2 != 0) {
		length /= 2;
		length += 1;
		for (int i = 0; i < ar.size(); i++) {
			cnt1 += ar[i].second;
			if (cnt1 >= length) {
				cout << ar[i].first;
				return 0;
			}
		}
	}
	else {
		long long length1 = length / 2;
		long long length2 = length / 2 + 1;
		long long ans = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (length1 <= cnt1 && length2 <= cnt2) {
				break;
			}
			if (length1 > cnt1) {
				cnt1 += ar[i].second;
			}
			if (length2 > cnt2) {
				cnt2 += ar[i].second;
			}
			if (length1 <= cnt1) {
				ans += ar[i].first;
			}
			if (length2 <= cnt2) {
				ans += ar[i].first;
			}
		}
		cout << ans / 2;
	}
	
}
