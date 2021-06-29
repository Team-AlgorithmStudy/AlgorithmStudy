#include<iostream>
#include<cmath>
using namespace std;
int a, b, v;
int main() {
	cin >> a >> b >> v;
	//마지막날,날짜
	int last,num;
	last = v - a;
	num = last /( a - b);
	if (last %(a - b) != 0) {
		num++;
	}
  //마지막날
	num++;
	cout << num;
}
