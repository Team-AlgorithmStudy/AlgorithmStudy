#include<iostream>
#include<queue>
#include<deque>
using namespace std;
bool map[101][101];
bool apple[101][101];
int ax[] = { -1,0,1,0 };
int ay[] = { 0,-1,0,1 };
int n, k, l;
int main() {
	cin >> n >> k;
	for (int i = 0; i < k; i++) {
		int row, column;
		cin >> row >> column;
		apple[row][column] = true;
	}
	cin >> l;
	queue<pair<int, int>>direction;
	for (int i = 0; i < l; i++) {
		int time;
		char d;
		cin >> time >> d;
		if (d == 'D') {
			direction.push(make_pair(time, 1));
		}
		else {
			direction.push(make_pair(time, -1));
		}
	}
	deque<pair<int, int>>snake;
	snake.push_back(make_pair(1, 1));
	map[1][1] = true;
	int time = 0;
	int index = 2;
	while (1) {
		int nexty = snake.back().first + ay[index];
		int nextx = snake.back().second + ax[index];
		time++;
		if (!direction.empty()&&direction.front().first == time) {
			index += direction.front().second;
			direction.pop();
			if (index < 0) {
				index = 3;
			}
			if (index > 3) {
				index = 0;
			}
		}
		if (nexty > 0 && nexty <= n && nextx > 0 && nextx <= n && !map[nexty][nextx]) {

		}
		else {

			break;
		}
		if (apple[nexty][nextx]) {
			apple[nexty][nextx] = false;
			snake.push_back(make_pair(nexty, nextx));
			map[nexty][nextx] = true;
		}
		else {
			if (map[nexty][nextx]) {
				break;
			}
			map[snake.front().first][snake.front().second] = false;
			map[nexty][nextx] = true;
			snake.push_back(make_pair(nexty, nextx));
			snake.pop_front();
		}
	}
	cout << time;
}
