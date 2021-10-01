package aaa;

public class Stack {
	/**
	 * 计算出栈顺序个数
	 * @param remain栈里面剩余的
	 * @param wait等待入栈的
	 */
	public static void main(String[] args) {
		int res = count(2, 1);
		System.out.println(res);
	}
	public static int count(int remain,int wait) {
		if(wait==0) {
			return 1;
		}
		int res = count(remain+1, wait-1);
		if(remain!=0) {
			res += count(remain-1, wait);
		}
		return res;
	}
}
