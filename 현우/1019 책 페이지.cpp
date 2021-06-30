#include<iostream>
using namespace std;
int n;
long long number[10] = { 0, };
void calc(int start, int s) {
	while (start != 0) {
		number[start % 10] += s;
		start /= 10;
	}
}
void func(int start, int end,int s) {
	//start를 0이나 ,10으로 맞춤 or end 값까지
	while (start % 10&& start <= end) {
		calc(start, s);
		start++;
	}
	if (start > end) {
		return;
	}
	//end를 9로 맞춤or start값까지
	while (end % 10 != 9 && start <= end) {
		calc(end, s);
		end--;
	}
	//총 몇개가 있는지(10단위로)
	int cnt = end / 10 - start / 10 + 1;
	for (int i = 0; i <= 9; i++) {
		number[i] += cnt *s;
	}
	func(start / 10, end / 10, s * 10);
}
int main() {
	cin >> n;
	func(1, n, 1);
	for (int i = 0; i <= 9; i++) {
		cout << number[i] << " ";
	}
}
