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
		cout << ar.front() << " ";
		ar.pop();
		int next = ar.front();
		ar.pop();
		ar.push(next);
	}
	cout << ar.front() << " ";

}
