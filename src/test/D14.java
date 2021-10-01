package test;

import java.util.LinkedList;
import java.util.Queue;

public class D14 {
/**
 * 矩阵扫描单词查找与目标单词匹配的
 */
	
//方法一：dfs	
//		public boolean exist(char[][] board, String word) {
//			char[] words = word.toCharArray();
//			int len = words.length;
//			int m = board.length;
//			int n = board[0].length;
//			for(int i=0;i<m;i++) {
//				for (int j = 0; j < n; j++) {
//					if(dfs(board,words,i,j,0)) {
//						return true;
//					}
//				}
//				
//			}
//			return false;
//			
//		} 
//		public boolean dfs(char[][] board, char[] words,int i,int j,int k) {
//			if(i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]!=words[k]) {
//				return false;
//			}
//			if(k==words.length-1) {//遍历完了
//				return true;
//			}
//			board[i][j]='\0';//巧妙！先把用过的这个位置做标记，到这一步说明上面的board[i][j]=words[k]，一会再把它换回来
//			boolean res = dfs(board, words, i+1, j, k+1)||dfs(board, words, i-1, j, k+1)||
//							dfs(board, words, i, j-1, k+1)||dfs(board, words, i, j+1, k+1);//遍历四个方向，找到一个为止
//			
//			board[i][j] = words[k];
//			return res;
//		}
	
	
//方法二：定义数组 dfs
//	boolean res = false;
//	int m, n, len;
//	boolean[][] f;
//	char[] s;
//	char[][] b;
//
//	public boolean exist(char[][] board, String word) {
//		b = board;
//		s = word.toCharArray();
//		// 目标串的长度
//		len = s.length;
//		m = board.length;
//		n = board[0].length;
//		// 记录搜索过程中的格子是否被用过
//		f = new boolean[m][n];
//
//		// 先找到与目标串第一个字符相同的格子
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if (s[0] == board[i][j]) {
//					f[i][j] = true;
//					dfs(1, i, j);
//					f[i][j] = false;
//				}
//				// 每次搜索后判断是否已经找到
//				if (res) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//
//	public void dfs(int u, int i, int j) {
//		if (u == len || res) {
//			res = true;
//			return;
//		}
//
//		// 方向数组
//		int[] dx = { 0, 1, 0, -1 };
//		int[] dy = { 1, 0, -1, 0 };
//
//		for (int d = 0; d < 4; d++) {
//			int x = i + dx[d], y = j + dy[d];
//
//			// 坐标越界 or 当前格子已被使用了
//			if (x < 0 || y < 0 || x >= n || y >= m || f[x][y]) {
//				continue;
//			}
//
//			if (b[x][y] == s[u]) {
//				f[x][y] = true;
//				dfs(u + 1, x, y);
//				f[x][y] = false;//未看懂
//			}
//		}
//
//	}
	
//方法：myself
//	public boolean exist(char[][] board, String word) {
//	char[] words = word.toCharArray();
//	for (int i = 0; i < board.length; i++) {
//		for (int j = 0; j < board[0].length; j++) {
//			if (board[i][j] == words[0]) {
//				if(dfs(board.length, board[0].length, i, j, board, 0, words)) return true;
//			}
//		}
//	}
//	return false;
//}
//
//public boolean dfs(int m, int n, int i, int j, char[][] board, int k, char[] words) {
//	if (i >= m || j >= n || i < 0 || j < 0 || board[i][j] != words[k] || board[i][j] == '\0') {
//		return false;
//	}
//	k++;
//	board[i][j] = '\0';
//	if (k == words.length) {
//		return true;
//	}
//	if (i + 1 < m && dfs(m, n, i + 1, j, board, k, words)) {
//		return true;
//	}
//	if (i - 1 >= 0 && dfs(m, n, i - 1, j, board, k, words)) {
//		return true;
//	}
//	if (j + 1 < n && dfs(m, n, i, j + 1, board, k, words)) {
//		return true;
//	}
//	if (j - 1 >= 0 && dfs(m, n, i, j - 1, board, k, words)) {
//		return true;
//	}
//	board[i][j] = words[k];
//	return false;
//}
//	
//myself
//	public boolean exist(char[][] board, String word) {
//		char[] words = word.toCharArray();
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[0].length; j++) {
//				if (board[i][j] == words[0]) {
//					if(dfs(board.length, board[0].length, i, j, board, 0, words)) return true;
//				}
//			}
//		}
//		return false;
//	}
//
//	public boolean dfs(int m, int n, int i, int j, char[][] board, int k, char[] words) {
//		if (i >= m || j >= n || i < 0 || j < 0 || board[i][j] != words[k] || board[i][j] == '\0') {
//			return false;
//		}
//		k++;
//		board[i][j] = '\0';
//		if (k == words.length) {
//			return true;
//		}
//		int[] x = {0,1,0,-1};
//        int[] y = {1,0,-1,0};
//        for(int a = 0;a<4;a++){
//            if(dfs(m, n, i+x[a], j+y[a], board, k, words)) {
//            	return true;
//            }
//        }
//		
//		board[i][j] = words[k];
//		return false;
//	}

/*
 * 机器人走格子遍历
 */
//方法一：dfs
//	public int movingCount(int m, int n, int k) {
//		boolean[][] vis = new boolean[m][n];//临时变量记录是否被访问过
//		return dfs(0,0,m,n,k,vis);
//	}
//	public int dfs(int i,int j,int m,int n,int k,boolean[][] vis) {
//		if(i>=m||j>=n||(get(i)+get(j))>k||vis[i][j]) {//判断边界 判断当前格子是否被访问过
//			return 0;
//		}
//		vis[i][j] = true;//访问过
//		return 1+dfs(i+1, j, m, n, k, vis)+dfs(i, j+1, m, n, k, vis);//沿着当前盒子向下和向右继续访问
//	}
//	
//	public int get(int x) {
//		int sum = 0;
//		for(;x!=0;x/=10) {
//			sum+= x%10;
//		}
//		return sum;
//	}
//	
//	
//方法二：bfs 没懂
//	public int movingCount(int m, int n, int k) {
//		boolean vis[][] = new boolean[m][n];
//		int res = 0;
//		
//		Queue<int[]> queue = new LinkedList<int[]>();
//		queue.add(new int[] {0,0});
//		while(queue.size()>0) {
//			int[] x = queue.poll();
//			int i = x[0],j=x[1];
//			
//			if(i>=m||j>=n||(get(i)+get(j))>k||vis[i][j]) {
//				continue;
//			}
//			vis[i][j] = true;
//			res++;
//			//把当前格子下边格子的坐标加入到队列中
//			queue.add(new int[] {i+1,j});
//			//把当前格子右边格子的坐标加入到队列中
//			queue.add(new int[] {i,j+1});
//			
//		}
//		return res;
//	}
	
	
}
