#include<iostream>
#include<vector>
#include<algorithm>
#include<math.h>
using namespace std;
vector<int>ar;
int check[8001] = { 0, };
vector<pair<int, int>>br;
bool compare(pair<int, int>a, pair<int, int>b) {
	if (a.first > b.first) {
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
void func() {
	for (int i = 0; i <= 8000; i++) {
		if (check[i] != 0) {
			br.push_back(make_pair(check[i], i - 4000));
		}
	}
}
int main() {
	int n;
	cin >> n;
	double sum = 0;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		check[a+4000]++;
		sum += a;
		ar.push_back(a);
	}
	func();
	sort(ar.begin(), ar.end());
	cout << round(sum / n)<<"\n";
	cout << ar[n / 2] << "\n";
	sort(br.begin(), br.end(), compare);
	if (n!=1&&br[0].first == br[1].first) {
		cout << br[1].second << "\n";
	}
	else {
		cout << br[0].second << "\n";
	}

	cout << ar[n - 1] - ar[0];
}
