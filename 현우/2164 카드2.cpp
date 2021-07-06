#include<iostream>
#include<queue>
using namespace std;
int n;
int main() {
	cin >> n;
	queue<int>ar;
	for (int i = 1; i <= n; i++) {
		ar.push(i);
	}
	while (ar.size() != 1) {
		ar.pop();
		ar.push(ar.front());
		ar.pop();
	}
	cout << ar.front();
}
