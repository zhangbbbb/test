package test;

import java.util.ArrayList;
import java.util.List;

public class D24 {
/**
 * 剪绳子，剪成m段，计算所有段长的乘积
 * @param n
 * @return
 */
//方法一：
//	1、当n≤3 时，按照规则应不切分，但由于题目要求必须剪成m>1 段，因此必须剪出一段长度为 1 的绳子，即返回 n−1 。
//	2、当n>3 时，求 n 除以 3 的 整数部分a和余数部分b （即 n=3a+b ），并分为以下三种情况：
//		当b=0 时，直接返回 3^a
//		当b=1 时，要将一个 1  转换为 2+2，因此返回 3^{a-1}×4；
//		当b=2 时，返回 3^a×2。
//	public int cuttingRope(int n) {
//		if(n<=3) {
//			return n-1;
//		}
//		int res = 0;
//		int a = n/3,b = n%3;
//		if (b==1) {
//			res=(int) Math.pow(3, a-1)*4;
//		}else if(b==2) {
//			res = (int) (Math.pow(3, a)*2);
//		}else {
//			res = (int) (Math.pow(3, a));
//		}
//		return res;
//    }
//方法二：贪心
//	public int cuttingRope(int n) {
//		if(n<=3) {
//			return n-1;
//		}
//		int res = 1;
//		while(n>4) {//切记要>4，n=4时，不用再分解为3和1，直接*4即可（2*2）
//			n-=3;
//			res*=3;
//		}
//		return res*n;
//	}
//方法三：动态规划 不懂
//	public int cuttingRope(int n) {
//		int[] dp = new int[n+1];
//		dp[2] =1;//dp[i]表示长度为i的绳子剪成m段后的最大乘积，初始化dp[2] = 1
//		for (int i = 3; i < n+1; i++) {
//			//剪掉第一段（长度为j）如果只剪掉长度为1，对最后的乘积无任何增益，所以从长度为2开始剪
//			//剪了第一段后，剩下(i - j)长度可以剪也可以不剪。
//			//如果不剪的话长度乘积即为j * (i - j)；
//			//如果剪的话长度乘积即为j * dp[i - j]。
//			//取两者最大值max(j * (i - j), j * dp[i - j])
//			for (int j = 2; j < i; j++) {
//				dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
//			}
//		}
//		return dp[n];
//	}
	
/**
 * 和为target的连续数组
 * @param target
 * @return
 */
//	public int[][] findContinuousSequence(int target) {
//		List<int[]> list = new ArrayList<int[]>();
//		int length = target / 2 + 1, sum = 0;// 向上取整，比如9=4+5
//		for (int i = 1; i < length; i++) {// 外层最大不到一半4.5所以4
//			sum = 0;// sum清空
//			for (int j = i; j <= length; j++) {// 但是内层得到5
//				sum += j;
//				if (sum > target) {
//					break;
//				}
//				if (sum == target) {
//					int[] arr = new int[j - i + 1];
//					for (int k = i; k <= j; k++) {
//						arr[k - i] = k;
//					}
//					list.add(arr);
//					break;// 记得break
//				}
//
//			}
//		}
//		return list.toArray(new int[list.size()][]);
//	}
//方法二：滑动窗口
//	思想：i j都从第一个数开始，累积【i，j】区间的和。
//	如果<target就j向右移动，加上j；如果>target.i也向右移动，减掉i
//	public int[][] findContinuousSequence(int target) {
//		int i = 1,j = 1;//滑动窗口左边界i，滑动窗口右边界j
//		int sum = 0;//滑动窗口中数字和
//		List<int[]> list = new ArrayList<int[]>();
//		
//		while(i<=target/2) {
//			if(sum<target) {
//				sum+=j;
//				j++;
//			}else if(sum>target){
//				sum-=i;
//				i++;
//			}else if(sum==target) {
//				int[] arr = new int[j-i];//sum后又进行了j++，其实j已经+1了
//				for (int k = i; k <j; k++) {
//					arr[k-i] = k; 
//				}
//				list.add(arr);//一定要更新sum的值，要不然会死循环下去
//				sum = sum-i;//不可能以这个i开始了
//				i++;
//			}
//		}
//		return list.toArray(new int[list.size()][]);
//	}
/**
 * 圆圈最后剩下的数字
 * @param n
 * @param m
 * @return
 */
//	public int lastRemaining(int n, int m) {
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = i;
//		}
//		while(arr.length!=0) {
//			arr[]
//		}
//    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
