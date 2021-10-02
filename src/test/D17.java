package test;

import java.util.Arrays;

public class D17 {
	/**
	 * 最小的K个数
	 */
//方法一：Arrays.sort()
//	public int[] getLeastNumbers(int[] arr, int k) {
//        Arrays.sort(arr);
//        int[] res = new int[k];
//        for (int i = 0; i < k; i++) {
//			res[i] = arr[i];
//		}
//        return res;
//    }

//方法二：快排
//	public int[] getLeastNumbers(int[] arr, int k) {
//		quickSort(arr,0,arr.length-1);
//		return Arrays.copyOf(arr, k);
//    }
//	public void quickSort(int[] arr,int l,int r) {
//		//子数组长度为1时终止递归
//		if(l>=r) {
//			return ;
//		}
//		//哨兵划分操作 （以arr[l]为基准数）
//		int i=l,j=r;
//		while(i<j) {
//			while(i<j && arr[j]>=arr[l]) j--;
//			while(i<j && arr[i]<=arr[l]) i++;
//			swap(arr,i,j);
//		}
//		swap(arr,i,l);
//		//递归左右子数组执行哨兵划分
//		quickSort(arr, l, i-1);
//		quickSort(arr, i+1, r);
//	}
//	public void swap(int[] arr,int i,int j) {
//		int tmp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = tmp;
//	}

/**
 * 中位数	
 */
	
//	public MedianFinder() {
//		
//	}
//
//	public void addNum(int num) {
//		
//	}
//
//	public double findMedian() {
//		if() {
//			
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
