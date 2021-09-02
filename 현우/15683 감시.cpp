#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, m;
vector<vector<int>>map;
vector<vector<int>>ex;
vector<pair<int, int>> cameraSee;
vector<pair<int,int>>camera;
vector<int>cameraAngle;
bool visited[8][8][4];
int answer = 987654321;
int checkArea() {
	int cnt = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (ex[i][j] == 0) {
				cnt++;
			}
		}
	}
	return cnt;
}
void initArray() {
	ex = map;
}
void serachMap(int cnt) {
	if (cnt == camera.size()) {
		for (int i = 0; i < camera.size(); i++) {
			int y = camera[i].first;
			int x = camera[i].second;
			for (int j = 0; j < 4; j++) {
				if (visited[y][x][j]) {
					int nextY = y + cameraSee[(cameraAngle[i] + j) % 4].first;
					int nextX = x + cameraSee[(cameraAngle[i] + j) % 4].second;
					while (1) {
						if (nextY < 0 || nextX < 0 || nextY >= n || nextX >= m) {
							break;
						}
						if (ex[nextY][nextX] == 6) {
							break;
						}
						if (ex[nextY][nextX] == 0) {
							ex[nextY][nextX] = -1;
						}
						nextY+= cameraSee[(cameraAngle[i] + j) % 4].first;
						nextX+= cameraSee[(cameraAngle[i] + j) % 4].second;
					}
				}
				
			}
		}
		answer = min(answer, checkArea());
		initArray();
		return;
	}
	for (int i = 0; i < 4; i++) {
		cameraAngle.push_back(i);
		serachMap(cnt + 1);
		cameraAngle.pop_back();
	}
}
int main() {
	cameraSee.push_back(make_pair(0, 1));
	cameraSee.push_back(make_pair(-1,0));
	cameraSee.push_back(make_pair(0, -1));
	cameraSee.push_back(make_pair(1, 0));
	cin >> n >> m;
	for (int i = 1; i <= n; i++) {
		vector<int>row;
		for (int j = 1; j <= m; j++) {
			int a;
			cin >> a;
			row.push_back(a);
			if (a >= 1 && a <= 5) {
				camera.push_back(make_pair(i - 1, j - 1));
				switch (a)
				{
				case 1:
					visited[i-1][j-1][0] = true;
					break;
				case 2:
					visited[i-1][j-1][0] = true;
					visited[i-1][j-1][2] = true;
					break;
				case 3:
					visited[i-1][j-1][0] = true;
					visited[i-1][j-1][1] = true;
					break;
				case 4:
					visited[i-1][j-1][0] = true;
					visited[i-1][j-1][1] = true;
					visited[i-1][j-1][2] = true;
					break;
				case 5:
					visited[i-1][j-1][0] = true;
					visited[i-1][j-1][1] = true;
					visited[i-1][j-1][2] = true;
					visited[i-1][j-1][3] = true;
					break;
				}
			}
		}
		map.push_back(row);
	}
	initArray();
	serachMap(0);
	cout << answer;
}
