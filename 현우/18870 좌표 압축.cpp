#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
int n;
vector<pair<int,int>>br;
vector<pair<int,int>>ar;
bool compare(pair<int, int>a, pair<int, int>b) {
	if (a.first < b.first) {
		return true;
	}
	if (a.first == b.first) {
		if (a.second < b.second) {
			return true;
		}
		return false;
	}
	return false;
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(make_pair(a,i));
	}
	sort(ar.begin(), ar.end(),compare);
	int cnt = 0;
	br.push_back(make_pair(ar[0].second, cnt));
	for (int i = 1; i < n; i++) {
		if (ar[i].first == ar[i - 1].first) {
			br.push_back(make_pair(ar[i].second, cnt));
		}
		else {
			cnt++;
			br.push_back(make_pair(ar[i].second, cnt));
		}
		
	}
	sort(br.begin(), br.end(), compare);
	for (int i = 0; i < n; i++) {
		cout << br[i].second << " ";
	}
}
