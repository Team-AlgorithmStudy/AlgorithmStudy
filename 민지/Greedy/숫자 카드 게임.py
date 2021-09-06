# 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임
# 조건 1) 숫자가 쓰인 카드들이 N * M 형태로 놓여있다 -> N : 행(세로)의 개수/ M(가로) : 열의 개수
# 조건 2) 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다
# 조건 3) 그다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다
# 조건 4) 처음에 카드를 골라낼 행을 선택할 때 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다
# 입력조건 : 첫째 줄에 숫자 카드들이 놓인 행의 개수 N과 열의개수 M이 자연수로 주어진다, 둘째 줄부터 N개의 줄에 걸쳐 각 카드에 적힌 숫자가 주어진다 숫자는 1이상 10,000 이하의 자연수이다
# 출력조건 : 첫째 줄에 게임의 룰에 맞게 선택한 카드에 적힌 숫자를 출력한다
# 입력예시   | 출력 예시
# 3 3      | 2
# 3 1 2    |
# 4 1 4    |
# 2 2 2    |
import sys
N,M = map(int,sys.stdin.readline().split())

answer = 0

# min 함수 사용
for i in range(N):
    data = list(map(int,sys.stdin.readline().split()))
    emp = min(data)
    answer = max(answer,emp)

print(answer)

# 2중 for문 사용
result = 0

for i in range(N) :
    data2= list(map(int,sys.stdin.readline().split()))
    # 현재 줄에서 가장 작은수 찾기
    min_value = 1001
    for a in data2 :
        min_value = min(min_value,a)
        # 가장 작은 수 들 중에서 가장 큰 수 찾기
        result = max(result,min_value)

print(result)