package test;

import java.util.LinkedList;
import java.util.Queue;

public class D14 {
/**
 * ����ɨ�赥�ʲ�����Ŀ�굥��ƥ���
 */
	
//����һ��dfs	
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
//			if(k==words.length-1) {//��������
//				return true;
//			}
//			board[i][j]='\0';//����Ȱ��ù������λ������ǣ�����һ��˵�������board[i][j]=words[k]��һ���ٰ���������
//			boolean res = dfs(board, words, i+1, j, k+1)||dfs(board, words, i-1, j, k+1)||
//							dfs(board, words, i, j-1, k+1)||dfs(board, words, i, j+1, k+1);//�����ĸ������ҵ�һ��Ϊֹ
//			
//			board[i][j] = words[k];
//			return res;
//		}
	
	
//���������������� dfs
//	boolean res = false;
//	int m, n, len;
//	boolean[][] f;
//	char[] s;
//	char[][] b;
//
//	public boolean exist(char[][] board, String word) {
//		b = board;
//		s = word.toCharArray();
//		// Ŀ�괮�ĳ���
//		len = s.length;
//		m = board.length;
//		n = board[0].length;
//		// ��¼���������еĸ����Ƿ��ù�
//		f = new boolean[m][n];
//
//		// ���ҵ���Ŀ�괮��һ���ַ���ͬ�ĸ���
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if (s[0] == board[i][j]) {
//					f[i][j] = true;
//					dfs(1, i, j);
//					f[i][j] = false;
//				}
//				// ÿ���������ж��Ƿ��Ѿ��ҵ�
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
//		// ��������
//		int[] dx = { 0, 1, 0, -1 };
//		int[] dy = { 1, 0, -1, 0 };
//
//		for (int d = 0; d < 4; d++) {
//			int x = i + dx[d], y = j + dy[d];
//
//			// ����Խ�� or ��ǰ�����ѱ�ʹ����
//			if (x < 0 || y < 0 || x >= n || y >= m || f[x][y]) {
//				continue;
//			}
//
//			if (b[x][y] == s[u]) {
//				f[x][y] = true;
//				dfs(u + 1, x, y);
//				f[x][y] = false;//δ����
//			}
//		}
//
//	}
	
//������myself
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
 * �������߸��ӱ���
 */
//����һ��dfs
//	public int movingCount(int m, int n, int k) {
//		boolean[][] vis = new boolean[m][n];//��ʱ������¼�Ƿ񱻷��ʹ�
//		return dfs(0,0,m,n,k,vis);
//	}
//	public int dfs(int i,int j,int m,int n,int k,boolean[][] vis) {
//		if(i>=m||j>=n||(get(i)+get(j))>k||vis[i][j]) {//�жϱ߽� �жϵ�ǰ�����Ƿ񱻷��ʹ�
//			return 0;
//		}
//		vis[i][j] = true;//���ʹ�
//		return 1+dfs(i+1, j, m, n, k, vis)+dfs(i, j+1, m, n, k, vis);//���ŵ�ǰ�������º����Ҽ�������
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
//��������bfs û��
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
//			//�ѵ�ǰ�����±߸��ӵ�������뵽������
//			queue.add(new int[] {i+1,j});
//			//�ѵ�ǰ�����ұ߸��ӵ�������뵽������
//			queue.add(new int[] {i,j+1});
//			
//		}
//		return res;
//	}
	
	
}
