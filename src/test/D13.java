package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class D13 {

	// @@����һ�� �Զ���˫ջ
//		public int[] exchange(int[] nums) {
//			 //һ��ջ��������һ��ջ��ż��
//	        Stack<Integer> stack1 = new Stack<Integer>();
//			Stack<Integer> stack2 = new Stack<Integer>();
//			for(int num:nums) {
//				if(num%2==0) {
//					stack1.push(num);
//				}else {
//					stack2.push(num);
//				}
//			}
//			int[] ns = new int[nums.length];
//			int i = 0;
//	        //��������ջ
//			while(!stack2.isEmpty()) {
//				ns[i] = stack2.pop();
//	            i++;
//	        }
//	        //����ż��ջ
//			while(!stack1.isEmpty()) {
//				ns[i++] = stack1.pop();
//			}
//			
//			return ns;
//	    }

	// @@��������˫ָ���ƶ� ����λ�� &1�ǰ�λ��
//		public int[] exchange(int[] nums) {
//			// ˫ָ���ƶ�
//			int i, j, tmp;
//			i = 0;
//			j = nums.length - 1;
	//
//			while (i < j) {
//				while (i < j && (nums[i] & 1) == 1) {
//					i++;
//				}
//				while (i < j && (nums[j] & 1) == 0) {
//					j--;
//				}
//				tmp = nums[i];
//				nums[i] = nums[j];
//				nums[j] = tmp;
//			}
//			return nums;
//		}
	// ������������ָ�� �쳣��java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds
	// for length 4
//		public int[] exchange(int[] nums) {
//		       int slow=0,fast=0;
//				while(fast<nums.length) {
//					if((nums[fast] &1)==1) {//���fast���������ͻ���ǰ��ȥ������low�����ƶ�
//						int tmp = nums[slow];
//						nums[slow] = nums[fast];
//						nums[fast] = tmp;
//						slow++;
//					}else {//fast��ż������++��ֱ���ҵ�һ������
//						fast++;
//					}
//				}
//		        return nums;
//		}
	// @@�����ģ�List����
//		public int[] exchange(int[] nums) {
//			List<Integer> list = new ArrayList<>();
//			// List�����ݴ���
//			List<Integer> list = new ArrayList<>();
//			for (int num : nums) {
//				if ((num & 1) == 1) {
//					list.add(0, num);// good ��0λ���ϼ���
//				} else {
//					list.add(num);// ֱ�Ӽ����β
//				}
//			}
//			int i = 0;
//			int[] res = new int[nums.length];
//			for (int data : list) {// ѭ�����������
//				res[i++] = data;
//			}
//			return res;
//		}

//���ʺ���ֵ����������Ч�ʵ͡�	
//	public int[] twoSum(int[] nums, int target) {
//		int another = 0;
//		List<Integer> list = new ArrayList<>();
//		for (int num : nums) {
//			list.add(num);
//		}
//		int[] res = new int[2];
//		for (int num : nums) {
//			another = target - num;
//			if (list.contains(another)) {
//				res[0] = another;
//				res[1] = num;
//			}
//		}
//		return res;
//	}
//˫ָ��   good
//	public int[] twoSum(int[] nums, int target) {
//		  int i =0,j=nums.length-1;
//		  while(i<j) {
//			  int s = nums[i]+nums[j];
//			  if(s<target) {
//				  i++;
//			  }else if(s>target){
//				  j--;
//			  }else {
//				  return new int[] {nums[i],nums[j]};
//			  }
//		  }
//		  return new int[0];
//	  }
	
	
	
	
	
	
//	public String reverseWords(String s) {
//		s = s.trim();//ɾ����λ�ո�
//		Map<String,Integer> map = new HashMap<>();
//		int i=s.length()-1,j=i;
//		StringBuilder res = new StringBuilder();
//		while(i>=0) {
//			while(i>=0 && s.charAt(i)!=' '){
//				i--;//�����׸��ո�
//			}
//			res.append(s.substring(i+1,j+1)+" ");//��ӵ���
//			while(i>=0 && s.charAt(i)==' ') {//�������ʿո�
//				i--;
//			}
//			j=i;//ָ���¸�����β�ַ�
//		}
//		return res.toString().trim();//ת��Ϊ�ַ���������
//	}

}
