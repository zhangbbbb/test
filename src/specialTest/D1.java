package specialTest;

public class D1 {
/**
 * ��������
 * ����ʹ�� * �� ����
 * @param a
 * @param b
 * @return
 */
//����һ�������������(ֻ�ʺ϶����������� û���Ǹ���)
//	public int divide(int a, int b) {
//		int res = 0;
//		while(a>=b) {
//			a-=b;
//			res++;
//		}
//		return res;
//	}
//���ⷽ��һ������������� (��Χ��-2^31--2^31-1)
	public int divide(int a, int b) {
		//���⴦�� -2^31/-1 = 2^31 ���
		if(a == 0x80000000 && b == -1) {
			return 0x7FFFFFFF;
		}
		
		int negative = 2;//��¼��������
		//�жϱ�����
		if(a>0) {
			negative--;
			a = -a;
		}
		//�жϳ���
		if (b>0) {
			negative--;
			b = -b;
		}
		
		int res = 0;
		while(a<=b) {
			a-=b;
			res++;
		}
		return negative==1?-res:res;
	}
/**
 * �����Ƽӷ�
 * @param a
 * @param b
 * @return
 */
//	public String addBinary(String a, String b) {
//		StringBuilder sb = new StringBuilder();
//		int i = a.length()-1,j=b.length()-1;
//		int carry = 0;
//		while (i>=0||j>=0) {
//			int n1 = i>=0?a.charAt(i)-'0':0;
//			int n2 = j>=0?b.charAt(j)-'0':0;
//			int tmp = n1+n2+carry;
//			carry = tmp/2;
//			sb.append(tmp%2);
//			i--;j--;//������ѭ��
//		}
//		if(carry==1) {
//			sb.append(1);
//		}
//		return sb.reverse().toString();
//	}
	
/**
 * ǰn������ ��������1�ĸ���
https://leetcode-cn.com/problems/w3tCBm/
 * @param n
 * @return
 */
	public int[] countBits(int n) {
		int[] res = new int[n+1];
		int x = n,j=0;
		while(x>=1) {
			x/=2;
			j++;
		}
		System.out.println("j="+j);
		while(n>=0) {
			int m = 1,count = 0;
			for (int i = 0; i < j; i++) {
				if((n&(m<<i))==1) {
					count++;
				}else {
					continue;
				}
			}
			res[n] = count; 
			n--;
		}
		return res;
    }
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
