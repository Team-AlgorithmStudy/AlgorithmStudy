#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
int n, k;
int main() {
	cin >> n >> k;
	int startnum = 1;
	int cnt = 0;
	int key = 0;
	while (startnum<=n&&cnt!=k) {
		if (n%startnum == 0) {
			cnt++;
		}
		if (cnt == k) {
			key = startnum;
		}
		startnum++;
	}
		cout << key;
	
	
	
}
