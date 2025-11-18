def solution(n):
    root = int(n**(1/2))
    answer = 1 if root*root == n else 2
    return answer