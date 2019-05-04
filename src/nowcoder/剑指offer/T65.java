package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 11:49
 * @Description: 矩阵中的路径
 **/
public class T65 {
	public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		char[][] m = new char[rows][cols];
		int[][] flag;
		int k = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				m[i][j] = matrix[k++];
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (m[i][j] == str[0]) {
					flag = new int[rows][cols];                //   需要每次进行初始化,否则上一次标记过的点在下一次仍然处于标记的状态
					if (findWorld(m, i, j, str, 0, flag)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean findWorld(char[][] board, int i, int j, char[] str, int x, int[][] flag) {

		if (x > str.length - 1) {
			return true;
		}
		if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && x < str.length && flag[i][j] != 1 && board[i][j]==str[x]) {
			flag[i][j] = 1;
			x++;
			return findWorld(board, i + 1, j, str, x, flag)
				|| findWorld(board, i - 1, j, str, x, flag)
				|| findWorld(board, i, j + 1, str, x, flag)
				|| findWorld(board, i, j - 1, str, x, flag);
//			return findWorld(board, i + 1, j, str, ++x, flag)
//				|| findWorld(board, i - 1, j, str, ++x, flag)
//				|| findWorld(board, i, j + 1, str, ++x, flag)
//				|| findWorld(board, i, j - 1, str, ++x, flag);
		}
		return false;
	}


	public static void main(String[] args) {
		char[] chars = "ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray();
//		char[] re = "bcced".toCharArray();
		char[] re = "SGGFIECVAASABCEHJIGQEM".toCharArray();
		System.out.println(hasPath(chars, 5, 8, re));
	}
}
