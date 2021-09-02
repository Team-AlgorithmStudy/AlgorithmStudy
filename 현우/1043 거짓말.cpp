#include<iostream>
#include<vector>
#include<queue>
using namespace std;
int n, m,k;
bool check[51];
vector<int>ar[51];
vector<int>br[51];
queue<int>trman;
int main() {
	cin >> n >> m;
	cin >> k;
	for (int i = 0; i < k; i++) {
		int a;
		cin >> a;
		trman.push(a);
	}
	for (int i = 1; i <= m; i++) {
		int num;
		cin >> num;
		for (int j = 0; j < num; j++) {
			int a;
			cin >> a;
			ar[i].push_back(a);
			br[a].push_back(i);
		}
	}
	while (!trman.empty()) {
		int num = trman.front();
		trman.pop();
		if (check[num]) {
			continue;
		}
		check[num] = true;
		for (int i = 0; i < br[num].size(); i++) {
			for (int j = 0; j < ar[br[num][i]].size(); j++) {
				if (check[ar[br[num][i]][j]]) {
					continue;
				}
				trman.push(ar[br[num][i]][j]);
			}
		}
	}
	int cnt = 0;
	for (int i = 1; i <= m; i++) {
		bool answer = true;
		for (int j = 0; j < ar[i].size(); j++) {
			if (check[ar[i][j]]) {
				answer = false;
				break;
			}
		}
		if (answer) {
			cnt++;
		}
	}
	cout << cnt;
}
