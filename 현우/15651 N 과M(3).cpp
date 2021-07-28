#include<iostream>
using namespace std;
int n, m;
int check[10];
void func1() {
	for (int i = 1; i <= m; i++) {
			cout << check[i] << " ";
	}
	cout << "\n";
}
void func(int num) {
	if (num == m+1) {
		func1();
		return;
	}
	for (int i = 1; i <= n; i++) {
		check[num] =i;
		func(num + 1);
		
		
	}
}
int main() {
	cin >> n >> m;
	func(1);
}
