#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n;
vector<int>ar;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
	}
	int maxTwoCnt = 0;
	int oneCnt = 0;
	for (int i = 0; i < n; i++) {
		int twoCnt = 0;
		while (ar[i]!=0) {
			if (ar[i] % 2 == 0) {
				ar[i] /= 2;
				twoCnt++;
			}
			else {
				oneCnt++;
				ar[i] -= 1;
			}
		}
		maxTwoCnt = max(maxTwoCnt, twoCnt);
	}
	cout << maxTwoCnt + oneCnt;
}
