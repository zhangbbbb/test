package test;

import java.util.Arrays;

public class D21 {
/**
 * �������������1�ĸ���
 * @param n
 * @return
 */

//����һ��myself����λ����
//	 public int hammingWeight(int n) {
//			int count = 0;
//			while(n!=0) {
//				count += n&1;
//				n>>>=1;
//			}
//			return count;
//	}
//
//����������� ����32λ���֣��Ƚ�32�Σ������λ��ʼ�Ƚϣ���&
//	public int hammingWeight(int n) {
//		int count=0;
//		for (int i = 0; i < 32; i++) {
//			if((n&(1<<i))!=0) {//&��������Ϊ1��Ϊ1������10100��20�� & 10000��16�����Ϊ16����ʵ�������λ��Ϊ1��ֻ������ʾʮ���Ƶ�ֵ�������Ե���Ϊ0ʱ��&�ɹ���
//				count++;
//			}
//		}
//		return count;
//	}
//

	
/**
 * ���á�+ - * /������������
 * @param a
 * @param b
 * @return
 */
//����һ��λ����
//	public static int add(int a, int b) {
//        while(b!=0) {
//        	int tmp = a^b;//�ǽ�λ��
//        	b = (a&b)<<1;//��λ ֻ��a=1 b=1 a&b=1 ����Ҫ��λ
//        	a = tmp; 
//        }
//        return a;
//    }

//���������ݹ� λ����
	public static int add(int a, int b) {
		if(a==0||b==0) {
			return a^b;
		}
		return add(a^b, (a&b)<<1);
	}
	
}
