#include<iostream>
#include<vector>
using namespace std;
int n, l;
vector<vector<int>>map;
int answer = 0;
void colCheck(int x) {
	int cnt = 1;
	for (int i = 1; i < n; i++) {
		if (map[i][x] == map[i-1][x]||(cnt==0&& map[i][x] == map[i - 1][x])) {
			cnt++;
		}
		else if (map[i][x] > map[i-1][x]) {
			if (cnt >= l&&map[i][x]-1==map[i-1][x]) {
				cnt = 1;
			}
			else {
				return;
			}
		}
		else {
			cnt = 0;
			if (i + l >=n+1) {
				return;
			}
			int j;
			for (j = i ; j <= i + l-1; j++) {
				if (map[i-1][x] != map[j][x] + 1) {
					return;
				}
			}
			i = j - 1;
		}
	}
	answer++;
}
void rowCheck(int y) {
	int cnt = 1;
	for (int i = 1; i < n; i++) {
		if (map[y][i] == map[y][i - 1]||(cnt==0&& map[y][i] == map[y][i - 1])) {
			cnt++;
		}
		else if (map[y][i] > map[y][i - 1]) {
			if (cnt >= l&&map[y][i]-1==map[y][i-1]) {
				cnt = 1;
			}
			else {
				return;
			}
		}
		else {
			cnt = 0;
			if (i + l >=n+1) {
				return;
			}
			int j;
			for ( j = i ; j <= i + l-1; j++) {
				if (map[y][j] != map[y][i-1] - 1) {
					return;
				}
 			}
			i = j - 1;
		}
	}
	answer++;
}
int main() {
	cin >> n >> l;
	for (int i = 0; i < n; i++) {
		vector<int>row;
		for (int j = 0; j < n; j++) {
			int a;
			cin >> a;
			row.push_back(a);
		}
		map.push_back(row);
	}
	for (int i = 0; i < n; i++) {
		rowCheck(i);
		colCheck(i);
	}
	cout << answer;
	
}
