#include<iostream>
using namespace std;
int n, m,k;
int ar[101][101];
int br[101][101];
int ans[101][101];
int func(int y, int x) {
	int re = 0;
	for (int i = 1; i <= m; i++) {
		re += ar[y][i] * br[i][x];
	}
	return re;
}
int main() {
	cin >> n >> m;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= m; j++) {
			cin >> ar[i][j];
		}
	}
	cin >> m >> k;
	for (int i = 1; i <= m; i++) {
		for (int j = 1; j <= k; j++) {
			cin >> br[i][j];
		}
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= k; j++) {
			ans[i][j] = func(i, j);
			cout << ans[i][j] << " ";
		}
		cout << "\n";
	}
	
}
