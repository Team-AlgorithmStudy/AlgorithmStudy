#include<iostream>
#include<stdio.h>
#include<string>
using namespace std;
int n;
double answer;
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		string line;
    //숫자받기
		scanf("%lf", &answer);
    //문자받기
		getline(cin, line);
		for (int j = 0; j < line.size(); j++) {
			if (line[j] == '@') {
				answer *= 3;
			}
			else if (line[j] == '%') {
				answer += 5;
			}
			else if (line[j] == '#') {
				answer -= 7;
			}
		}
		printf("%0.2lf\n", answer);
	}
}
