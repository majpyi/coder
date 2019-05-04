package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-02 13:37
 * @Description: https://leetcode-cn.com/problems/number-of-islands/
 **/
public class 岛屿的个数200 {
	public int numIslands(char[][] grid) {
		int num = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					num++;
					findnext(grid, i, j, num);
				}
			}
		}
		return num;
	}

	int x[] = {-1, +1, 0, 0};
	int y[] = {0, 0, -1, +1};
	// i+d[k]   ,  j+d[k+1]    d={0,1,-1,0}
	private void findnext(char[][] grid, int i, int j, int num) {
		grid[i][j] = 0;
		for (int k = 0; k < x.length; k++) {
			if (i + x[k] >= 0 && i + x[k] < grid.length && j + y[k] >= 0 && j + y[k] < grid[0].length && grid[i + x[k]][j + y[k]] == 1) {
				findnext(grid, i + x[k], j + y[k], num);
			}
		}
	}
}
