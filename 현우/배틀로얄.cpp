//문제 설명이 애매함
#include<iostream>
#include<vector>
#include<algorithm>
#include<queue>
using namespace std;
int x, y, m;
vector<pair<int,int>>attack;
vector<pair<int,int>>hp;
queue<int>ans;
bool compare(pair<int, int>a, pair<int, int>b) {
	if (a.first == b.first)
		return a.second < b.second;
	else
		return a.first <b.first;
}
int main() {
	cin >> x >> y >> m;
	int startM = m;
	for (int i = 0; i < x; i++) {
		int a;
		cin >> a;
		attack.push_back(make_pair(a,i+1));
	}
	for (int j = 0; j < y; j++) {
		int a;
		cin >> a;
		hp.push_back(make_pair(a,j+1));
	}
	
	if (m == 0) {
		cout << "0";
		return 0;
	}
	int cnt = 0;
	for (int i = 0; i < attack.size(); i++) {
		
			while (m-attack[i].first<=0) {
				if (cnt >= hp.size()) {
					cout << 0;
					return 0;
				}
				m += hp[cnt].first;
				ans.push(hp[cnt].second);
				cnt++;
			}
			m -= attack[i].first;
			ans.push(-attack[i].second);
	}
	for (int i = cnt; i < hp.size(); i++) {
		ans.push(i+1);
	}
	while (!ans.empty()) {
		int k = ans.front();
		ans.pop();
		cout << k << "\n";
	}
	
}
