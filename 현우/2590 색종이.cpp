#include<iostream>
using namespace std;
int num[7];
int emp[3] = { 0, };
int main() {
	int cnt = 0;
	for (int i = 1; i <= 6; i++) {
		int a;
		cin >> a;
		num[i] = a;
	}
	cnt += num[6];
	cnt += num[5];
	emp[1]+= 11 * num[5];
	cnt += num[4];
	emp[2] += 5 * num[4];
	cnt += num[3] / 4;
	int k = num[3] % 4;
	int j = 4 - k;
	if ( k!= 0) {
		cnt++;
		emp[2] += 2 * j - 1;
		emp[1] += j + 4;
	}
	if (emp[2] >= num[2]) {
		emp[2] -= num[2];
		emp[1] += emp[2] * 4;
	}
	else {
		num[2] -= emp[2];
		cnt += num[2] / 9;
		if (num[2] % 9 != 0) {
			cnt++;
			int total = 9-num[2] % 9;
			emp[1] += total * 4;
		}
	}
	if (emp[1] < num[1]) {
		num[1] -= emp[1];
		cnt += num[1] / 36;
		if (num[1] % 36 != 0) {
			cnt++;
		}
	}
	cout << cnt;
}
