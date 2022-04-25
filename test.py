from matplotlib.pyplot import vlines
import numpy as np
import math

from sympy import fibonacci

A = np.array([[1,3,4,5],[2,2,4,3],[-1,1,3,-6],[0,-4,-3,5]])
def req1(A):
    temp = []
    for i in A:
        temp.append(sum(i))
    mx = max(temp)
    result = []
    for i in A:
        if sum(i) == mx:
            result.append(i)
    return result

def req2(A):
    result = 0
    for i in range(len(A)):
        result += fibonacci(A[i][i])
        print(fibonacci(A[i][i]))
    return result

def req3(A):
    dict = {}
    for i in A:
        for j in i:
            if j%2==1 and j not in dict:
                dict[j] = 1
            elif j%2==1 and j in dict:
                dict[j] +=1
    tempVar = 0
    temp = [key for key,i in dict.items() if i==max(dict.values())]
    if dict == {}:
        tempVar = 1000
    else:
        tempVar = temp[0]
    #Option 1
    result = np.where(A<0,tempVar,A)
    #Option 2
    # for i in range(len(result)):
    #     for j in range(len(result[i])):
    #         if result[i][j] < 0: 
    #             result[i][j] = tempVar
    return result

def req4(A,k):
    for i in range(len(A)):
        for j in range(len(A[i])):
            if A[i][j] > k:
                A[i][j] = 1
            else:
                A[i][j] = 0
    for i in range(len(A)):
        for j in range(len(A[i])):
            if A[i][j] == 0:
                continue
            elif A[i][j] == 1 and i==0 and j==0:
                if 0 not in [A[i+1][j],A[i][j+1]]:
                    A[i][j] += (A[i+1][j] + A[i][j+1])
            elif A[i][j] == 1 and i==0 and j==len(A[i])-1:
                if 0 not in [A[i+1][j],A[i][j-1]]:
                    A[i][j] += (A[i+1][j] + A[i][j-1])
            elif A[i][j] == 1 and i==len(A)-1 and j==0:
                if 0 not in [A[i-1][j],A[i][j+1]]:
                    A[i][j] += (A[i-1][j] + A[i][j+1])
            elif A[i][j] == 1 and i==len(A)-1 and j==len(A[i])-1:
                if 0 not in [A[i-1][j],A[i][j-1]]:  
                    A[i][j] += (A[i-1][j] + A[i][j-1])
            elif A[i][j] == 1 and j==0 and i!=0 and i!=len(A)-1:
                if 0 not in [A[i+1][j],A[i][j+1],A[i-1][j]]:
                    A[i][j] += (A[i+1][j] + A[i][j+1] + A[i-1][j])
            elif A[i][j] == 1 and j==len(A[i])-1 and i!=0 and i!=len(A)-1:
                if 0 not in [A[i+1][j],A[i][j-1],A[i-1][j]]:
                    A[i][j] += (A[i+1][j] + A[i][j-1] + A[i-1][j])
            elif A[i][j] == 1 and i!=0 and i!=len(A)-1 and j!=0 and j!=len(A[i])-1:
                if 0 not in [A[i+1][j],A[i][j+1],A[i-1][j],A[i][j-1]]:
                    A[i][j] += (A[i+1][j] + A[i][j+1] + A[i][j-1] + A[i-1][j])
    return A

print(req4(A,2))