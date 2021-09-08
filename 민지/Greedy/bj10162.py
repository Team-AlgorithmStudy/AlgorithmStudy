import sys

# A: 5분 B : 1분 C : 10초

A = 300
B = 60
C = 10

T = int(sys.stdin.readline())

aResult = 0

bResult = 0

cResult = 0

while T != 0 :
    if A <= T :
        aResult = int(T / A)
        # %= : 왼쪽 변수(T)에 오른쪽 값(A)을 나눈 후 그 나머지를 왼쪽 변수(T)에 할당한다
        T %= A
        if T == 0 :
            break
    elif B <= T :
        bResult = int(T / B)
        T %= B
        if T == 0 :
            break
    elif C <= T :
        cResult = int(T / C)
        T %= C
        if T == 0 :
            break
    else:
        print(-1)
        exit()

print(aResult, bResult,cResult)



