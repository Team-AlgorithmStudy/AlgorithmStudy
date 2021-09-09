import sys

A = 300
B = 60
C = 10

T = int(sys.stdin.readline())

Aresult = 0
Bresult = 0
Cresult = 0
while True :
    if T >= A :
        Aresult = int(T / A)
        T %= A
        if T == 0 :
            break
    elif T >= B :
        Bresult = int(T / B)
        T %= B
        if T == 0 :
            break
    elif T >= C :
        Cresult = int(T / C)
        T %= C
        if T == 0 :
            break
    else:
        print(-1)
        exit()

print(Aresult,Bresult,Cresult)