#include <string>
#include <vector>
#include <algorithm>
#include <math.h>
#include <iostream>
using namespace std;
static bool check[10000000];
vector<int>sosu;
int num[10] = { 0, };
int ar[10];
void init(string number) {
	for (int i = 2; i <= 9999999; i++) {
		if (!check[i]) {
			sosu.push_back(i);
			for (int j = i + i; j <= 9999999; j += i) {
				check[j] = true;
			}
		}
	}
	for (int i = 0; i < number.size(); i++) {
		num[number[i] - '0']++;
	}
}
void  change() {
	for (int i = 0; i < 10; i++) {
		ar[i] = num[i];
	}

}
int check1(int a) {
	while (a != 0) {
		int k = a %10;
		if (ar[k] <= 0) {
			return 0;
		}
		a /= 10;
		ar[k]--;
	}
	return 1;
}
int solution(string numbers) {
	int answer = 0;
	init(numbers);
	change();
	int maxNum = pow(10, numbers.size());
	for (int i = 0; i < sosu.size(); i++) {
		if (sosu[i] > maxNum) {
			break;
		}
		answer += check1(sosu[i]);
		change();
	}
	return answer;
}
