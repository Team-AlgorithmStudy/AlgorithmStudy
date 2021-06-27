#include<iostream>
#include<deque>
#include<string>
#include<vector>
using namespace std;
deque<int>ar[4];
int n;
vector<pair<int, int>>turn;
void move(int num, bool dir) {
	if (dir) {
		int front = ar[num].back();
		ar[num].push_front(front);
		ar[num].pop_back();
	}
	else {
		int back = ar[num].front();
		ar[num].push_back(back);
		ar[num].pop_front();
	}
}
void left(int index,bool dir) {
	if (index <= 0) {
		move(index, dir);
		return;
	}
	if (ar[index - 1][2] != ar[index][6]) {
		left(index - 1, !dir);
	}
	move(index, dir);
	return;
}
void right(int index, bool dir) {
	if (index >= 3) {
		move(index, dir);
		return;
	}
	if (ar[index][2] != ar[index+1][6]) {
		right(index+1, !dir);
	}
	move(index, dir);
	return;
}

int main() {
	for (int i = 0; i < 4; i++) {
		string a;
		cin >> a;
		for (int j = 0; j < a.size(); j++) {
			ar[i].push_back(a[j] - '0');
		}
	}
	cin >> n;
	for (int i = 0; i < n; i++) {
		int number, dir;
		cin >> number >> dir;
		turn.push_back(make_pair(number, dir));
	}
	for (int i = 0; i < n; i++) {
		int num=turn[i].first-1;
		int dir = turn[i].second;
		bool check = false;
		if (dir == 1) {
			check = true;
		}
		if (num - 1 >= 0 && ar[num][6] != ar[num - 1][2]) {
			left(num - 1, !check);
		}
		if (num + 1 <= 3 && ar[num][2] != ar[num + 1][6]) {
			right(num + 1, !check);
		}
		move(num, check);
	}
	int sum = 0;
	int k = 1;
	for (int i = 0; i < 4; i++) {
		if (ar[i][0] == 1) {
			sum += k;
		}
		k *= 2;
	}
	cout << sum;

}
