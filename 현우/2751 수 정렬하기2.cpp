#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<int>ar;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	sort(ar.begin(), ar.end());
	for (int i = 0; i < n; i++) {
		cout << ar[i] << "\n";
	}

}
