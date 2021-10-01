package test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class D16 {
//方法一：快速排序
//	public String minNumber(int[] nums) {
//		String[] str = new String[nums.length];
//		for (int i = 0; i < str.length; i++) {
//			str[i] = String.valueOf(nums[i]);
//		}
//		quickSort(str,0,str.length-1);
//		StringBuilder sb = new StringBuilder();
//		for (String s : str) {
//			sb.append(s);
//		}
//		return sb.toString();
//	}
//	public void quickSort(String[] str,int l,int r) {
//		if(l>=r) {
//			return;
//		}
//		int i =l,j=r;
//		String tmp= str[i];
//		while(i<j) {
//			while(((str[l]+str[j]).compareTo(str[j]+str[l])<=0)&&i<j) {
//				j--;
//			}
//			while((str[i]+str[l]).compareTo(str[l]+str[i])<=0 && i<j) {
//				i++;
//			}
//			tmp = str[i];
//			str[i] = str[j];
//			str[j] = tmp;
//		}
//		str[i] = str[l];
//		str[l] = tmp;
//		quickSort(str, l, i-1);
//		quickSort(str, i+1, r);
//	}
	
//简化版快排
//	 public void quickSort(String[] str,int low,int high) {
//		 if(low<high) {
//			 int middle = getMiddle(str,low,high);
//			 quickSort(str, low, middle-1);
//			 quickSort(str, middle+1, high);
//		 }
//	 }
//	 public int getMiddle(String[] str,int low,int high) {
//		 String tmp = str[low];
//		 while(low<high) {
//			 while(low<high && ((str[high]+tmp).compareTo(tmp+str[high]))>=0) high--;
//			 str[low] = str[high];
//			 while(low<high && ((str[low]+tmp).compareTo(tmp+str[low]))<=0) low++;
//			 str[high] = str[low];
//		 }
//		 str[low] = tmp;
//		 return low;
//	 }
	
	
	
//方法二：小根堆
//	 public String minNumber(int[] nums) {
//		 Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return (o1+o2).compareTo(o2+o1);
//			}
//		});
//		 for(int num:nums) {
//			 queue.add(""+num);
//			 
//		 }
//		 StringBuilder res = new StringBuilder();
//		 while(!queue.isEmpty()) {
//			 res.append(queue.poll());
//		 }
//		 return res.toString();
//	 } 
	
	
	
	
	
	
	
//	public boolean isStraight(int[] nums) {
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length-1; i++) {
//			if((nums[i]+1)!=nums[i+1]) {
//				return false;
//			}
//		}
//		return true;
//    }
	
	
	
	
	
	
	
//随机给的五张扑克牌是否连续
//	public boolean isStraight(int[] nums) {
//		Set<Integer> set = new HashSet<>();
//		int max = 0,min = 14;
//		for (int num : nums) {
//			if(num==0) {
//				continue;
//			}
//			max = Math.max(num, max);
//			min = Math.min(num, min);
//			if(set.contains(num)) {
//				return false;
//			}
//			set.add(num);
//		}
//		return max-min<5;
//	}
//	
	
	
	
	
	
}
