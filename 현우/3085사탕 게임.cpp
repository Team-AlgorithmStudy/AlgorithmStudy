#include<iostream>
#include<string>
#include<algorithm>
#include<cstring>
using namespace std;
char map[51][51];
int n;
int ax[] = { 1,0 };
int ay[] = { 0,1};
int answer = 0;
int check() {
	int re = 0;
	int row[51][51] = {0,};
	int coulmn[51][51] = { 0,};
	for(int i=1;i<=n;i++){
		for (int j = 1; j <= n; j++) {
			if (map[i][j] == map[i - 1][j]) {
				row[i][j] = row[i - 1][j] + 1;
			}
			if (map[i][j] == map[i][j - 1]) {
				coulmn[i][j] = coulmn[i][j - 1] + 1;
			}
		}
	}
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <= n; j++) {
			re = max(re, row[j][i]);
			re = max(re, coulmn[i][j]);
		}
	}
	return re;
}
void swap(int y,int x,int nexty,int nextx) {
	char temp;
	temp = map[y][x];
	map[y][x] = map[nexty][nextx];
	map[nexty][nextx] = temp;
	return;
}
void change(int y, int x) {
	for (int i = 0; i < 2; i++) {
		int nexty = y + ay[i];
		int nextx = x + ax[i];
		if (nextx > 0 && nexty > 0 && nextx <= n && nexty <= n&&map[y][x]!=map[nexty][nextx]) {
			swap(y, x, nexty, nextx);
			answer = max(answer, check());
			swap(y, x, nexty, nextx);
		}
	}
}
int main() {
	cin >> n;
	char buffer;
	for (int i = 1; i <= n; i++) {
		scanf("%c", &buffer);
		for (int j = 1; j <= n; j++) {
			scanf("%c", &map[i][j]);
		}
		
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			change(i, j);
		}
	}
	cout << answer+1;
}