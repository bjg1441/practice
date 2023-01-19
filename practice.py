num=int(input())
arr=[[0]*num for i in range(num)]
count=0
max=0
for i in range(num):
    tmp=input()
    for j in range(num):
        if tmp[j]=="Y":
             arr[i][j]=1
        else:
            arr[i][j]=10000000

for k in range(num):
    for i in range(num):
        for j in range(num):
            arr[i][j]=min(arr[i][j],arr[i][k]+arr[k][j])

def min(a:int,b:int):
    if a>b:
        return b
    else:
        return a

for i in range(num):
    count=0
    for j in range(num):
        if arr[i][j]<=2 and i!=j:
            count+=1
    if count>max:
        max=count

print(max)