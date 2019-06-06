package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 16:21
 * @Description:
 **/
public class T1479能否到达终点 {
	public boolean reachEndpoint(int[][] map) {
		// Write your code here
		//  一定要传入一个tag标记的信息，这样可以把那些已经走过的点就不重复走了，不然以前走过的点没有进行记录，还是会继续走
		int[][] tag = new int[map.length][map[0].length];
		return dfs(map, 0, 0, tag);
	}

	private boolean dfs(int[][] map, int i, int j, int[][] tag) {
		if (i < 0 || i > map.length - 1 || j < 0 || j > map[0].length - 1 || map[i][j] == 0 || tag[i][j] == 1) {
			return false;
		}
		tag[i][j] = 1;
		if (map[i][j] == 9) {
			return true;
		}
		return dfs(map, i - 1, j, tag) || dfs(map, i + 1, j, tag) || dfs(map, i, j - 1, tag) || dfs(map, i, j + 1,
			tag);
	}



	//  下面的算法就会进入死循环
	public boolean reachEndpoint1(int[][] map) {
		// Write your code here
		//  一定要传入一个tag标记的信息，这样可以把那些已经走过的点就不重复走了，不然以前走过的点没有进行记录，还是会继续走
		return dfs1(map, 0, 0);
	}

	private boolean dfs1(int[][] map, int i, int j) {
		if (i < 0 || i > map.length - 1 || j < 0 || j > map[0].length - 1 || map[i][j] == 0) {
			return false;
		}
		if (map[i][j] == 9) {
			return true;
		}
		return dfs1(map, i - 1, j) || dfs1(map, i + 1, j) || dfs1(map, i, j - 1) || dfs1(map, i, j + 1);
	}

}
