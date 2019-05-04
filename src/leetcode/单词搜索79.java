package leetcode;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-02-27 21:02
 * @Description: https://leetcode-cn.com/problems/word-search/
 **/
public class 单词搜索79 {
	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				Set<List<Integer>> set = new HashSet<>();
				if (board[i][j] == word.charAt(0)) {
//					h[i][j] =1;
//					ArrayList<Integer> r = new ArrayList<>();
//					r.add(i);
//					r.add(j);
//					set.add(r);
					if (findWorld(board, i, j, word, 1, set)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean findWorld(char[][] board, int i, int j, String world, int x, Set<List<Integer>> set) {
		ArrayList<Integer> r = new ArrayList<>();
		r.add(i);
		r.add(j);
		set.add(r);

		if (set.size() == world.length()) {
			return true;
		}
//		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || x > world.length() - 1) {
//			return false;
//		}
//		if (i - 1 >= 0 && i - 1 < board.length && j >= 0 && j < board[0].length && x < world.length() && board[i - 1][j] == world.charAt(x)) {
		if (i - 1 >= 0 && i - 1 < board.length && j >= 0 && j < board[0].length && set.size() < world.length() && board[i - 1][j] == world.charAt(set.size())) {
//			h[i - 1][j]=1;
			ArrayList<Integer> a = new ArrayList<>();
			a.add(i-1);
			a.add(j);
			if (findWorld(board, i - 1, j, world, ++x, set) && !set.contains(a))
				return true;
//			set.remove(r);
			x--;
		}
//		if (i + 1 >= 0 && i + 1 < board.length && j >= 0 && j < board[0].length && x < world.length() && board[i + 1][j] == world.charAt(x)) {
		if (i + 1 >= 0 && i + 1 < board.length && j >= 0 && j < board[0].length && set.size() < world.length() && board[i + 1][j] == world.charAt(set.size())) {
//			h[i + 1][j]==1;
			ArrayList<Integer> b = new ArrayList<>();
			b.add(i+1);
			b.add(j);
			if (findWorld(board, i + 1, j, world, ++x, set) && !set.contains(b))
				return true;
//			set.remove(r);
			x--;
		}
//		if (i >= 0 && i < board.length && j - 1 >= 0 && j - 1 < board[0].length && x < world.length() && board[i][j - 1] == world.charAt(x)) {
		if (i >= 0 && i < board.length && j - 1 >= 0 && j - 1 < board[0].length && set.size() < world.length() && board[i][j - 1] == world.charAt(set.size())) {
			ArrayList<Integer> c = new ArrayList<>();
			c.add(i);
			c.add(j-1);
			if (findWorld(board, i, j - 1, world, ++x, set)&& !set.contains(c))
				return true;
//			set.remove(r);
			x--;
		}
//		if (i >= 0 && i < board.length && j + 1 >= 0 && j + 1 < board[0].length && x < world.length() && board[i][j + 1] == world.charAt(x)) {
		if (i >= 0 && i < board.length && j + 1 >= 0 && j + 1 < board[0].length && set.size() < world.length() && board[i][j + 1] == world.charAt(set.size())) {
			ArrayList<Integer> d = new ArrayList<>();
			d.add(i);
			d.add(j+1);
			if (findWorld(board, i, j + 1, world, ++x, set)&& !set.contains(d))
				return true;
//			set.remove(r);
			x--;
		}
		set.remove(r);
//		x=x-2;
		return false;
	}

//	private static boolean findWorld1(char[][] board, int i, int j, String world, int x) {
//		if (x > world.length() - 1) {
//			return true;
//		}
////		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || x > world.length() - 1) {
////			return false;
////		}
//		if (i - 1 >= 0 && i - 1 < board.length && j >= 0 && j < board[0].length && x < world.length() && board[i - 1][j] == world.charAt(x)) {
//			findWorld(board, i - 1, j, world, ++x);
//		}
//		if (i + 1 >= 0 && i + 1 < board.length && j >= 0 && j < board[0].length && x < world.length() && board[i + 1][j] == world.charAt(x)) {
//			findWorld(board, i + 1, j, world, ++x);
//		}
//		if (i >= 0 && i < board.length && j - 1 >= 0 && j - 1 < board[0].length && x < world.length() && board[i][j - 1] == world.charAt(x)) {
//			findWorld(board, i, j - 1, world, ++x);
//		}
//		if (i >= 0 && i < board.length && j + 1 >= 0 && j + 1 < board[0].length && x < world.length() && board[i][j + 1] == world.charAt(x)) {
//			findWorld(board, i, j + 1, world, ++x);
//		}
//		return false;
//	}


	public static void main(String[] args) {
		char[][] board = {
			{'A','B','C','E'},
			{'S','F','E','S'},
			{'A','D','E','E'}
		};

		String word = "ABCESEEEFS";
//		String word = "ABC";
		System.out.println(exist(board, word));
	}
}
