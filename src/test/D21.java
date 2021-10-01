package test;

import java.util.Arrays;

public class D21 {
/**
 * 计算二进制数中1的个数
 * @param n
 * @return
 */

//方法一：myself，移位运算
//	 public int hammingWeight(int n) {
//			int count = 0;
//			while(n!=0) {
//				count += n&1;
//				n>>>=1;
//			}
//			return count;
//	}
//
//方法二：题解 给出32位数字，比较32次，从最低位开始比较，用&
//	public int hammingWeight(int n) {
//		int count=0;
//		for (int i = 0; i < 32; i++) {
//			if((n&(1<<i))!=0) {//&是两个都为1才为1，比如10100（20） & 10000（16）结果为16，其实就是最高位都为1（只不过显示十进制的值），所以当不为0时，&成功了
//				count++;
//			}
//		}
//		return count;
//	}
//

	
/**
 * 不用“+ - * /”计算两数和
 * @param a
 * @param b
 * @return
 */
//方法一：位运算
//	public static int add(int a, int b) {
//        while(b!=0) {
//        	int tmp = a^b;//非进位和
//        	b = (a&b)<<1;//进位 只有a=1 b=1 a&b=1 才需要进位
//        	a = tmp; 
//        }
//        return a;
//    }

//方法二：递归 位运算
	public static int add(int a, int b) {
		if(a==0||b==0) {
			return a^b;
		}
		return add(a^b, (a&b)<<1);
	}
	
}
