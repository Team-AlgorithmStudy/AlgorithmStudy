#include<iostream>
#include<algorithm>
#include<math.h>
#include<cstring>
#include<queue>
using namespace std;
int score[11];
bool dir[11][11];
bool abcheck[11];
bool allcheck[11];
int n;
int ans = 999999999;
void calc();
void dircheck() {
	bool a = true;
	bool b = true;
	memset(allcheck, true, sizeof(allcheck));
	for (int i = 1; i <= n; i++) {
		if (a&&abcheck[i]) {
			a = false;
			allcheck[i] = false;
			queue<int>ar;
			ar.push(i);
			while (!ar.empty()) {
				int now = ar.front();
				ar.pop();
				for (int j = 1; j <= n; j++) {
					if (dir[now][j]&&allcheck[j]&&abcheck[j]) {
						ar.push(j);
						allcheck[j] = false;
					}
				}
			}
		}
		else if (b && !abcheck[i]) {
			b = false;
			allcheck[i] = false;
			queue<int>ar;
			ar.push(i);
			while (!ar.empty()) {
				int now = ar.front();
				ar.pop();
				for (int j = 1; j <= n; j++) {
					if (dir[now][j] && allcheck[j]&&!abcheck[j]) {
						ar.push(j);
						allcheck[j] = false;
					}
				}
			}
		}
	}
	if (a || b) {
		return;
	}
	for (int i = 1; i <= n; i++) {
		if (allcheck[i]) {
			return;
		}
	}
	calc();
}
void calc() {
	int acount = 0;
	int bcount = 0;
	for (int i = 1; i <= n; i++) {
		if (abcheck[i]) {
			acount += score[i];
		}
		else {
			bcount += score[i];
		}
	}
	if (acount != 0 && bcount != 0) {
		ans = min(ans, abs(acount - bcount));
	}
}
void check(int position) {
	if (position > n) {
		dircheck();
		return;
	}
	for (int i = position; i <= n; i++) {
		abcheck[i] = true;
		check(i + 1);
		abcheck[i] = false;
		check(i + 1);
	}
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >>score[i + 1];
	}
	for (int i = 1; i <= n; i++) {
		int num;
		cin >> num;
		for (int j = 1; j <= num; j++) {
			int a;
			cin >> a;
			dir[i][a] = true;
		}
	}
	check(1);
	if (ans == 999999999) {
		cout << "-1";
	}
	else {
		cout << ans;
	}
	
}
