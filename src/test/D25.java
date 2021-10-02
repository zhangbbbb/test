package test;

import java.util.Stack;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class D25 {
/**
 * 顺时针打印矩阵
 * @param matrix
 * @return
 */
//思路：按着四个方向分别遍历
//	public int[] spiralOrder(int[][] matrix) {
//		if(matrix == null||matrix.length == 0 || matrix[0].length == 0) {
//			return  new int[0];
//		}
//		int m = matrix.length;
//		int n = matrix[0].length;
//		int[] res = new int[m*n];
//		int cur = 0;
//		int s=0,x=m-1,z=0,y=n-1;//上 下 左 右
//		while (z<=y && s<=x) {
//			for (int i = z; i <=y; i++) {  //左到右
//				res[cur++] = matrix[s][i];
//			}
//			s++;
//			for (int i = s; i <=x; i++) {  //上到下
//				res[cur++] = matrix[i][y];
//			}
//			y--;
//			for (int i = y; i >=z && x>=s; i--) {//因为第一个循环后对s做了改变，需要再判断还符合能进入while循环吗
//				res[cur++] = matrix[x][i];
//			}
//			x--;
//			for (int i = x; i >=s && z<=y; i--) {//因为第二个循环后对y做了改变
//				res[cur++] = matrix[i][z];
//			}
//			z++;//虽然第三个和第四个改变，但在进入第一个和第二个比较前，已经在while中比较过了
//		}
//		return res;
//	}
	
	
	
	
	
/**
 * 给出一个压栈和弹栈序列
 * 判断弹栈序列是否正确
 * @param pushed
 * @param popped
 * @return
 */
//	public boolean validateStackSequences(int[] pushed, int[] popped) {
//		Stack<Integer> stack = new Stack<Integer>();
//		int i = 0;
//		for (Integer pushNum : pushed) {
//			stack.push(pushNum);
//			while(!stack.isEmpty()&& stack.peek()== popped[i]) {//要用while，继续判断栈里的元素有没有是下一个pop的元素，一直没有的话，才继续压栈
//				stack.pop();
//				i++;
//			}
//		}
//		return stack.isEmpty();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
