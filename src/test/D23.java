package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D23 {
/**
 * 有一个数出现次数超过一半（找众数）
 * @param nums
 * @return
 */
//方法一：哈希表
//	思路：1.先把所有的数的次数存进哈希表
//		2遍历哈希表找到次数超过length/2
//	public int majorityElement(int[] nums) {
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int num : nums) {
//			map.put(num, map.getOrDefault(num, 0)+1);
//		}
//		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//			if(entry.getValue()>nums.length/2) {
//				return entry.getKey();
//			}
//		}
//		return -1;
//    }
//方法二：众数
//	思路：排好序后的中位数
//	public int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//		return nums[nums.length/2];
//	}
	
/**
 * 给定一个数组，构造一个新的数组，使得每一位是除了这一位之外的其他所有数的乘积
 */
//方法一：
	public int[] constructArr(int[] a) {
		if(a==null||a.length==0) {
			return a;
		}
		int length = a.length;
		int[] res = new int[length];
		int[] leftRes = new int[length];
		int[] rightRes = new int[length];
		
		leftRes[0] = 1;
		rightRes[length-1] = 1;
		
		for (int i = 1; i < a.length; i++) {
			leftRes[i] = leftRes[i-1]*a[i-1];
		}
		for (int i = length-1; i > 0; i--) {
			rightRes[i] = rightRes[i+1]*a[i+1];
		}
		for (int i = 0; i < a.length; i++) {
			res[i] = leftRes[i]*rightRes[i];
		}
		return res;
    }
	
	
	
	
}
