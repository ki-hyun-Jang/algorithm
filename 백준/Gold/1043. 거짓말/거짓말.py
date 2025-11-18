from collections import deque

n,m=map(int, input().split())
lie = list(map(int, input().split()))
party = [list(map(int, input().split())) for _ in range(m)]
if lie[0]==0:
	print(m)
else:
	visited = [False for _ in range(m)]
	q = deque()
	liar = lie[1:]
	q.extend(liar)
	
	while q:
		k = q.popleft()
		for i in range(m):
			if k in party[i][1:] and visited[i]==False:
				visited[i]=True
				q.extend(party[i][1:])

	print(visited.count(False))