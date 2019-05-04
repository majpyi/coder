package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-02-27 20:49
 * @Description: https://leetcode-cn.com/problems/implement-trie-prefix-tree/
 **/


//    依据数组进行的实现,好处是执行时间短,占用空间小,但是数组的大小仅为26只能存放26个小写字母不能扩展
class Trie {

	/**
	 * Initialize your data structure here.
	 */
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	/**
	 * Inserts a word into the trie.
	 */
	public void insert(String word) {
		TrieNode ws = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (ws.children[c - 'a'] == null) {
				ws.children[c - 'a'] = new TrieNode(c);
			}
			ws = ws.children[c - 'a'];
		}
		ws.isWorld = true;
	}

	/**
	 * Returns if the word is in the trie.
	 */
	public boolean search(String word) {
		TrieNode ws = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (ws.children[c - 'a'] == null) {
				return false;
			}
			ws = ws.children[c - 'a'];
		}
		return ws.isWorld;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		TrieNode ws = root;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			if (ws.children[c - 'a'] == null) {
				return false;
			}
			ws = ws.children[c - 'a'];
		}
		return true;
	}
}

class TrieNode {
	private char val;
	boolean isWorld;
	TrieNode[] children = new TrieNode[26];

	TrieNode() {
	}

	TrieNode(char c) {
		TrieNode node = new TrieNode();
		node.val = c;
	}
}

//    依据Map进行的实现,执行时间长,占用空间大,但是可能任意输入字符,扩展能力强
class Trie1 {

	 static HashMap<Character, HashMap> root;
	/**
	 * Initialize your data structure here.
	 */
//	private TrieNode1 root;
	public Trie1() {
		root = new HashMap<>();
	}

	/**
	 * Inserts a word into the trie.
	 */
	public void insert(String word) {
		HashMap<Character, HashMap> ws = root;
		for(char c : word.toCharArray()){
			if(!ws.containsKey(c)){
				ws.put(c,new HashMap());
			}
			ws = ws.get(c);
		}
		ws.put('#',new HashMap());
	}

	/**
	 * Returns if the word is in the trie.
	 */
	public boolean search(String word) {
		HashMap<Character, HashMap> ws = root;
		for(char c : word.toCharArray()){
			if(!ws.containsKey(c)){
				return false;
			}
			ws = ws.get(c);
		}
		return ws.containsKey('#');
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		HashMap<Character, HashMap> ws = root;
		for(char c : prefix.toCharArray()){
			if(!ws.containsKey(c)){
				return false;
			}
			ws = ws.get(c);
		}
		return true;
	}
}

