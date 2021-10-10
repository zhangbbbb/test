package specialTest;

public class D1 {
/**
 * 整数除法
 * 不得使用 * 和 除号
 * @param a
 * @param b
 * @return
 */
//方法一：减法代替除法(只适合都是正数的情 没考虑负数)
//	public int divide(int a, int b) {
//		int res = 0;
//		while(a>=b) {
//			a-=b;
//			res++;
//		}
//		return res;
//	}
//正解方法一：减法代替除法 (范围：-2^31--2^31-1)
	public int divide(int a, int b) {
		//特殊处理 -2^31/-1 = 2^31 溢出
		if(a == 0x80000000 && b == -1) {
			return 0x7FFFFFFF;
		}
		
		int negative = 2;//记录正数个数
		//判断被除数
		if(a>0) {
			negative--;
			a = -a;
		}
		//判断除数
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
 * 二进制加法
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
//			i--;j--;//别忘了循环
//		}
//		if(carry==1) {
//			sb.append(1);
//		}
//		return sb.reverse().toString();
//	}
	
/**
 * 前n个数字 二进制中1的个数
https://leetcode-cn.com/problems/w3tCBm/
 * @param n
 * @return
 */
//方法一：动态规划
//	思路：当前数x 1的个数 = x/2的个数  + 第0位是否是1
//	public int[] countBits(int n) {
//		int[] res = new int[n+1];
//		//计算0--n
//		for (int i = 0; i < res.length; i++) {
//			res[i] = res[i>>1] + (i&1);
//		}
//		return res;
//	}
	
//动态规划 区分n是奇偶数
//	public int[] countBits(int n) {
//		int[] res = new int[n+1];
//		for (int i = 0; i < res.length; i++) {
//			//如果当前数i是偶数，就等于除2后1的个数
//			if (i%2==0) {
//				res[i] = res[i/2];
//			//如果当前数是奇数，就等于前一个偶数的加1
//			}else {
//				res[i] = res[i-1]+1;//让它变成偶数
//			}
//		}
//		return res;
//	}
//方法二：每一位分别进行的位运算
//	public int[] countBits(int n) {
//		int[] res = new int[n+1];
//		//计算出n的位数
//		int x = n,j=0;
//		while(x>=1) {
//			x/=2;
//			j++;
//		}
//		//循环0--n
//		for (int i = 0; i < res.length; i++) {
//			int count = 0;
//			//从i的第0位到第j-1位
//			for (int k = 0; k < j; k++) {
//				count += (i>>k)&1;//这里最好不要写i&(1<<k),当10&10时，值为2，不是1。计算的是对应的值。
//			}
//			res[i] = count; 
//		}
//		return res;
//    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
