package aaa;

public class Stack {
	/**
	 * �����ջ˳�����
	 * @param remainջ����ʣ���
	 * @param wait�ȴ���ջ��
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
