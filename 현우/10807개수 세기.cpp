#include<iostream>
using namespace std;
//음수,양수를 포함하기위해서 201
int check[201] = { 0, };
int n, target;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int number;
		cin >> number;
		//음수부분을 0,양의정수로 만드는 과정
		number += 100;
		check[number]++;
	}
	cin >> target;
	target += 100;
	cout << check[target];
}