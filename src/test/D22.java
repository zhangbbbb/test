package test;

import java.util.HashMap;
import java.util.Map;

public class D22 {
/**
 * ����������ֻ���ֹ�һ�ε���
 * @param nums
 * @return
 */
//����һ����ϣ��洢
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

//��������λ���� nice
//	˼·��1.�Ȱ����е�������������㣬Ȼ��õ�һ����sum��
//		2.����������λ��ֱ���ҵ���һ����1��λ����һλ˵����1 0���õ��ģ���������һλ�����з��飬��һλΪ1 ����x�飬Ϊ0����y��
//		3.�ֱ��������������㣬�õ�������x y�����ؼ���
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
 * �����г���һ�������ֹ�1���⣬�����������ֹ�3�Σ��ҳ��Ǹ����ֹ�һ�ε���
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
