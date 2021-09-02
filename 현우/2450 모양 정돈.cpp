#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int n;
vector<int>ar;
int order[3] = { 1,2,3 };
int cnt[4] = { 0, };
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int a;
		cin >> a;
		ar.push_back(a);
		cnt[a]++;
	}
	int answer = 987654321;
	do {
		int br[4][4] = { 0, };
		int start = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < cnt[order[i]]; j++) {
				br[order[i]][ar[j+start]]++;
			}
			start += cnt[order[i]];
		}
		answer = min(answer, br[1][2] + br[1][3] + max(br[2][3], br[3][2]));
	}  while (next_permutation(order, order + 3));
		cout << answer;

}
