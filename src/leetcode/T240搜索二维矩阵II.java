package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-25 14:18
 * @Description: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 **/
public class T240搜索二维矩阵II {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int x = 0;
		int y = matrix[0].length - 1;
		while (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length) {
			if (matrix[x][y] > target) {
				y--;
			} else if (matrix[x][y] < target) {
				x++;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(searchMatrix(arr,7));
	}
}
