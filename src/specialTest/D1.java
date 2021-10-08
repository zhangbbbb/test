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
//����һ����̬�滮
//	˼·����ǰ��x 1�ĸ��� = x/2�ĸ���  + ��0λ�Ƿ���1
//	public int[] countBits(int n) {
//		int[] res = new int[n+1];
//		//����0--n
//		for (int i = 0; i < res.length; i++) {
//			res[i] = res[i>>1] + (i&1);
//		}
//		return res;
//	}
	
//��̬�滮 ����n����ż��
//	public int[] countBits(int n) {
//		int[] res = new int[n+1];
//		for (int i = 0; i < res.length; i++) {
//			//�����ǰ��i��ż�����͵��ڳ�2��1�ĸ���
//			if (i%2==0) {
//				res[i] = res[i/2];
//			//�����ǰ�����������͵���ǰһ��ż���ļ�1
//			}else {
//				res[i] = res[i-1]+1;//�������ż��
//			}
//		}
//		return res;
//	}
//��������ÿһλ�ֱ���е�λ����
//	public int[] countBits(int n) {
//		int[] res = new int[n+1];
//		//�����n��λ��
//		int x = n,j=0;
//		while(x>=1) {
//			x/=2;
//			j++;
//		}
//		//ѭ��0--n
//		for (int i = 0; i < res.length; i++) {
//			int count = 0;
//			//��i�ĵ�0λ����j-1λ
//			for (int k = 0; k < j; k++) {
//				count += (i>>k)&1;//������ò�Ҫдi&(1<<k),��10&10ʱ��ֵΪ2������1��������Ƕ�Ӧ��ֵ��
//			}
//			res[i] = count; 
//		}
//		return res;
//    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
