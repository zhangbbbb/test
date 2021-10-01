package test;

import java.util.HashMap;
import java.util.Map;

public class D22 {
/**
 * 返回数组中只出现过一次的数
 * @param nums
 * @return
 */
//方法一：哈希表存储
//	public static void main(String[] args) {
//		System.out.println(singleNumbers());
//	}
//    public static int[] singleNumbers() {
//    	int[] nums = {4,1,4,6};
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			if(map.containsKey(nums[i])) {
//				map.put(nums[i], 2);
//			}else {
//				map.put(nums[i], 1);
//			}
//		}
//		int[] res = new int[2];
//		int index = 1;
//		for (int i = 0; i < nums.length; i++) {
//			if(map.get(nums[i])==1) {
//				if(index>0) {
//					res[index] = nums[i];
//					index--;
//				}
//			}
//		}
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);
//		}
//		return res;
//	}

//方法二：位运算 nice
//	思路：1.先把所有的数进行异或运算，然后得到一个数sum。
//		2.从右往左移位，直到找到第一个是1的位，这一位说明是1 0异或得到的，所以用这一位来进行分组，这一位为1 的是x组，为0的是y组
//		3.分别对两个组异或运算，得到两个数x y，返回即可
//	public int[] singleNumbers(int[] nums) {
//		int sum = 0;
//		for (int num : nums) {
//			sum ^=num; 
//		}
//		int m = 1;
//		while((sum&m)==0) {
//			m<<=1;
//		}
//		int x=0,y=0;
//		for (int i : nums) {
//			if((i&m)!=0) {
//				x ^= i;
//			}else {
//				y ^=i;
//			}
//		}
//		return new int[] {x,y};
//	}
	
	
/**
 * 数组中除了一个数出现过1次外，其他数都出现过3次，找出那个出现过一次的数
 */
//myself review
//	public int singleNumber(int[] nums) {
//        int res = 0;
//		for (int i = 0; i < 32; i++) {
//			int oneCount = 0;
//			for (int j = 0; j < nums.length; j++) {
//				oneCount += (nums[j]&(1<<i))!=0?1:0;
//			}
//			if(oneCount%3==1) {
//				res+=1<<i;
//			}
//		}
//		return res;
//    }
	
	
	
	
	
	
	
	
	
	
	
	
}
