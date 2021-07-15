#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main() {
	int n, l;
	cin >> n >> l;
	vector<int>ar;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	sort(ar.begin(), ar.end());
	for (int i = 0; i < n; i++) {
		if (l >= ar[i]) {
			l++;
		}
		else {
			break;
		}
	}
	cout << l;
}
