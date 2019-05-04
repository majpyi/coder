package 华为;

/**
 * @Author: Mr.M
 * @Date: 2019-03-27 19:58
 * @Description:
 **/
public class T2 {
}


//import numpy as np
//	import math
//
//	pos = input().split(' ')
//	posx = [0]
//	posy = [0]
//	for i in range(5):
//	posx.append(int(pos[2 * i]))
//	posy.append(int(pos[2 * i + 1]))
//
//	dist = np.zeros((6,6))
//
//	# 计算距离矩阵
//	for i in range(6):
//	for j in range(6):
//	dist[i, j] = math.sqrt((posx[i] - posx[j])**2 + (posy[i] - posy[j])**2)
//
//
//	N = 6
//	path = np.ones((2 ** (N + 1), N))
//	dp = np.ones((2 ** (6 + 1), 6)) * -1
//
//
//	def TSP(s, init, num):
//	if dp[s][init] != -1:
//	return dp[s][init]
//	if s == (1 << (N)):
//	return dist[0][init]
//	sumpath = 1000000000
//	for i in range(N):
//	if s & (1 << i):
//	m = TSP(s & (~(1 << i)), i, num + 1) + dist[i][init]
//	if m < sumpath:
//	sumpath = m
//	path[s][init] = i
//	dp[s][init] = sumpath
//	return dp[s][init]
//
//
//	init_point = 0
//	s = 0
//	for i in range(1, N + 1):
//	s = s | (1 << i)
//	distance = TSP(s, init_point, 0)
//	s = 0b11111111110
//	init = 0
//	num = 0
//	print(int(distance))
//	200 0 200 10 200 50 200 30 200 25
//	456
