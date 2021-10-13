package aaa;

public class Baidu1 {
	/**lc88
	 * 百度一面：合并两个排序数组
	 * https://leetcode-cn.com/problems/merge-sorted-array/
	 * @param nums1.length = m + n 其实要求不开辟新数组
 	 * @param m
	 * @param nums2
	 * @param n
	 */
	//方法一：从后向前比较
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int k = m+n-1;
//		while(m>0 && n>0 ){
//			if(nums1[m-1] <nums2[n-1]) {
//				nums1[k] = nums2[n-1];
//				n--;
//			}else {
//				nums1[k] = nums1[m-1];
//				m--;
//			}
//			k--;
//		}
//		for (int i = 0; i < n; i++) {
//			nums1[i] = nums2[i];
//		}
//    }
	//方法二：双指针 逆向 也是从后向前比较的思想
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int i=m-1,j=n-1;
//		int k=m+n-1;
//		int cur = 0;
//		while(i>=0||j>=0) {
//			if(i==-1) {
//				cur = nums2[j--];
//			}else if(j==-1) {
//				cur = nums1[i--];
//			}
//			else if(nums1[i]<nums2[j]) {
//				cur = nums2[j--];
//			}else {
//				cur = nums1[i--];
//			}
//			nums1[k--] = cur;
//		}
//	}
}
