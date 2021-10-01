package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D23 {
/**
 * ��һ�������ִ�������һ�루��������
 * @param nums
 * @return
 */
//����һ����ϣ��
//	˼·��1.�Ȱ����е����Ĵ��������ϣ��
//		2������ϣ���ҵ���������length/2
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
//������������
//	˼·���ź�������λ��
//	public int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//		return nums[nums.length/2];
//	}
	
/**
 * ����һ�����飬����һ���µ����飬ʹ��ÿһλ�ǳ�����һλ֮��������������ĳ˻�
 */
//����һ��
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
