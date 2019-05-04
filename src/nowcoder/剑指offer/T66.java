package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 11:49
 * @Description: 机器人的运动范围
 **/
public class T66 {
	public int movingCount(int threshold, int rows, int cols) {
		int[][] flag = new int[rows][cols];
		return move(threshold, rows, cols, 0, 0, flag);
	}

	private int move(int threshold, int rows, int cols, int x, int y, int[][] flag) {
		if (x > rows - 1 || x < 0 || y < 0 || y > cols - 1 || numSum(x)+numSum(y) > threshold || flag[x][y] == 1) {
			return 0;
		}
		flag[x][y] = 1;
		return move(threshold, rows, cols, x + 1, y, flag)
				+ move(threshold, rows, cols, x, y + 1, flag)
				+ move(threshold, rows, cols, x - 1, y, flag)
				+ move(threshold, rows, cols, x, y - 1, flag) + 1;
	}

	private int numSum(int i) {
		int sum = 0;
		while (i != 0) {
			sum += i % 10;
			i = i / 10;
		}
		return sum;
	}



}
