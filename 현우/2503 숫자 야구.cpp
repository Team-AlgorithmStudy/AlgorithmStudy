#include<iostream>
#include<vector>
using namespace std;
int n;
vector<pair<int,pair<int, int>>>base;
int ans = 0;
bool check[10];
int ar[4];
void calc() {
	bool check = true;
	for (int i = 0; i < n; i++) {
		int strike = 0, ball = 0;
		int number = base[i].first;
		int k = 100;
		for (int j = 1; j <= 3; j++) {
			int q = number / k;
			for (int w = 1; w <= 3; w++) {
				if (ar[w] == q) {
					if (w == j) {
						strike++;
						break;
					}
					else {
						ball++;
						break;
					}
				}
			}
			number %= k;
			k /= 10;
			
		}
		if (strike != base[i].second.first || ball != base[i].second.second) {
			check = false;
			break;
		}
	}
	if (check) {
		ans++;
	}
}
void combi(int k) {
	if (k== 4) {
		calc();
		return;
	}
	for (int i = 1; i <= 9; i++) {
		if (!check[i]) {
			check[i] = true;
			ar[k] =i ;
			combi(k + 1);
			check[i] = false;
		}
	}
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int num, strike, ball;
		cin >> num >> strike >> ball;
		base.push_back(make_pair(num, make_pair(strike, ball)));
	}
	combi(1);
	cout << ans;
}
