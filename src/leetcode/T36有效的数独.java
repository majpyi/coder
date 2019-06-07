package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-27 10:58
 * @Description: https://leetcode-cn.com/problems/valid-sudoku/solution/
 **/
public class T36有效的数独 {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board.length; j++) {
			for (int j = 0; j < board[0].length; j++) {
//				if (board[i,j]!='.'){
				if (board[i][j] != '.') {
					char c = board[i][j];
					board[i][j] = '.';
					if (!isValid(board, i, j, c)) {
						return false;
					}
					board[i][j] = c;
				}
			}
		}
		return true;
	}


	private boolean isValid(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == c) {
				return false;
			}
			if (board[row][i] == c) {
				return false;
			}
			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c ){
				return false;
			}
		}
		return true;
	}
}
