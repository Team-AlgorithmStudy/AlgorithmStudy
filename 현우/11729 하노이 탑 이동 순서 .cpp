#include<iostream>
#include<stack>
#include<cmath>
using namespace std;
int k;
void hanoi(int n, int from, int by, int to) {
	if (n == 1) {
		cout << from << " " << to<<"\n";
	}
	else {
		hanoi(n - 1, from, to, by);
		cout << from << " " << to<<"\n";
		hanoi(n - 1, by, from, to);
	}
}
int main() {
	cin >> k;
	int j = pow(2, k) - 1;
	cout << j << "\n";
	hanoi(k, 1, 2, 3);
	
}
