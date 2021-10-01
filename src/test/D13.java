package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.HandlerBase;

public class D13 {

	// @@方法一： 自定义双栈
//		public int[] exchange(int[] nums) {
//			 //一个栈存奇数，一个栈存偶数
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
//	        //弹出奇数栈
//			while(!stack2.isEmpty()) {
//				ns[i] = stack2.pop();
//	            i++;
//	        }
//	        //弹出偶数栈
//			while(!stack1.isEmpty()) {
//				ns[i++] = stack1.pop();
//			}
//			
//			return ns;
//	    }

	// @@方法二：双指针移动 交换位置 &1是按位与
//		public int[] exchange(int[] nums) {
//			// 双指针移动
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
	// 方法三：快慢指针 异常：java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds
	// for length 4
//		public int[] exchange(int[] nums) {
//		       int slow=0,fast=0;
//				while(fast<nums.length) {
//					if((nums[fast] &1)==1) {//如果fast是奇数，就换到前面去，并让low继续移动
//						int tmp = nums[slow];
//						nums[slow] = nums[fast];
//						nums[fast] = tmp;
//						slow++;
//					}else {//fast是偶数就让++，直到找到一个奇数
//						fast++;
//					}
//				}
//		        return nums;
//		}
	// @@方法四：List集合
//		public int[] exchange(int[] nums) {
//			List<Integer> list = new ArrayList<>();
//			// List集合暂存结果
//			List<Integer> list = new ArrayList<>();
//			for (int num : nums) {
//				if ((num & 1) == 1) {
//					list.add(0, num);// good 在0位置上加入
//				} else {
//					list.add(num);// 直接加入表尾
//				}
//			}
//			int i = 0;
//			int[] res = new int[nums.length];
//			for (int data : list) {// 循环输出到数组
//				res[i++] = data;
//			}
//			return res;
//		}

//不适合数值过多的情况，效率低。	
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
//双指针   good
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
//		s = s.trim();//删除首位空格
//		Map<String,Integer> map = new HashMap<>();
//		int i=s.length()-1,j=i;
//		StringBuilder res = new StringBuilder();
//		while(i>=0) {
//			while(i>=0 && s.charAt(i)!=' '){
//				i--;//搜索首个空格
//			}
//			res.append(s.substring(i+1,j+1)+" ");//添加单词
//			while(i>=0 && s.charAt(i)==' ') {//跳过单词空格
//				i--;
//			}
//			j=i;//指向下个单词尾字符
//		}
//		return res.toString().trim();//转化为字符串并返回
//	}

}
