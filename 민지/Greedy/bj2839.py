import sys

A = 5
B = 3

N = int(sys.stdin.readline())

count = 0

while True:
    if (N % A) == 0 :
        count += int(N / A)
        print(count)
        break
    N = N - B
    count += 1
    if N < 0 :
        print(-1)
        break
